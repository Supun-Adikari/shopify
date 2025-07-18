package com.shopify.store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index.html"; // This should return the name of the view to be rendered
    }
}
