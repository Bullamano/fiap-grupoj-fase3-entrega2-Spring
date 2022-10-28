package com.atividade3fiap.fase3.api.controller;


import com.atividade3fiap.fase3.api.dto.TutorialItemDto;
import com.atividade3fiap.fase3.api.hateoas.TutorialItemAssembler;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import com.atividade3fiap.fase3.servicos.TutorialItemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorialItem")
public class TutorialItemControllerApi  {
   @Autowired
    private TutorialItemServico tutorialItemServico;
   @Autowired
    private PagedResourcesAssembler<TutorialItem> pagedResourcesAssembler;
    @Autowired
    private TutorialItemAssembler tutorialItemAssembler;

    public TutorialItemControllerApi(PagedResourcesAssembler<TutorialItem> pagedResourcesAssembler) {
        this.pagedResourcesAssembler = pagedResourcesAssembler;
    }

    @GetMapping
    public List<TutorialItem> buscarTodos() {
        List<TutorialItem> tutorialItems = tutorialItemServico.buscarTodos();

        return tutorialItems;

        //Caso seja desejada paginação, pode ser descomentada a linha abaixo e o retorno
        //trocado por CollectionModel<EntityModel<TutorialItem>>
        //return pagedResourcesAssembler.toModel(tutorialItems, tutorialItemAssembler);
    }

    @GetMapping("/{id}")
    public EntityModel<TutorialItem> buscarPorId(@PathVariable Long id) {
        TutorialItem tutorialItem = tutorialItemServico.buscarPorId(id);

        return tutorialItemAssembler.toModel(tutorialItem);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public EntityModel<TutorialItem> cadastrar(@RequestBody @Valid TutorialItemDto tutorialItemDto) {
        TutorialItem tutorialItem = tutorialItemServico.cadastrar(tutorialItemDto);

        return tutorialItemAssembler.toModel(tutorialItem);
    }

    @PutMapping("/{id}")
    public EntityModel<TutorialItem> atualizar(@RequestBody @Valid TutorialItemDto tutorialItemDto, @PathVariable Long id) {
        TutorialItem tutorialItem = tutorialItemServico.atualizar(tutorialItemDto, id);

        return tutorialItemAssembler.toModel(tutorialItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirPorId(@PathVariable Long id) {
        tutorialItemServico.excluirPorId(id);

        return ResponseEntity.noContent().build();
    }
}
