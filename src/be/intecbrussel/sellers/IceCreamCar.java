package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private double profit;
    private Stock stock;

    public IceCreamCar(PriceList priceList, double profit, Stock stock) {
        this.priceList = priceList;
        this.profit = 0;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        if(stock.getCones() <= 0){
            throw new NoMoreIceCreamException("No more cones in stock!");
        }
        Cone cone = prepareCone(balls);
        profit += balls.length * priceList.getBallPrice();
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        if(stock.getIceRockets() <= 0){
            throw new NoMoreIceCreamException("No more ice rocket in stock!");
        }
        IceRocket iceRocket = prepareRocket();
        profit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        if(stock.getMagnum() <= 0){
            throw new NoMoreIceCreamException("No more magnum in stock!");
        }
        Magnum magnum = prepareMagnum(type);
        profit += priceList.getMagnumPrice(type);
        return magnum;
    }

    @Override
    public double getProfit() {
        return 0;
    }
    private Cone prepareCone(Cone.Flavor[] balls){
        stock.decreaseCones();
        stock.decreaseBalls();
        return new Cone(balls);
    }
    private IceRocket prepareRocket(){
        stock.decreaseRockets();
        return new IceRocket();
    }
    private Magnum prepareMagnum(Magnum.MagnumType type){
        stock.decreaseMagnum();
        return new Magnum(type);
    }
}
