package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/view-cart")
    public String viewCart(){
        return "orders/cart";
    }

    @RequestMapping("/product/details")
    public String productDetail(){
        return "catalog/product-detail";
    }

    @PostMapping("/place-order")
    public String placeOrder(){
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String search(){
        return "redirect:https://www.google.com";
    }
}
