package ua.com.owu.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Avtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "avtors")
    private List<Books> books;

    public Avtor() {
    }

    public Avtor(String name) {
        this.name = name;
    }

    public Avtor(String name, List<Books> books) {
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Avtor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

