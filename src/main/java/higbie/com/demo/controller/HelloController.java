package higbie.com.demo.controller;

import org.springframework.web.bind.annotation.*;

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
        return "<form action=\"/greeting/user_greeting\" method=\"POST\">\n" +
                "  First name:<br>\n" +
                "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n" +
                "  <br>\n" +
                "  Last name:<br>\n" +
                "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n" +
                "  <br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";

    }

    @RequestMapping(value="/user_greeting", method=RequestMethod.POST)
    public String printUserGreeting(@RequestParam String firstname, String lastname){
        return "<h1>Hello there, "+ firstname + " " + lastname + "</h1>";
    }

    @RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
    public String getOrder(@PathVariable String id){
        return "Order ID: " + id;
    }
}
