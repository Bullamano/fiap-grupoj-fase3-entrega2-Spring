package com.atividade3fiap.fase3.api.mapeadores;

import com.atividade3fiap.fase3.api.dto.TutorialItemDto;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import org.springframework.stereotype.Component;

@Component
public class TutorialItemMapeador {

    public TutorialItem converterParaEntidade(TutorialItemDto tutorialItemDTO) {
        TutorialItem tutorialItem = new TutorialItem();

        tutorialItem.setTitle(tutorialItemDTO.getTitle());
        tutorialItem.setMaterials(tutorialItemDTO.getMaterials());
        tutorialItem.setSteps(tutorialItemDTO.getSteps());
        tutorialItem.setImageUrl(tutorialItemDTO.getSteps());
        tutorialItem.setCategory(tutorialItemDTO.getCategory());

        return tutorialItem;
    }
}
