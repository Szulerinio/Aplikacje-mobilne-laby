package com.example.cocktails;



public class Cocktail{
    private String name;
    private String recipe;
    private int duration;
    public static final Cocktail[] cocktails = {
            new Cocktail("Zapiekanka makaronowa z szynką",
                    " Składniki: \n 300g makaronu Penne \n 200g ulubionej szynki \n 100g sera cheddar lub parmezanu \n 100g sera mozzarella \n 125ml mleka \n 3 łyżki oliwy \n 1 papryka czerwona \n 1 cukinia \n 1 cebula \n 3 ząbki czosnku \n 1 łyżka ulubionej mieszanki przypraw \n " +
                            "\nSposób przygotowania: " +
                            "\nZagotuj wodę w garnku, gdy będzie się gotować wsyp łyżeczkę soli, a następnie wrzuć makaron i gotuj według opakowania aby był al dente. Odcedź makaron, a następnie zostaw do przestudzenia. " +
                            "\nNa patelnię wlej oliwę, drobno pokrojoną cebulę. Smaż około 5 minut. Kolejno wyłóż: czosnek w plastrach, paprykę czerwoną pokrojoną w małe kawałki, cukinię pokorjoną w półplasterki. Obsyp warzywa mieszanką przypraw, następnie całość zamieszaj i smaż około 15 minut. " +
                            "\nW dużej misce zmieszaj ugotowany makaron oraz smażone warzywa. Zetrzyj około 2/3 całego sera i wymieszaj z szynką. Następnie przełóż całość do naczynia żaro-odpornego i posyp na wierzchu resztą sera. " +
                            "\nPiecz na środkowej półce w 190 stopniach przez około 25 minut. " +
                            "\nSmacznego!", 10),
            new Cocktail("Kotlety sojowe",
                    " Składniki: \n" + " 100 g kotletów sojowych\n" + " 500 ml domowego bulionu warzywnego - dwie szklanki\n" + " 1 płaska łyżka ulubionej mieszanki przypraw\n" + " 3 łyżki bułki tartej klasycznej lub bezglutenowej \n" + " 1 płaska łyżka mąki pszennej lub owsianej\n" + " olej roślinny do smażenia\n" +
                            "\nSposób przygotowania: " +
                            "\nKotleciki umieść w misce z dwiema szklankami domowego bulionu warzywnego. Całość przykrywam talerzykiem. Co jakieś 10 minut przewracam kotleciki i przemieszczam je w misce, by szybciej zmiękły. Kolety sojowe będą idealne, gdy całkiem zmiękną i zrobią się elastyczne." +
                            "\nMięciutkie kotleciki sojowe obsyp z każdej strony odrobiną ulubionej mieszanki przypraw. W jednej, szerszej misce umieść mieszankę trzech łyżek bułki tartej i jednej łyżki mąki pszennej. Każdego kotlecika dociskaj z obu stron do mieszanki, by bułka z mąką pokryły całą powierzchnię kotleta sojowego. " +
                            "\nWlej tyle oleju do smażenia, by tylko przykryć całe dno patelni. Na nagrzany olej kładź kotlety. Zmniejsz moc palnika do średniej i smaż kotleciki na rumiano po około 1,5 minuty na stronę. " +
                            "\nSmaczmego!", 50),
            new Cocktail("Frytki z dyni",
                    "Składniki: \n 1 mała dynia Hokkaido - około 1100 g\n" + " 4 łyżki oliwy z oliwek\n" + " 1 łyżka skrobi ziemniaczanej lub kukurydzianej\n" + " przyprawy: po płaskiej łyżeczce soli, oregano i słodkiej papryki; pół łyżeczki czosnku; po płaskiej 1/3 łyżeczki pieprzu i ostrej papryki\n" + " do podania: natka pietruszki i ulubiony sos,\n" +
                            "\nSposób przygotowania: " +
                            "\nUmyj dokładnie i osusz dynię. Powoli i ostrożnie przekrój dynię Hokkaido lub dynię Piżmową na dwie połówki. Przy pomocy np. łyżki usuń ze środka całe gniazdo nasienne z miękkimi włóknami. Krój w plasterki nie szersze niż na jeden centymetr. Plastry kładź na płasko i wycinaj cienkie frytki.  Frytki umieść w naczyniu i przepłucz je zimną wodą. Na koniec zalej je bardzo zimną wodą i odstaw na  godzinę. " +
                            "\nPo tym czasie odlej całą wodę, a kawałki dyni pokrojone w cienkie słupki umieść na czystym i suchym ręczniku kuchennym lub też na ręczniku papierowym. Bardzo dokładnie osusz je z wody. Przełóż je do szerokiego naczynia. Wlej do niego cztery łyżki oliwy lub innego oleju do smażenia. Przy pomocy szczypiec wymieszaj frytki z olejem." +
                            "\nW małej miseczce umieść razem mieszankę przypraw, wymieszaj ją i posyp nią frytki. Gotowe do pieczenia frytki z dyni umieść na szerokiej i płaskiej blaszce wyłożonej papierem do pieczenia. Gotowe do pieczenia frytki z dyni umieść na szerokiej i płaskiej blaszce wyłożonej papierem do pieczenia." +
                            "\nBlaszkę z gotowymi do pieczenia frytkami wstaw do piekarnika nagrzanego do 200 stopni na środkową półkę z grzaniem góra/dół. Całkowity czas pieczenia to około 30 minut. Od razu po upieczeniu możesz wyjąć blaszkę z piekarnika. Nie zdejmuj jednak od razu frytek z blaszki. Poczekaj około pięciu minut i dopiero nakładaj porcje frytek. Dzięki temu dasz im czas na lekkie przestudzenie i frytki będą sztywniejsze i bardziej chrupiące." +
                            "\nSmacznego!",30),
};
    private Cocktail(String name, String recipe, int duration) {
        this.name = name;
        this.recipe = recipe;
        this.duration = duration;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getName() {
        return name;
    }
    public int getDuration() {
        return duration;
    }
    public String toString() {
        return this.name;
    }


}