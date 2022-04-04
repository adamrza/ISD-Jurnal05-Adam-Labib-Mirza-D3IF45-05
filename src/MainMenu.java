import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ToDoList todoList = new ToDoList();
        ToDoList dotoList = new ToDoList();
        boolean out = false;
        int choose;

        while (!out) {
            System.out.println("----Menu----");
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Tampilkam pekerjaan");
            System.out.println("3. Hapus pekerjaan");
            System.out.println("4. Cetak List");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Pilih menu: ");

            choose = s.nextInt();
            s.nextLine();
            System.out.println();

            switch (choose) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan: ");
                    String namaPekerjaan = s.next();
                    todoList.listDo(namaPekerjaan);
                    System.out.println("");
                    break;
                case 2:
                    todoList.print();
                    System.out.println("");
                    break;
                case 3:
                    todoList.doList();
                    System.out.println("Pekerjaan berhasil dihapus");
                    System.out.println("");
                    break;
                case 4:
                    dotoList.doList();
                    System.out.println("");
                    break;
                case 5:
                    out = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia, Coba lagi!");
            }
        }
    }
}