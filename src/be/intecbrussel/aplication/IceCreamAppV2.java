package be.intecbrussel.aplication;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.0, 2.0, 2.0);
        Stock stock = new Stock(4, 5, 5, 5);
        IceCreamCar creamCar = new IceCreamCar(priceList, stock);

        Eateble[] ordered = new Eateble[6];
        int index = 0;
        try {
            ordered[index++] = creamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.LEMON});
        } catch (NoMoreIceCreamException e) {
            System.out.println("We don't have it anymore :( " + e.getMessage());
        }
        try {
            ordered[index++] = creamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        } catch (NoMoreIceCreamException e) {
            System.out.println("We don't have it anymore :( " + e.getMessage());
        }
        for (int i = 0; i < 5; i++) {
            try {
                ordered[index++] = creamCar.orderIceRocket();
            } catch (NoMoreIceCreamException e) {
                System.out.println("We don't have it anymore :( " + e.getMessage());
            }
        }
        for (Eateble e : ordered) {
            if(e != null){
                e.eat();
            }
        }
        System.out.println("Total: €" + creamCar.getProfit());
    }
}
