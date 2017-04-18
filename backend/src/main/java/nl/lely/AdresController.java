package nl.lely;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ple20962 on 18-4-2017.
 */
@RestController
public class AdresController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/adres")
    public Adres adres(@RequestParam(value="naam", defaultValue="world") String naam,
                       @RequestParam(value="straatnaam", defaultValue="straatnaam") String straatnaam,
                       @RequestParam(value="huisnummer", defaultValue="10") long huisnummer,
                       @RequestParam(value="postcode", defaultValue="1111 AA") String postcode,
                       @RequestParam(value="plaats", defaultValue="lutjebroek") String plaats) {
        return new Adres(counter.incrementAndGet(), naam, straatnaam, huisnummer, postcode, plaats);
    }
}
