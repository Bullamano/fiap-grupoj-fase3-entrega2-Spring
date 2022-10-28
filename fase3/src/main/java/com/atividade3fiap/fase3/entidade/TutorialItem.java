package com.atividade3fiap.fase3.entidade;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "tutorialItems")
public class TutorialItem {

    /**
     * ID do tutorial
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Materiais para o tutorial
     */
    private  String title;

    /**
     * Passo-a-passo do tutorial
     */
    private String materials;

    /**
     *
     */
    private  String steps;

    /**
     * URL de uma imagem para o tutorial
     */
    private  String imageUrl;

    /**
     * Categoria do tutorial
     */
    private String category;

}
