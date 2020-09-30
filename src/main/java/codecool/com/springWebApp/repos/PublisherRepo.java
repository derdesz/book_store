package codecool.com.springWebApp.repos;

import codecool.com.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
