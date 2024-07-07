package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
     int roll;
     int marks;
     String name;
     Student(int r, int m, String n){
         roll = r;
         marks = m;
         name = n;
     }
     int getRoll(){
         return roll;
     }
     String getName(){
         return name;
     }
     int getMarks(){
         return marks;
     }
     @Override
        public String toString(){
            return roll + " " + name + " " + marks;
        }
}
class test{
    public static void main(String[]args){
        Student arr[] = {
                new Student(1, 100, "hossei"),
                new Student(2, 90, "zala"),
                new Student(3, 80, "dewa"),
        };

        // Converting array to list using stream
        double result = Arrays.stream(arr)
                .mapToInt(x -> x.getMarks())
                .average()
                .getAsDouble();
        System.out.println("Average marks: " + result);

        // Converting array to map using stream
        Map<Integer, String> map = Arrays.stream(arr)
                .collect(Collectors.toMap(Student::getRoll, Student::getName));
        System.out.println("Roll no and name: " + map);

        // Grouping students by marks
        Map<Integer, List<Student>> m = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Student::getMarks));
        System.out.println("Marks and students: " + m);
    }
}
