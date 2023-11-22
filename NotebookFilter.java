package GeekBrains.JAVA.Homework.ForLesson6.JavaLesson6Homework;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;


public class NotebookFilter 
{
    public static void main(String[] args) 
    {
        Notebook notebook1 = new Notebook("Model 1", 8, 256, "Windows10", "Black");
        Notebook notebook2 = new Notebook("Model 2", 16, 512, "Windows11", "Silver");
        Notebook notebook3 = new Notebook("Model 3", 8, 512, "MacOS", "Black");
        Notebook notebook4 = new Notebook("Model 4", 16, 256, "Linux", "Silver");
        Notebook notebook5 = new Notebook("Model 5", 32, 512, "Windows10", "Black");

        LinkedHashSet<Notebook> notebooks = new LinkedHashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        
        for (Notebook notebook : notebooks) 
        {
            System.out.println(notebook);
            System.out.println();
        }
        System.out.println("==================================");

        Map<Integer, String> mapFilter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        mapFilter.put(1, "ОЗУ");
        mapFilter.put(2, "Объем ЖД");
        mapFilter.put(3, "Операционная система");
        mapFilter.put(4, "Цвет");

        System.out.print("Введите минимальный объем ОЗУ: ");
        int ramUser = scanner.nextInt();
        System.out.print("Введите минимальный объем ЖД: ");
        int storageUser = scanner.nextInt();
        System.out.print("Введите операционную систему: ");
        String osUser = scanner.next();
        System.out.print("Введите желаемый цвет: ");
        String colorUser = scanner.next();

        scanner.close();
        System.out.println("----------------------------------");

        for (Notebook notebook : notebooks) 
        {
            if ((notebook.getRam() >= ramUser) 
                && (notebook.getStorage() >= storageUser)
                && (notebook.getOs().equals(osUser))
                && (notebook.getColor().equals(colorUser)))
            {
                System.out.println(notebook.toString());
                System.out.println();
            }
        }
    }
}
