package guru.springframework.springwebapp.bootstrap;

import guru.springframework.springwebapp.Domain.Author;
import guru.springframework.springwebapp.Domain.Books;
import guru.springframework.springwebapp.repositories.AuthorRepository;
import guru.springframework.springwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       Author eric = new Author("Eric","Evans");
        Books ddd = new Books("Domain driven design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Books noEJb = new Books("j2ee Developmeny without ejb", "1232334");
        rod.getBooks().add(noEJb);
        noEJb.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJb);

    }
}
