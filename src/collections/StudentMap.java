package collections;

import java.util.*;

public class StudentMap {
   private int id;
   private String name;
   private  String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString(){
        return "Name: "+getName() +"& Course: "+ getCourse();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, StudentMap> map = new HashMap<>();
        for (int i=1; i <= 3; i++) {
            StudentMap student = new StudentMap();
            System.out.print("Enter the name: ");
            String name = input.next();
            student.setName(name);
            System.out.print("Enter the course: ");
            String course = input.next();
            student.setCourse(course);
            map.put(i, student);
        }

        System.out.println(map);


    }
}
