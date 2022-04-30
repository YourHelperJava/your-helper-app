package pl.project.yourhelperapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.project.yourhelperapp.model.Offer;

@Controller
public class OffersListController  {

@RequestMapping(value = {"/offersList"}, method = RequestMethod.GET)
    public String viewOffersList(){
    return "offersList";

  /*  @RequestMapping(value = {"/offersList"}, method = RequestMethod.GET)
    public String viewOffersList(Model model) {
        List<Offer> offersList = offerService.getOffers();
        model.addAttribute("offer", offersList);
        return "offersList";
    }*/

    //potrzebujemy serwis dla ofert z metodą get, abym mogla sobie zaladować listę w tym widoku?
}




}
