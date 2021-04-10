package ro.ase.cts.Decorator.Program;

import ro.ase.cts.Decorator.Clase.Card;
import ro.ase.cts.Decorator.Clase.DecoratorContactLessCard;
import ro.ase.cts.Decorator.Clase.DecoratorContactLessTelefon;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("Gigel");
        card.platesteOnLine();;
        card.platestePOS();

        DecoratorContactLessCard decoratorContactLess = new DecoratorContactLessCard(card);

        System.out.println("============================================================");
        decoratorContactLess.platesteContactLess();
        decoratorContactLess.platestePOS();
        decoratorContactLess.platesteOnLine();

        System.out.println("============================================================");
        DecoratorContactLessTelefon decoratorContactLessTelefon = new DecoratorContactLessTelefon(card);
        decoratorContactLessTelefon.platesteContactLess();;
        decoratorContactLessTelefon.platesteOnLine();
        decoratorContactLess.platestePOS();
    }
}
