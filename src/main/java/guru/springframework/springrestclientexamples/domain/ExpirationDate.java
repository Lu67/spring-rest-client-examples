package guru.springframework.springrestclientexamples.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExpirationDate {
	private Date date;
	private int timezoneType;
	private String timeZone; 
}
