import test.tank.SuperTank;

public class FirstTest {

    public static void main(String[] args) {
        //создаю экземпляр класса танка
        SuperTank tank = new SuperTank();

        //задаю конкретному танку конкретное свойство
        tank.tankHeight = 253.25;
        displayHeigh(tank);
    }

    public static void displayHeigh(SuperTank tank) {
        System.out.println("Высота танка составляет : " + getSuperTankHeight(tank));
    }

        public static double getSuperTankHeight (SuperTank tank){
            return tank.tankHeight;
        }
    }