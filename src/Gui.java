import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui {
    public Gui() {
        JFrame frame = new JFrame("TicTacToe Game");//Membuat frame bertuliskan"TicTacToe Game"
        JPanel panel = new JPanel();//Membuat panel untuk tampilan nya nanti
        JLabel turn = new JLabel("Giliran Ke- 1 (X)");//Membuat label(tulisan) untuk mengetahui giliran
        JLabel p1score = new JLabel("X = 0");//Membuat label(tulisan) untuk mengetahui score
        JLabel p2score = new JLabel("O = 0");//Membuat label(tulisan) untuk mengetahui score
        panel.add(turn);//menambahkan label turn ke panel
        panel.add(p1score);//menambahkan label p1score ke panel
        panel.add(p2score);//menambahkan label p2score ke panel
        panel.setLayout(new java.awt.GridLayout(6, 3));//Mensetting layout panel
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Mensetting frame agar exit ketika di close
        
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) { //Looping 9 kali (3x3)
                JButton button = new JButton(); //Membuat tombol per loop nya
                String string = i + "" + j;
                button.setText("");//Tombol dituliskan kosong
                button.setName(string);//Membuat nama tombol sesuai dengan posisi nya di loop
                button.addActionListener(//Membuat Listener untuk tombol nya
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) { //Ketika tombol di klik akan menjalankan fungsi dibawah
                            
                    
                        }
                    });
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));//Membuat border untuk tombol nya
                panel.add(button);//Menambahkan tombol ke panel per loop nya
            }
        }
        JButton reset = new JButton(); //Membuat tombol untuk reset
        reset.setText("Reset");
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){//Ketika tombol di klik akan menjalankan fungsi dibawah
                
            }
        });
        JButton close = new JButton(); //Membuat tombol close
        close.setText("Exit");
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){//Ketika tombol di klik akan menjalankan fungsi dibawah
                System.exit(0); // Keluar dari program
            }
        });
        panel.add(new JLabel(""));//membuat label kosong untuk membuat jarak pada panel
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(reset);//menambahkan tombol reset ke panel
        panel.add(new JLabel(""));
        panel.add(close);//menambahkan tombol close ke panel

        frame.add(panel);//menambahkan panel ke dalam frame
        
        frame.pack();
        frame.setLocationRelativeTo(null);//membuat frame tampil ditengah
        frame.setSize(300,400);//mensetting ukuran frame
        frame.setVisible(true);//membuat frame agar tampil


    }
}