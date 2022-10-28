package com.atividade3fiap.fase3.repositorios;

import com.atividade3fiap.fase3.entidade.TutorialItem;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TutorialItemRepositorio  extends JpaRepository<TutorialItem, Long> {

    static List<TutorialItem> findByTutorialItem(TutorialItem tutorialItem) {
        return null;
    }
}
