package pl.project.yourhelperapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.project.yourhelperapp.model.Offer;

import java.util.ArrayList;

@Controller
public class addNewOfferController {


    private static ArrayList<Offer> addOffer = new ArrayList<>();

    @PostMapping("/addNewOffer")
    public String addNewOffer(@ModelAttribute Offer offer) {
        offer.setId((long) addOffer.size() + 1 );
        addOffer.add(offer);
        System.out.println(addOffer);
        return "offersList";
    }

}



