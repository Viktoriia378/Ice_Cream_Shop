package be.intecbrussel.eatables;

public class Magnum implements Eateble{
    public enum MagnumType {
        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES;
    }

    private MagnumType type;

    public Magnum(){

    }
    public Magnum(MagnumType type){
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type + " magnum.");
    }

    public MagnumType getType() {
        return type;
    }
}
