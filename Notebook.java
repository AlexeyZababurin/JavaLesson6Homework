// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


package GeekBrains.JAVA.Homework.ForLesson6.JavaLesson6Homework;

public class Notebook 
{
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Notebook(String model, int ram, int storage, String os, String color)
    {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }
    public String getModel()
    {
        return model;
    }
    public int getRam()
    {
        return ram;
    }
    public int getStorage()
    {
        return storage;
    }
    public String getOs()
    {
        return os;
    }
    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        String result = "Модель -> " + model + "\n" 
                        + "ОЗУ -> " + ram + "\n" 
                        + "Объем ЖД -> " + storage + "\n"
                        + "Операционная система -> " + os + "\n"
                        + "Цвет -> " + color;
        return result;
    }
}
