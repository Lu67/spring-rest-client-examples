package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Location {
	private String street;
	private String city;
	private String state;
	private String postcode;
}
