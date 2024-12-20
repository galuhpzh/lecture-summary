package Alpro1.Print.Lessons;

public class Print {
  public static void main(String[] args) {
          System.out.println("Hello world!");
          System.out.println("Hello world!"); // Metode ini akan menjalankan kode di garis baru
  
          System.out.print("Hello world! ");
          System.out.print("Hello world!"); // Metode ini tidak akan menjalankan kode di garis baru
  
          System.out.println("Nama: Galuh."); 
          System.out.println("Pesan: Tetaplah bernafas :)");
  
          /* Output: 
          Hello world!
          Hello world!
          Hello world! Hello world!
          Nama: Galuh 
          Pesan: Tetaplah bernafas :)
          */ 
  }
}