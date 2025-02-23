package com.example.cardtemplateservice.controller;

import com.example.cardtemplateservice.model.CardTemplate;
import com.example.cardtemplateservice.service.CardTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card-template")
public class CardTemplateController {

    @Autowired
    private CardTemplateService cardTemplateService;

    @GetMapping("/{id}")
    public ResponseEntity<CardTemplate> getCardTemplateById(@PathVariable Long id) {
        return cardTemplateService.getCardTemplateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}