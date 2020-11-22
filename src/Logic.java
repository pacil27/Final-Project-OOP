import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Logic {
    public static int count = 0;
    public static int xwincount = 0;
    public static int owincount = 0;
    public static String[][] board = new String[3][3];
    public static String string;
    public static int x;
    public static int y;
    //Diatas adalah deklarasi variabel yang akan digunakan

    

    

    

    

    

    

    public static void gameRules(JButton button,JFrame frame) {
        //untuk mengambil huruf yang ada pada tombol
        string = button.getText();
        //maka variabel string akan terisi dengan X atau O

        //Untuk membuat koordinat dari tombol
        x = Character.getNumericValue(button.getName().charAt(1));
        y = Character.getNumericValue(button.getName().charAt(0));
        System.out.println("("+x+","+y+")" );//Menampilkan koordinat tombol di sistem
        //dengan nama tombol yang tadi (i,j), maka akan diketahui posisi nya
        board[x][y] = string;//mengubah isi array board[x][y] sesuai koordinasi nya dan string yang dipencet (X atau O)
    
        if(board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            // kondisi kemenangan diagonal '\'
           
       } else if(board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            // kondisi kemenangan diagonal '/'
           
       } else if(count == 9) {
           // kondisi seri
            
       }
        else {
           for (int i = 0; i < 3; i++) {
               if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                   //kondisi kemenangan vertical
                    
               } 
               if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                    //kondisi kemenangan horizontal
                    
               }
           }
       }  
       
    }
    /*  Setiap kemenangan akan menambahkan score dengan fungsi winCount(string),
    dimana String akan diisi dengan (X atau O),agar menambakan score dengan sesuai 
           
        Setiap selesai game maka akan tampil hasilnya dari fungsi postGame(string,0),
    dimana string akan diisi dengan (X atau O),agar tahu siapa yang menang,
    dan 0 agar tidak seri karena jika angka adalah 9 akan dideteksi seri
    
        Setiap selesai game akan dijalankan fungsi resetButton untuk mereset variabel yang diperlukan
    dan membuat frame baru agar bersih dari hasil yang sebelumnya
    */
}