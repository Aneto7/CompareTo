package application;

import entities.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        String path = "C:\\Users\\Antonio\\IdeaProjects\\CompareTo\\cars.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String carCsv = br.readLine();
            while (carCsv != null) {
                String[] fields = carCsv.split(",");
                list.add(new Car(fields[0], Double.parseDouble(fields[1])));
                carCsv = br.readLine();
            }
            Collections.sort(list);
            for (Car emp : list) {
                System.out.println(emp.getBrand() + ", " + emp.getTopspeed());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
