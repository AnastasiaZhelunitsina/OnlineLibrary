package ru.inno.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.inno.library.models.Book;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookForm {

    private String title;
    private String description;
}
