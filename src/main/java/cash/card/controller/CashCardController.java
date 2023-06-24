package cash.card.controller;

import cash.card.entity.CashCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashCardController {
    @GetMapping("/cashcards/{requestedId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {
        final CashCard cashCard = new CashCard(99L, 123.45);
        return ResponseEntity.ok(cashCard);
    }
}