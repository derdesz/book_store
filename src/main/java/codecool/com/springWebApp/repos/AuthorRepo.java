package codecool.com.springWebApp.repos;

import codecool.com.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
