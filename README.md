# TicTacToe

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

Tic-tac-toe adalah permainan yang dimainkan oleh 2 orang dengan mengisi X dan O secara bergiliran menandai ruang grid 3x3, pemain yang berhasil menempatkan tiga tanda mereka di baris horisontal, vertikal, atau diagonal memenangkan pertandingan.

## Credits
| NPM           | Name        |
| ------------- |-------------|
| 140810190032  | Akirareka K J    |
| 140810190062  | Hilmi Aufarahman    |
| 140810190068  | Fadhillah Akbar I |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (17/11/2020)** 
   - Mengadakan diskusi tentang perencanaan pengerjaan sprint
   - Mengeksplore tentang game tic tac toe

- **[Sprint 1](changelog/sprint-1.md) - (18/11/2020 - 24/11/2020)** 
   - Membuat desain tampilan TicTacToe seperti :
     - Membuat JFrame TictacToe
     - Tulisan untuk mengetahui giliran pemain contoh : (Giliran Ke-1(x),Giliran Ke-2(o) , dst)
     - Menampilkan score pemain contoh : (X = … , O = … )
     - Membuat panel 3x3
     - Dan yang tekahir membuat tombol reset dan exit

- **[Sprint 2](changelog/sprint-2.md) - (25/11/2020 - 1/12/2020)** 
   - Membuat semua fungsi yang berjalan :
     - Dapat menjalankan giliran pemain
     - Dapat menampilkan Score dari pemenang contoh : (X = 2 , O = 1)
     - Pada panel 3x3 dapat memunculkan X dan O
     - Tombol reset dapat mengrestart ulang permainan yang sedang berlangsung
     - Tombol Exit dapat berfungsi dengan baik

   
- **[Sprint 3](changelog/sprint-3.md) - (2/12/2020 - 7/12/2020)** 
   - Penyempurnaan penanganan error
   - Penyempurnaan desain dari TicTacToe
   - Penyempurnaan final dari codingan game TicTacToe


## Running The App

- Buka CMD di file TicTacToe.java
- lalu running " java TicTacToe "

## Classes Used

TO;DO

UML image here

## Notable Assumption and Design App Details
- **Membuat frame dan panel 3x3.**
- **Membuat giliran X atau O.**
- **Mengubah isi panel menjadi huruf sesuai giliran dengan berusaha membentuk garis horizontal ATAU vertikal ATAU diagonal**
- **Jika kotak sudah terisi penuh dan tidak ada player yang bisa membentuk garis, permainan berakhir dan menunjukkan permainan seri.**
- **Setelah kondisi membentuk garis maka tampilan akan berganti dan menunjukkan player yang membentuk garis tersebut.**
- **Ketika permainan selesai, muncul tombol 'restart' untuk memulai permainan kembali.**
- **Muncul leaderbord semua player yang telah bermain.**
