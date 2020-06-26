package test.ship;
/*Created by Aidar 06 2020*/

public class StarShip {

    /*Высота*/
    public double shipHeight;

    //добавляем конструктор для корабля
    public StarShip (double shipHeight){
        this.shipHeight=shipHeight;
    }
    //возвращаем высоту корабля
    public double getShipHeight(){
        return this.shipHeight;
    }

}