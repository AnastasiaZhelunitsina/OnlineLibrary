package ru.inno.library.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.library.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
