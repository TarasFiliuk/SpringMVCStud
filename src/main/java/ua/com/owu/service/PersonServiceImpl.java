package ua.com.owu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.PersonDAO;
import ua.com.owu.models.Person;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDAO personDAO;

    public List<Person> findAll() {
        return personDAO.findAll();
    }

    public Person findById(int id) {
        return personDAO.findOne(id);
    }

    public void save(Person person) {
        personDAO.save(person);

    }


}
