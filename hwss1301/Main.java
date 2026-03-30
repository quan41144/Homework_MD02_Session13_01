package hwss1301;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Person> list = new LinkedList<>();
        int choice;
        while (true) {
            System.out.println("***************** MENU QUẢN LÝ NGƯỜI DÙNG *****************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin người dùng mới");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    list.add(new Person(name, email, phone));
                    System.out.println("Added!");
                    break;
                case 2:
                    System.out.println("Nhập tên người dùng cần xóa");
                    System.out.print("Name: ");
                    String name1 = sc.nextLine();
                    boolean isExist = false;
                    for (Person person : list) {
                        if (person.getName().trim().toLowerCase().equalsIgnoreCase(name1.toLowerCase().trim())) {
                            list.remove(person);
                            isExist = true;
                            System.out.println("Removed!");
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Không tìm thấy tên người dùng!");
                    }
                    break;
                case 3:
                    System.out.println("============== DANH SÁCH NGƯỜI DÙNG ==============");
                    for (Person person : list) {
                        person.display();
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
