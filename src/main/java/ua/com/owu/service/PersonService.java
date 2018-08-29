package ua.com.owu.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.com.owu.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person findById(int id);
    void save(Person person);
}
