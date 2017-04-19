package nl.lely.controllers;

import nl.lely.entities.Greeting;
import nl.lely.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ple20962 on 18-4-2017.
 */
@RestController
public class GreetingController {

    @Autowired
    GreetingRepository repository;

    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(String.format(template, name));
    }

    @RequestMapping("/save")
    public String process() {
        repository.save(new Greeting("World!"));
        repository.save(new Greeting("Patricia"));
        repository.save(new Greeting("Sander"));
        return "Done";
    }

    @RequestMapping("/findall")
    public String findAll() {
        String result = "<html>";
        for (Greeting greeting : repository.findAll()) {
            result += "<div>" + greeting.toString() + "</div>";
        }
        return result + "</html>";
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam(value="id") long id) {
        return repository.findOne(id).toString();
    }

    @RequestMapping("/findbycontent")
    public String findByContent(@RequestParam(value="content") String content) {
        String result = "<html>";
        for (Greeting greeting : repository.findByContent(content)) {
            result += "<div>" + greeting.toString() + "</div>";
        }
        return result + "</html>";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id") long id) {
        String item = repository.findOne(id).toString();
        repository.delete(id);
        return item + " verwijderd!";
    }
}
