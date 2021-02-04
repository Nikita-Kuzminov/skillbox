package core;

public class Car {
    // Создание переменной Номер автомобиля
    public String number;
    // Создание переменной Высота автомобиля
    public int height;
    // Создание переменной Вес автомобиля
    public double weight;
    // Создание переменной Проверка грузового автомобиля
    public boolean hasVehicle;
    // Создание переменной Проверка на то, является автомобиль спецмашиной
    public boolean isSpecial;

    public String toString() {
        // Создание переменной для проверки на спецтранспорт
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}