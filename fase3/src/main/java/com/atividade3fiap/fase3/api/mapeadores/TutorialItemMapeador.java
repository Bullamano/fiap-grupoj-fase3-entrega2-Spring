package com.atividade3fiap.fase3.api.mapeadores;

import com.atividade3fiap.fase3.api.dto.TutorialItemDto;
import com.atividade3fiap.fase3.entidade.TutorialItem;
import org.springframework.stereotype.Component;

/**
 * Classe para mapeamento de TutorialItem
 */
@Component
public class TutorialItemMapeador {

    /**
     * Conversor para TutorialItem
     * @param tutorialItemDTO Objeto de transferência Tutorial Item
     * @return Um objeto TutorialItem com as informações desejadas
     */
    public TutorialItem converterParaEntidade(TutorialItemDto tutorialItemDTO) {
        TutorialItem tutorialItem = new TutorialItem();

        tutorialItem.setTitle(tutorialItemDTO.getTitle());
        tutorialItem.setMaterials(tutorialItemDTO.getMaterials());
        tutorialItem.setSteps(tutorialItemDTO.getSteps());
        tutorialItem.setImageUrl(tutorialItemDTO.getImageUrl());
        tutorialItem.setCategory(tutorialItemDTO.getCategory());

        return tutorialItem;
    }
}
