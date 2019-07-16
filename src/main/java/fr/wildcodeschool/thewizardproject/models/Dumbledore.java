package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface{

private Outfit myOutfit;

public Dumbledore(Outfit theOutfit){
    myOutfit= theOutfit;
}
    @Override
    public String giveAdvice() {
        return "je retourne un string";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.outfitColor();
    }

    
}