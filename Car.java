/**
 Написать класс «автомобиль», который должен
 уметь заводится, глушить мотор, ехать и держать
 необходимую скорость
 */
public class Car {
    private boolean engineState;
    private int speed;

    public void setEngineState(boolean engineState){
        this.engineState = engineState;
    }

    public boolean isEngineState(){
        return this.engineState;
    }

    public void setSpeed(int speed){
        if (engineState){
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getCarOverall(){
        StringBuilder carOverall = new StringBuilder();
        if (this.engineState){
            carOverall.append("engine is working and the speed is " + this.speed);
        } else {
            carOverall.append("engine is stopped");
        }

        return carOverall.toString();
    }

    public static void main(String[] args){
        Car car = new Car();
        car.setEngineState(true);
        car.setSpeed(40);
        System.out.println(car.getCarOverall());

        car = new Car();
        System.out.print(car.getCarOverall());
    }
}
