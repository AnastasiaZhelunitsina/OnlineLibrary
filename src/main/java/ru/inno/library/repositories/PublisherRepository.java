package ru.inno.library.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.library.models.Publisher;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    List<Publisher> findAllByStateNot(Publisher.State state);
}
