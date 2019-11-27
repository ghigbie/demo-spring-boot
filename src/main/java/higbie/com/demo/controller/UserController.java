package higbie.com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return"User Found! It's User: "+ userId;
    }

    @RequestMapping("/{userId}/invoices")
    public String displayInvoices(@PathVariable int userId, @RequestParam Date date){
        return"Invoice found for user: " + userId + " on the date: " + date;
    }
}
