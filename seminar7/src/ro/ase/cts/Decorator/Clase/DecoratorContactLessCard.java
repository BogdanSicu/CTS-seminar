package ro.ase.cts.Decorator.Clase;

public class DecoratorContactLessCard extends AbstractDecorator{
    public DecoratorContactLessCard(Card card) {
        super(card);
    }

    @Override
    public void platesteContactLess() {
        System.out.println(((Card)super.getCard()).getTitlualr() + "a platit contactless");
    }
}
