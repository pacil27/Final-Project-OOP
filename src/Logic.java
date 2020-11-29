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

    public static void winCount(String string){ //fungsi untuk menghitung jumlah menang sesuai X atau O
        if(string == "X"){
            xwincount++;
           }else if(string == "O"){
            owincount++;
        }
    }

    public static void postGame(String string,int count){ 
       //Fungsi yang dijalankan setelah game selesai untuk menampilkan box kemenangan / seri
        if(count == 9){
            JOptionPane.showMessageDialog(null, "draw.");
        }else{
            JOptionPane.showMessageDialog(null,string + " Menang.");
        }
    }

    public static void buttonClicked(JButton button) {
        //fungsi yg terdapat pada listener untuk mengubah isi button menjadi X atau O sesuai giliran
        if(button.getText().equals("")) {
            count++;
            if(count % 2 == 1) {
                button.setText("X");  
                
            }
            if(count % 2 == 0) {
                button.setText("O");
            }
        } 
    }

    public static void restartGame(JFrame frame) {
        //Fungsi yang dijalankan untuk reset game dengan mereset variabel yang diperlukan dan membuat frame yang baru
        count = 0;
        for (int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++) {
                board[x][y] = null; 
            }
        }
        string = null;
        frame.dispose();
        Gui game = new Gui();
    }

    public static void updateTurn(JLabel turn){
        //Fungsi untuk mengubah text giliran agar sesuai dengan giliran
        if(count % 2 == 1) {
            turn.setText("Giliran Ke-"+(count+1)+" (O)");     
        }
        if(count % 2 == 0) {
            turn.setText("Giliran Ke-"+(count+1)+" (X)");
        }
    }

    public static void updateScore(JLabel score,JLabel score2){
        //Fungsi untuk mengubah text score
        score.setText("X = "+xwincount);
        score2.setText("O = "+owincount);
    }

    public static void gameRules(JButton button,JFrame frame) {
        //untuk mengambil huruf yang ada pada tombol
        string = button.getText();
        //maka variabel string akan terisi dengan X atau O

        //Untuk membuat koordinat dari tombol
        x = Character.getNumericValue(button.getName().charAt(0));
        y = Character.getNumericValue(button.getName().charAt(1));
        //dengan nama tombol yang tadi (i,j), maka akan diketahui posisi nya
        board[x][y] = string;//mengubah isi array board[x][y] sesuai koordinasi nya dan string yang dipencet (X atau O)
    
        if(board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            // kondisi kemenangan diagonal '\'
            winCount(string);
            postGame(string,0);
            restartGame(frame);
       } else if(board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            // kondisi kemenangan diagonal '/'
            winCount(string);
            postGame(string,0);
            restartGame(frame);
            
       } else if(count == 9) {
           // kondisi seri
            postGame(string,9);
            restartGame(frame);
       }
        else {
           for (int i = 0; i < 3; i++) {
               if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                   //kondisi kemenangan vertical
                    winCount(string);
                    postGame(string,0);
                    restartGame(frame);
               } 
               if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                    //kondisi kemenangan horizontal
                    winCount(string);
                    postGame(string,0);
                    restartGame(frame);
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