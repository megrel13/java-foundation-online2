package homework.сollections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private String title;
    private String author;
    private int numberOfPages;
}
