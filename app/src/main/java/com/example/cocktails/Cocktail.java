package com.example.cocktails;



public class Cocktail{
    private String name;
    private String recipe;
    public static final Cocktail[] cocktails = {
            new Cocktail("Bloody Mary", "Składniki: \n 40 ml wódki \n 10 ml soku z cytryny \n 120 ml soku pomidorowego \n sos worchestershire \n sól \n pieprz \n tabasco \n gałązka selera naciowego \n\n Sposób przygotowania: \n Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym."),

};
    private Cocktail(String name, String recipe) {
        this.name = name;
        this.recipe = recipe;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }


}