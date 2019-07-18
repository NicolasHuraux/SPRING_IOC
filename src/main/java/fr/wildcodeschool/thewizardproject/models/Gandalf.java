package fr.wildcodeschool.thewizardproject.models;

class Gandalf implements WizardInterface {


private Outfit myOutfit;

    public Gandalf(Outfit theOutfit){
        myOutfit= theOutfit;
    }
    @Override
    public String giveAdvice() {
        return "je retourne un nico";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.outfitColor();
    }

    
}