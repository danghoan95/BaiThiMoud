package BaiThi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StudentMannager studentMannager =new StudentMannager();
        int choie ;
        do{
            System.out.println("--- Chương Trình Quản lý Sinh Viên---");
            System.out.println("Chọn Chức Năng Theo số (để tiếp tục)");
            System.out.println("1.Display student :");
            System.out.println("2.Add student");
            System.out.println("3. Edit student");
            System.out.println("4.Delete student");
            System.out.println("5.Sort student");
            System.out.println("6.Read file");
            System.out.println("7. Ghi file");
            System.out.println("8. Exit");
            System.out.println("Enter choie");
            choie =Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choie){
                case 1:
                    System.out.println("1.Display student :");
                    studentMannager.displayStudent();
                    break;
                case 2:
                    System.out.println("2.Add student");
                    studentMannager.addStudent();
                    break;
                case 3:
                    System.out.println("3. Edit student");
                    studentMannager.editStudent();
                    break;
                case 4:
                    System.out.println("4.Delete student");
                    studentMannager.deleteStudent();
                    break;
                case 5:
                    System.out.println("5.Sort student");
                    studentMannager.sortMediumScore();
                    break;
                case 6:
                    System.out.println("6.Read file");
                     studentMannager.readFile();
                     break;
                case 7:
                    System.out.println("7. Ghi file");
                     studentMannager.write();
                     break;
                case 8:
                    System.out.println("8. Exit");
                    System.exit(0);
                    break;
            }
        }while (choie!=0);
    }
}
