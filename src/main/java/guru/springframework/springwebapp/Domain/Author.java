package guru.springframework.springwebapp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iD;

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Books> books = new HashSet<>();


    public String getFirstName() {
        return firstName;
    }

    public Long getiD() {
        return iD;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }



    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "Author{" +
                "iD=" + iD +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(iD, author.iD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD);
    }
}
