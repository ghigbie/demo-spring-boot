package higbie.com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return"User Found! It's User: "+ userId;
    }

    @RequestMapping("/{id}/invoices")
    public String displayInvoices(@PathVariable int id,
                                  @RequestParam(value="date", required=false) Date dateOrNull){
        return"Invoice found for user: " + id + " on the date: " + dateOrNull;
    }

    @RequestMapping("/{userId}/items")
    public List<String> displayStringJson(){
        return Arrays.asList("Shoes", "laptop", "button");
    }

    @RequestMapping("/{userId}/products_as_json")
    public List<Product> displayProductsJson(){
        return Arrays.asList("Shoes", "laptop", "button");
    }
}
