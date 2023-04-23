package com.example.basicSpringBoot.Services;

import com.example.basicSpringBoot.Model.Card;
import com.example.basicSpringBoot.Repository.CardRepository;
import com.example.basicSpringBoot.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServices {
    @Autowired
    CardRepository cardRepository;
    public  String addCard(Card card){
        if(card.getStatus()== Status.ACTIVE || card.getStatus()==Status.BLOCKED
                || card.getStatus()==Status.EXPIRED || card.getStatus()==Status.DEACTIVATED){
            cardRepository.save(card);
            return " Card Added";
        }
        return " Card Not Added. Check Status";
    }
}
