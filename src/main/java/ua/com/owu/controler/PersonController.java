package ua.com.owu.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.models.Person;
import ua.com.owu.service.PersonService;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public String index(Person person){
        personService.save(person);
    return "index";
    }
}
