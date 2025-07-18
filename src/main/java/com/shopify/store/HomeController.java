package com.shopify.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName() {  
        return "index.html"; // This should return the name of the view to be rendered
    }
}
