package CRUD.Demo.Repositories;

import CRUD.Demo.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
