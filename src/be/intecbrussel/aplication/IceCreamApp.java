package be.intecbrussel.aplication;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.0, 2.0, 3.0);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        Eateble[] orderedIceCream = {
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE, Cone.Flavor.STRAWBERRY}),
                iceCreamSalon.orderIceRocket(),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE)
        };
        for (Eateble e : orderedIceCream){
            e.eat();
        }
        System.out.println("Total: €" + iceCreamSalon.getProfit());
    }
}