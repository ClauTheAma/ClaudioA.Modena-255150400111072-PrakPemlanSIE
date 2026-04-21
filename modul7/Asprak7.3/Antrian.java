import java.util.*;

public class Antrian {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Antrian Pelanggan:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat pelanggan terdepan");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Masukan Nama Pelanggan: ");
                        String name = sc.nextLine();
                        queue.add(name);
                        System.out.println(name + " ditambahkan ke antrian.");
                        break;
                    case 2:
                        if (queue.isEmpty()) {
                            System.out.println("Antrian kosong."); 
                        }else {
                            String nama = queue.poll();
                            System.out.println("Melayani pelanggan : " + nama);
                        }
                        break;
                    case 3:
                        System.out.println("Antrian Saat Ini: " + queue);
                        break;
                    case 4:
                        if (!queue.isEmpty()) {
                            System.out.println("Pelanggan terdepan: " + queue.peek());
                        } else {
                            System.out.println("Antrian kosong.");
                        }
                        break;
                    case 5:
                        System.out.println("Keluar.");
                        sc.close();
                        return;
                    default:
                        throw new Exception("Invalid input.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.next(); // consume newline
            }
        }
    }
}