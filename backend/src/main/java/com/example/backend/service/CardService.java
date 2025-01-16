package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.Card;
import com.example.backend.repository.CardRepository;

@Service
public class CardService {
    
    @Autowired
    private CardRepository cardRepository;

    public void createCard(Card card) {
        cardRepository.createCard(card);
    }

    public Card getCardById(long id) {
        return cardRepository.getCardById(id);
    }

    public List<Card> getAllCards() {
        return cardRepository.getAllCards();
    }

    public void updateCard(Card card) {
        cardRepository.updateCard(card);
    }

    public void deleteCard(long id) {
        cardRepository.deleteCard(id);
    }
}
