package Učenik;

import java.util.ArrayList;
import java.util.HashMap;

public class Učenik {
    private String fullName;
    private int age;
    HashMap<String, Integer> grades = new HashMap<String, Integer>();
    //private ArrayList<Integer> grades;
    private double average;

    @Override
    public String toString() {
        return "Učenik{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}' + "average: " + calculateAverage(grades);
    }

    public Učenik(String fullName, int age, HashMap<String, Integer> grades) {
        this.fullName = fullName;
        this.age = age;
        this.grades = grades;
        this.average = calculateAverage(grades);
    }

    public void addGrade(String predment, int grade){
        grades.put(predment, grade);
    }

    public void removeGrade(String predment){
        grades.remove(predment);
    }

    public double calculateAverage(HashMap<String, Integer> grades){
        double sum = 0;
        for (Integer grade : grades.values()) {
            sum += grade;
        }
        double average = sum / grades.size();
        return average;
    }
}
