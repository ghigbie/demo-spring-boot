package higbie.com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @RequestMapping(value="/basic", method=RequestMethod.GET)
    public String sayHello(){
        return "<h1>Hello</h1>";
    }

    @RequestMapping(value="/proper", method=RequestMethod.GET)
    public String sayProperHello(){
        return "<h1>Hello properly</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm(){
        return "<form action=\"/user_greeting\" method=\"POST\">\n" +
                "  First name:<br>\n" +
                "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n" +
                "  <br>\n" +
                "  Last name:<br>\n" +
                "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n" +
                "  <br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> "

    }

    @RequestMapping(value="/user_entry", method=RequestMethod.POST)
    public String printUserGreeting(){
        return"";
    }
}
