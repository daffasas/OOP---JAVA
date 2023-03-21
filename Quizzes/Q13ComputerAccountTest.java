import java.util.Scanner;

public class Q13ComputerAccountTest {
    /*
       the iStudent is the 'base' i've talked about. the system can print realname,
       password. and username. User could change the new and old password, username or real name.
     */
    public static void main(String[] args) {
        Q13ComputerAccount iStudent = new Q13ComputerAccount("Fany Faizul","fannyfaizul","qwertyuiop");
        System.out.println(iStudent.getRealName());
        System.out.println(iStudent.getUserName());
        System.out.println(iStudent.getPassword());

        Scanner in = new Scanner(System.in);
        System.out.print("Put your new password : (Can't be the same as your last 5 passwords) ");
        String temp; temp = in.nextLine();
        iStudent.setPassword(temp);

        System.out.println("");
        System.out.println(iStudent.getRealName());
        System.out.println(iStudent.getUserName());
        System.out.println(iStudent.getPassword());


    }

}
