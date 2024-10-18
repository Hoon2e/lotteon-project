package com.team1.lotteon.controller.product;

import com.team1.lotteon.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Log4j2
@Controller
@RequiredArgsConstructor
public class ProductController {
    private final UserService userService;

    @GetMapping("/product/{cate}")
    public String index(@PathVariable String cate, Model model){

        log.info("product/{} 접속", cate);
        log.info(cate);
        model.addAttribute("cate", cate);


        return "product/layout/product_layout";
    }
}
