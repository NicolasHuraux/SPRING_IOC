package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface{

private Outfit myOutfit;
@Autowired
public Dumbledore(Outfit theOutfit){
    myOutfit= theOutfit;
}
    @Override
    public String giveAdvice() {
        return "je retourne une baguette";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.outfitColor();
    }

    
}