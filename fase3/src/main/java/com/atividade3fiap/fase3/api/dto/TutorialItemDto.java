package com.atividade3fiap.fase3.api.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;

@Getter @Setter
public class TutorialItemDto {

    @NotNull
    @Size(min = 3, max = 100)
    private  String title;

    @NotNull
    @Size(min = 3, max = 500)
    private String materials;

    @NotNull
    @Size(min = 3, max = 500)
    private  String steps;

    @NotNull
    @Size(min = 3, max = 500)
    private  String imageUrl;

    @NotNull
    @Size(min = 3, max = 100)
    private String category;
}
