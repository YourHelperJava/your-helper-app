package pl.project.yourhelperapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.project.yourhelperapp.model.Offer;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getHome() {
        return "offersList";
    }

    @GetMapping("/offersList")
    public String getOffersList() {
        return "offersList";
    }

    @GetMapping("/addNewOffer")
    public String getAddNewOffer(Model model){
        model.addAttribute("offer", new Offer());
        return "addNewOffer";
    }

    @GetMapping("/detailedOffer")
    public String getDetailedOffer() {
        return "detailedOffer";
    }

    @GetMapping("/reservedOffersList")
    public String getReservedOffersList() {
        return "reservedOffersList";
    }


}
