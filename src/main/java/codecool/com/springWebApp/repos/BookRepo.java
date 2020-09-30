package codecool.com.springWebApp.repos;

import codecool.com.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
