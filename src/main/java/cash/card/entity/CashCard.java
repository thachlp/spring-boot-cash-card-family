package cash.card.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class CashCard {
    @Id
    private Long id;
    private Double amount;
}
