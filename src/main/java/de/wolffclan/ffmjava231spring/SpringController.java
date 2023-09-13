package de.wolffclan.ffmjava231spring;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class SpringController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String getHelloMessage(@PathVariable String name){
        return "Hello wie geht es dir, " + name;
    }

    @GetMapping("")
}
