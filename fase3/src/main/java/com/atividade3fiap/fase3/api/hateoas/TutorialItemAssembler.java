package com.atividade3fiap.fase3.api.hateoas;

import com.atividade3fiap.fase3.api.controller.TutorialItemControllerApi;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler;
import org.springframework.stereotype.Component;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class TutorialItemAssembler implements SimpleRepresentationModelAssembler<TutorialItem> {

    @Override
    public void addLinks(EntityModel<TutorialItem> resource) {
        Long id = resource.getContent().getId();

        Link selfLink = linkTo(methodOn(TutorialItemControllerApi.class).buscarPorId(id))
                .withSelfRel()
                .withType("GET");

        Link editarLink = linkTo(methodOn(TutorialItemControllerApi.class).atualizar(null, id))
                .withSelfRel()
                .withType("PUT");

        Link excluirLink = linkTo(methodOn(TutorialItemControllerApi.class).excluirPorId(id))
                .withSelfRel()
                .withType("DELETE");

        resource.add(selfLink, editarLink, excluirLink);
    }

    @Override
    public void addLinks(CollectionModel<EntityModel<TutorialItem>> resources) {
        Link cadastroLink = linkTo(methodOn(TutorialItemControllerApi.class).cadastrar(null))
                .withSelfRel()
                .withType("POST");

        Link selfLink = linkTo(methodOn(TutorialItemControllerApi.class).buscarTodos())
                .withSelfRel()
                .withType("GET");

        resources.add(selfLink, cadastroLink);
    }

}
