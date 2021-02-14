import core.Camera;
import core.Car;

import java.util.Scanner;

//переделать немного и скинуть переделанный вариант. Обозначить какого типа переменные объявляются

public class RoadController {
    // Создание переменной Максимальный вес пассажирского автомобиля
    private static double passengerCarMaxWeight = 3500.0; // kg
    // Создание переменной Максимальная высота пассажирского автомобиля
    private static int passengerCarMaxHeight = 2000; // mm
    // Создание переменной Максимальная допустимая высота для пункта контроля
    private static int controllerMaxHeight = 4000; // mm

    // Создание переменной Стоимость проезда пассажирской машины
    private static int passengerCarPrice = 100; // RUB
    // Создание переменной Стоимость проезда грузового автомобиля
    private static int cargoCarPrice = 250; // RUB
    // Создание переменной Дополнительная стоимость проезда грузового автомобиля
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        // Создание переменной для считывания количества автомобилей, которые будут сгенерены
        int carsCount = scanner.nextInt();

        // Создание переменной i чисто для цикла for
        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            // Создание переменной для расчёта стоимости проезда машины
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        // Создание переменной Высота автомобиля
        int carHeight = car.height;
        // Создание переменной Стоимость проезда
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            // Создание переменной Вес автомобиля
            double weight = car.weight;
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight) {
                price = passengerCarPrice;
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        } else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}