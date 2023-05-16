package com.example.java5_lap_2.controller;

import com.example.java5_lap_2.model.ProductEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProdController {
    @RequestMapping("/form")
    public String getForm(Model model) {
        ProductEntity prod = new ProductEntity();
        prod.setName("IPhone 13");
        prod.setPrice(5000.0);
        model.addAttribute("model", prod);
        return "formProd";
    }

    @PostMapping("/save")
    public String saveProd(@ModelAttribute("prod") ProductEntity prod) {
        return "formProd";
    }

    @ModelAttribute("list")
    public List<ProductEntity> getList() {
        return Arrays.asList(new ProductEntity("Samsung A32", 1000.0), new ProductEntity("IPhone 14", 4000.0));
    }
}
