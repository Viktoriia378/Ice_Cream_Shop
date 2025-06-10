package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eateble{
    public enum Flavor {
        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
    }
    private Flavor[] balls;

    public Cone(){

    }
    public Cone(Flavor[] balls){
        this.balls = balls;
    }
    @Override
    public void eat() {
        System.out.println("Eating a " + Arrays.toString(balls) + " magnum.");
    }
}
