package beans;

import java.sql.SQLException;

public class student {
    int age,id ;
    String name;
    int height;
    int Rollno;
    String Fathername;

    student(int age,String name, int height,int Rollno,String Fatername) throws SQLException, ClassNotFoundException {
        this.age=age;
        this.height=height;
        this.name=name;
        this.Rollno=Rollno;
        this.Fathername=Fatername;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        student ne=new student(35,"Saurabh",5,35,"Ashu");
    }
}
