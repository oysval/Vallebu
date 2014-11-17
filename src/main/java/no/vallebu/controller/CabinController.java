package no.vallebu.controller;

import no.vallebu.types.Cabin;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ovalle on 17/11/14.
 */
@RequestMapping("/api/**")
@RestController
public class CabinController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Cabin index() {
        return new Cabin("Vallebu", "870");
    }
}
