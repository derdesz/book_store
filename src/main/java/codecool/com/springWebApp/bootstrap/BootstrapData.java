package codecool.com.springWebApp.bootstrap;

import codecool.com.springWebApp.model.Author;
import codecool.com.springWebApp.model.Book;
import codecool.com.springWebApp.model.Publisher;
import codecool.com.springWebApp.repos.AuthorRepo;
import codecool.com.springWebApp.repos.BookRepo;
import codecool.com.springWebApp.repos.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;


    public BootstrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("publisher", "1146. Bp. Erzsébet királyné útja 1/A");
        publisherRepo.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "213164");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);


        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepo.save(eric);
        bookRepo.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "453453");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepo.save(rod);
        bookRepo.save(noEJB);
        //publisherRepo.save(publisher);


        System.out.println("number of books: " + bookRepo.count());
        System.out.println(publisher.getBooks().size());


//        publisher.getBooks().add(noEJB);

//        publisher.getBooks().add(ddd);

//        publisherRepo.save(publisher);
//        authorRepo.save(eric);
//        bookRepo.save(ddd);
//
//        System.out.println(bookRepo.count());
//        System.out.println(publisher.getBooks().size());
//        System.out.println(noEJB.getPublisher().getName());


    }
}
