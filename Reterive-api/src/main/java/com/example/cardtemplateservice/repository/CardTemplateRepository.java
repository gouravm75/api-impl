package com.example.cardtemplateservice.repository;

import com.example.cardtemplateservice.model.CardTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTemplateRepository extends JpaRepository<CardTemplate, Long> {
}