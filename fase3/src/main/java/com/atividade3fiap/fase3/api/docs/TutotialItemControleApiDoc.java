package com.atividade3fiap.fase3.api.docs;

import com.atividade3fiap.fase3.api.dto.TutorialItemDto;
import com.atividade3fiap.fase3.api.excecoes.ApiErro;
import com.atividade3fiap.fase3.api.excecoes.ValidacaoApiErro;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import springfox.documentation.annotations.ApiIgnore;


@Api(tags = "TutorialItem")
public interface TutotialItemControleApiDoc {

    @ApiOperation(value = "Listar todos os tutorialItems")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Listagem de tutorialItems realizada com sucesso")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pagina", dataType = "int", paramType = "query", defaultValue = "1", value = "Número da página que deseja recuperar (1..N)"),
            @ApiImplicitParam(name = "tamanho", dataType = "int", paramType = "query", defaultValue = "2", value = "Número de elementos por página."),
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query", value = "Criterio de ordenação no formato: propriedade(,asc|desc).")
    })
    CollectionModel<EntityModel<TutorialItem>> buscarTodos(@ApiIgnore Pageable paginacao);

    @ApiOperation(value = "Buscar tutorialItem por ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "TutorialItem encontrado com sucesso"),
            @ApiResponse(code = 404, message = "TutorialItem não encontrado", response = ApiErro.class)
    })
    EntityModel<TutorialItem> buscarPorId(Long id);

    @ApiOperation(value = "Cadastrar tutorialItem")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "TutorialItem cadastrado com sucesso"),
            @ApiResponse(code = 400, message = "Houveram erros de validação", response = ValidacaoApiErro.class)
    })
    EntityModel<TutorialItem> cadastrar(TutorialItemDto tutorialItemDTO);

    @ApiOperation(value = "Atualizar tutorialItem")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "TutorialItem atualizado com sucesso"),
            @ApiResponse(code = 400, message = "Houveram erros de validação", response = ValidacaoApiErro.class),
            @ApiResponse(code = 404, message = "TutorialItem não encontrado", response = ApiErro.class)
    })
    EntityModel<TutorialItem> atualizar(TutorialItemDto tutorialItemDTO, Long id);

    @ApiOperation(value = "Excluir tutorialItem")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "TutorialItem excluido com sucesso"),
            @ApiResponse(code = 404, message = "TutorialItem não encontrado")
    })
    ResponseEntity<?> excluirPorId(Long id);
}
