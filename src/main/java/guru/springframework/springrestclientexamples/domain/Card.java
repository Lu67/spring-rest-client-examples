package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Card {
	private String type;
	private long number;
	private ExpirationDate expirationDate;
	private String iban;
	private String swift;
}
