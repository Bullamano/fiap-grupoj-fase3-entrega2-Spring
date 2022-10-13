package com.atividade3fiap.fase3.servicos;

import com.atividade3fiap.fase3.api.dto.TutorialItemDto;
import com.atividade3fiap.fase3.api.excecoes.TutorialItemNaoEncontradoException;
import com.atividade3fiap.fase3.api.excecoes.TutorialItemPossuiItensException;
import com.atividade3fiap.fase3.api.mapeadores.TutorialItemMapeador;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import com.atividade3fiap.fase3.repositorios.TutorialItemRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TutorialItemServico {


    private TutorialItemRepositorio tutorialItemRepositorio;

    private TutorialItemMapeador tutorialItemMapeador;

    public TutorialItemServico(TutorialItemRepositorio tutorialItemRepositorio) {
        this.tutorialItemRepositorio = tutorialItemRepositorio;
    }

    public TutorialItemServico(TutorialItemMapeador tutorialItemMapeador) {
        this.tutorialItemMapeador = tutorialItemMapeador;
    }

    public List<TutorialItem> buscarTodos() {
        return tutorialItemRepositorio.findAll();
    }

    public Page<TutorialItem> buscarTodos(Pageable paginacao) {
        return tutorialItemRepositorio.findAll(paginacao);
    }

    public TutorialItem buscarPorId(Long id) {
        TutorialItem tutorialItemEncontrado = tutorialItemRepositorio.findById(id)
                .orElseThrow(() -> new TutorialItemNaoEncontradoException(id));

        return tutorialItemEncontrado;
    }

    public TutorialItem cadastrar(TutorialItem tutorialItem) {
        return tutorialItemRepositorio.save(tutorialItem);
    }

    public TutorialItem cadastrar(TutorialItemDto tutorialItemDTO) {
        TutorialItem tutorialItem = tutorialItemMapeador.converterParaEntidade(tutorialItemDTO);

        return tutorialItemRepositorio.save(tutorialItem);
    }

    public TutorialItem atualizar(TutorialItem tutorialItem, Long id) {
        buscarPorId(id);

        return tutorialItemRepositorio.save(tutorialItem);
    }

    public TutorialItem atualizar(TutorialItemDto tutorialItemDTO, Long id) {
        buscarPorId(id);

        TutorialItem tutorialItem = tutorialItemMapeador.converterParaEntidade(tutorialItemDTO);
        tutorialItem.setId(id);

        return tutorialItemRepositorio.save(tutorialItem);
    }

    public void excluirPorId(Long id) {
        TutorialItem tutorialItemEncontrado = buscarPorId(id);

        if (!TutorialItemRepositorio.findByTutorialItem(tutorialItemEncontrado).isEmpty()) {
            tutorialItemRepositorio.delete(tutorialItemEncontrado);

        }

    }

}
