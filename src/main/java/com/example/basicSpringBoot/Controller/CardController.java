package com.example.basicSpringBoot.Controller;

import com.example.basicSpringBoot.Model.Card;
import com.example.basicSpringBoot.Services.CardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardServices cardServices;
    @PostMapping("/add")
    public String addCard(@RequestBody Card card){
        return cardServices.addCard(card);
    }
}
