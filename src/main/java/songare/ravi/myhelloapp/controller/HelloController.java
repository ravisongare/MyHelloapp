package songare.ravi.myhelloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello(){
        System.out.println("Inside hello method");
        return "Hello world";

    }

    @GetMapping("/hello/name")
    String helloWithQp(@RequestParam String name){
        System.out.println("Inside hello method:"+name);
        return "Hello "+name+" !";

    }
}
