package exception;

import java.io.*;

public class Main{
       public static void main(String[] args){
              String str = "Bunu dosyaya yazdir";
              File file = new File(" ");
              FileWriter fileWriter = null;

              try {
                     System.out.println("Dosyaya yazma işlemi başladı");
                     fileWriter = new FileWriter(file, false);
                     fileWriter.write(str);
                     System.out.println("Yazdırıldı.");
              }
              catch (Exception e) {
                     System.out.println("Yazdırılacak dosya yolu bulunamadı");
                     e.printStackTrace();
              }
              finally {

                     System.out.println("Finally blok iki durumda da çalışıyor.");
                     try {
                            if (fileWriter != null){
                                   fileWriter.close();
                                   System.out.println("Dosya kaptıldı");
}                     } catch (Exception e) {
                            e.printStackTrace();
                     }
              }
       }

}

