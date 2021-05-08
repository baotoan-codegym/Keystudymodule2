import manager.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào bạn đến với khách sạn 5 sao Bảo Phong");
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Mời lựa chọn: \n 1. Thêm phòng trọ \n 2. Sửa phòng trọ \n 3. Xoá phòng trọ " +
                    "\n 4.Hiển thị danh sách phòng trọ đang có \n 5.Quản lý phòng \n 6.Thoát");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    manager.addRoom();
                    break;
                case 2:
                    System.out.println("Mời nhập id phòng cần sửa");
                    manager.setRoom(sc.next());
                    break;
                case 3:
                    System.out.println("Mời nhập id phòng cần xoá");
                    manager.remoteRoom(sc.next());
                    break;
                case 4:
                    manager.showRooms();
                    break;
                case 5:
                    System.out.println("Mời nhập id phòng cần quản lý");
                    manager.customerMenu(sc.next());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Đã sai mời nhập lại!!!");
                    break;
            }
        }

    }
}