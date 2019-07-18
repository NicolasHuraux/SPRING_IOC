
package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
class Gandalf implements WizardInterface {


private Outfit myOutfit;
    @Autowired
    public Gandalf(Outfit theOutfit){
        myOutfit= theOutfit;
    }
    @Override
    public String giveAdvice() {
        return "je retourne un frodon";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.outfitColor();
    }

    
}