package core;

public class Camera {
    public static Car getNextCar() {
        // Создание переменной для генерирования рандомного номера авто
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        // Создание переменной для генерирования рандомной высоты авто
        int randomHeight = (int) (1000 + 3500. * Math.random());
        // Создание переменной для генерирования рандомного веса авто
        double randomWeight = 600 + 10000 * Math.random();

        Car car = new Car();
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = randomWeight;
        car.hasVehicle = Math.random() > 0.5;
        car.isSpecial = Math.random() < 0.15;

        return car;
    }
}