package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private double profit;
    private Stock stock;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if(stock.getCones() <= 0){
            throw new NoMoreIceCreamException("No more cones in stock!");
        }
        if(stock.getBalls() <= 0){
            throw new NoMoreIceCreamException("No more ice balls in stick!");
        }
        stock.decreaseCones();
        stock.decreaseBalls(flavors.length);
        profit += flavors.length * priceList.getBallPrice();
        return prepareCone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        if(stock.getIceRockets() <= 0){
            throw new NoMoreIceCreamException("No more ice rocket in stock!");
        }
        stock.decreaseRockets();
        profit += priceList.getRocketPrice();
        return prepareRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        if(stock.getMagnum() <= 0){
            throw new NoMoreIceCreamException("No more magnum in stock!");
        }
        stock.decreaseMagnum();
        profit += priceList.getMagnumPrice(type);
        return prepareMagnum(type);
    }

    @Override
    public double getProfit() {
        return 0;
    }
    private Cone prepareCone(Cone.Flavor[] flavors){
        return new Cone(flavors);
    }
    private IceRocket prepareRocket(){
        return new IceRocket();
    }
    private Magnum prepareMagnum(Magnum.MagnumType type){
        return new Magnum(type);
    }
}
