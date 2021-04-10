package ro.ase.cts.Decorator.Clase;

public class DecoratorContactLessTelefon extends AbstractDecorator{
    public DecoratorContactLessTelefon(Card card) {
        super(card);
    }

    @Override
    public void platesteContactLess() {
        System.out.println(((Card)super.getCard()).getTitlualr() + "a platit cu telefonul");
    }
}
