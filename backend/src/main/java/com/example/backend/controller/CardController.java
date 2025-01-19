package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.Card;
import com.example.backend.service.CardService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cards")
public class CardController {
 @Autowired
    private CardService cardService;

    // Create a new Card
    @PostMapping
    public ResponseEntity<String> createCard(@RequestBody Card card) {
        cardService.createCard(card);
        return ResponseEntity.status(HttpStatus.CREATED).body("Card created successfully.");
    }

    // Get a Card by ID
    @GetMapping("/{id}")
    public ResponseEntity<Card> getCardById(@PathVariable long id) {
        Card card = cardService.getCardById(id);
        return ResponseEntity.ok(card);
    }

    // Get all Cards
    @GetMapping
    public ResponseEntity<List<Card>> getAllCards() {
        List<Card> cards = cardService.getAllCards();
        return ResponseEntity.ok(cards);
    }

    // Update a Card
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCard(@PathVariable long id, @RequestBody Card card) {
        card.setId(id);
        cardService.updateCard(card);
        return ResponseEntity.ok("Card updated successfully.");
    }

    // Delete a Card
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCard(@PathVariable long id) {
        cardService.deleteCard(id);
        return ResponseEntity.ok("Card deleted successfully.");
    }
}
