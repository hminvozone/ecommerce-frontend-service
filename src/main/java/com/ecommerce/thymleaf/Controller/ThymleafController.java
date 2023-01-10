package com.ecommerce.thymleaf.Controller;

import com.ecommerce.thymleaf.Service.IWishListConsumeService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/api")
public class ThymleafController {

    private final IWishListConsumeService iWishListConsumeService;

    public ThymleafController(IWishListConsumeService iWishListConsumeService) {
        this.iWishListConsumeService = iWishListConsumeService;
    }

    @GetMapping("/wishlist/{wishlist_id}")
    public String GetView(@PathVariable("wishlist_id") Long wishlist_id, Model model){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("wishlist");
//        model.addAttribute("wishlist", iWishListConsumeService.consumeWishlistProducts(wishlist_id));
        return "wishlist";
    }
}
