package pl.szymanski.laboratory2019;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }
}
