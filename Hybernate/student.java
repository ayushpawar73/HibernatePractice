import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.sun.org.apache.xerces.internal.util.DOMUtil.setVisible;

public class student {
    int age;
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

    String query1="insert into customer values('"+name+"','"+age+"','"+height+"','"+Rollno+"','"+Fathername+"')";



//    try
//
//    {
//        Conn c = new Conn();
//        PreparedStatement ps, ps2;
//        ps = c.cn.prepareStatement(query1);
//        ps.executeUpdate();
//
////    tfname.setText("");
//    }
//   catch (Exception ae){
//        ae.printStackTrace();
//    }
}





