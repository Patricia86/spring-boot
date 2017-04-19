package nl.lely.repositories;

import nl.lely.entities.Greeting;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ple20962 on 18-4-2017.
 */
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    List<Greeting> findByContent(String content);
}
