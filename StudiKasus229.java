import java.util.Scanner;

public class StudiKasus229 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen, juara, pkm;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA)  : ");
        jenis = sc.nextLine().toUpperCase();
         if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            dokumen = sc.nextInt();
            System.out.print("Juara : ");
            juara = sc.nextInt();

 
            if (juara >= 1 && juara <= 3) {                 
                if (dokumen == 4) {                         
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }


    






        
        
        
        
        sc.close();
         
     }
}