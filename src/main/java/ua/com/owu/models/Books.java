package ua.com.owu.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Avtor> avtors;
    @ManyToOne(fetch = FetchType.LAZY)
    private Person people;

    public Books() {
    }

    public Books(String name) {
        this.name = name;
    }

    public Books(String name, List<Avtor> avtors, Person people) {
        this.name = name;
        this.avtors = avtors;
        this.people = people;
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

    public List<Avtor> getAvtors() {
        return avtors;
    }

    public void setAvtors(List<Avtor> avtors) {
        this.avtors = avtors;
    }

    public Person getPeople() {
        return people;
    }

    public void setPeople(Person people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
