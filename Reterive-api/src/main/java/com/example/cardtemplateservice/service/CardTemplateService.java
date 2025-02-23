package com.example.cardtemplateservice.service;

import com.example.cardtemplateservice.model.CardTemplate;
import com.example.cardtemplateservice.repository.CardTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardTemplateService {

    @Autowired
    private CardTemplateRepository cardTemplateRepository;

    public Optional<CardTemplate> getCardTemplateById(Long id) {
        return cardTemplateRepository.findById(id);
    }
}