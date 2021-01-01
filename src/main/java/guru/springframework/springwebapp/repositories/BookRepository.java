package guru.springframework.springwebapp.repositories;

import guru.springframework.springwebapp.Domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Long> {
}
