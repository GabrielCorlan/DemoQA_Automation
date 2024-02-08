package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Constants {

    URL("https://demoqa.com/books"),
    USERNAME("gabiX"),
    PASSWORD("TestPass123*");

    private final String value;
}
