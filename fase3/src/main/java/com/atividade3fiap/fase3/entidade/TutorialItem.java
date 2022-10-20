package com.atividade3fiap.fase3.entidade;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.server.core.Relation;

@Getter @Setter
@Entity
@Table(name = "tutorialItens")
public class TutorialItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private  String title;
    private String materials;
    private  String steps;
    private  String imageUrl;
    private String category;

}
