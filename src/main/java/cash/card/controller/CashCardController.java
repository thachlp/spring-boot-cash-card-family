package cash.card.controller;

import cash.card.entity.CashCard;
import cash.card.repository.CashCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CashCardController {
    private final CashCardRepository cashCardRepository;

    @GetMapping("/cashcards/{requestedId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {
        final Optional<CashCard> cashCardOptional = cashCardRepository.findById(requestedId);
        if (cashCardOptional.isPresent()) {
            return ResponseEntity.ok(cashCardOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
