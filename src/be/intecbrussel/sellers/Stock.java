package be.intecbrussel.sellers;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magnum;


    public int getIceRockets() {return iceRockets;}

    public void setIceRockets(int iceRockets) {this.iceRockets = iceRockets;}

    public int getCones() {return cones;}

    public void setCones(int cones) {this.cones = cones;}

    public int getBalls() {return balls;}

    public void setBalls(int balls) {this.balls = balls;}

    public int getMagnum() {return magnum;}

    public void setMagni(int magni) {this.magnum = magni;}

    public void decreaseCones(){
        this.cones--;
    }
    public void decreaseRockets(){
        this.iceRockets--;
    }
    public void decreaseMagnum(){
        this.magnum--;
    }
    public void decreaseBalls(int amount){
        if(balls >= amount){
            balls -= amount;
        } else {
            throw new NoMoreIceCreamException("Not enough ice cream balls in stock!");
        }
    }

}
