package com.atividade3fiap.fase3.api.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;

/**
 * DTO de Tutorial Item
 */
@Getter @Setter
public class TutorialItemDto {

    /**
     * ID do tutorial
     */
    @NotNull
    @Size(min = 3, max = 100)
    private  String title;

    /**
     * Materiais para o tutorial
     */
    @NotNull
    @Size(min = 3, max = 500)
    private String materials;

    /**
     * Passo-a-passo do tutorial
     */
    @NotNull
    @Size(min = 3, max = 500)
    private  String steps;

    /**
     * URL de uma imagem para o tutorial
     */
    @NotNull
    @Size(min = 3, max = 500)
    private  String imageUrl;

    /**
     * Categoria do tutorial
     */
    @NotNull
    @Size(min = 3, max = 100)
    private String category;
}
