package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {}

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type == Magnum.MagnumType.ALPINENUTS) {
            return magnumStandardPrice * 1.5;
        }
        if (type == Magnum.MagnumType.ROMANTICSTRAWBERRIES) {
            return magnumStandardPrice * 1.2;
        }
        if (type == Magnum.MagnumType.BLACKCHOCOLATE) {
            return magnumStandardPrice * 0.75;
        }
        if (type == Magnum.MagnumType.WHITECHOCOLATE) {
            return magnumStandardPrice * 0.75;
        }
        if(type == Magnum.MagnumType.MILKCHOCOLATE){
            return magnumStandardPrice * 0.85;
        }
        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}