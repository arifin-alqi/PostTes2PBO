# PostTes2PBO

Nama  : Muhammad Arifin Alqi. Ab

NIM   : 2409116106

Kelas : C 2024

# Manajemen Penyewaan/Pembelian Apartemen

## 1. Konsep Program
  Disini saya membawa tema "manajemen penyewaan/pembelian apartemen", yang menggunakan sistem CRUD yaitu: 
  
  a. Create digunakan untuk menambah data kamar. 
  
  b. Read digunakan untuk menampilkan menu kamar apa saja yang tersedia. 
  
  c. Update digunakan untuk mengubah status kamarnya yang dimana di ubah ke tersedia, disewa dan terjual 
  
  d. Delete digunakan untuk menghapus data kamar kalo kamar itu sudah di beli, sehingga data kamar tidak pernah lagi kosong kecuali dijual kembali.

  e. Fitur search yang bisa menggunakan fitur mencari tipe kamar tersebut.

  ## 2. Tujuan Program

  Program ini bergunakan untuk sistem manajemen dari apartemen yang di mana bisa memudahkan para customer untuk melihat unit yang kosong berserta tipe,ukuran, harga sewa dan harga beli nya sehingga para customer bisa mengetahui apa saja yang ada pada apartemen Koba ini.

  ## 3. Sistem Program
  ### a. package model dan class dataApartemen
  <img width="372" height="184" alt="image" src="https://github.com/user-attachments/assets/2741acb9-ee18-4715-819d-eb18dbdef18d" />

  Disini ada pembagian tiga package agar bisa jelas mempermudah bahwa bisa membedakan, jadi kita bisa mengetahui bahwa di sini fokusnya disini, contohnya seperti package service yang di dalam nya ada class SistemApartemen jadi didalamnya hanya sistem berjalannya suatu programnya.

  <img width="676" height="132" alt="image" src="https://github.com/user-attachments/assets/0e7d928a-af55-4f99-af85-e1059a0cb75a" />

  Package berguna untuk mengelompokkan kelas, antarmuka, dan sub-paket yang terkait secara logis, sehingga memudahkan pengorganisasian, pengelolaan basis kode yang besar, dan menghindari konflik nama antar kelas yang memiliki nama sama. Import digunakan untuk menambah fitur agar bisa digunakan contoh seperti AraayList dan Scanner dan ada juga import nama package dan class nya untuk memakai program yang ada di package class nya.

  <img width="1112" height="367" alt="image" src="https://github.com/user-attachments/assets/967ecbb7-d953-4574-86f5-571a5a15a5c8" />

  Class digunakan untuk mengelompokkan properti seberapa banyak pun, terus tipe properti juga bisa kita masukkan untuk memberi jelas bahwa tipe atribut yang digunakan, ada juga access modifier seperti private yang berguna untuk agar access atribunya itu hanya bisa di class tersebut. Terus ada construktor yang dimana digunakan untuk menganilisasikan objek yang baru dibuat, terus this digunakan untuk membedekan atribut class dengan parameter.

<img width="795" height="346" alt="image" src="https://github.com/user-attachments/assets/37ae1b39-b463-4604-ba6c-3ddc2bcf90f3" />

  Gambar diatas menggunakan Getter dan Setter, yang dimana Getter digunakan untuk mengambil nilai atribut sedangkan Setter digunakan untuk mengubah atribut, jadi semua atribut mempunyai Getter dan Setter nya sendiri.

<img width="805" height="275" alt="image" src="https://github.com/user-attachments/assets/5373d6ed-0bf9-4a13-9ab1-5503522be1ac" />

  Menthod tampilkaninfo digunakan untuk menampilkan semua detail buku Ketika di run sehingga bisa tersusun lebih rapi dan terstruktur.

<img width="764" height="73" alt="image" src="https://github.com/user-attachments/assets/d8dfd64f-556b-4e13-a0c9-c81ee28a457f" />

### b. Package Service dan Class SistemApartemen

  Class disini  arraylist yang digunakan untuk menyimpan banyak objek, terus ada scenner yang bisa digunakan untuk memasukkan input pada program.

<img width="970" height="258" alt="image" src="https://github.com/user-attachments/assets/9588f579-b273-44fe-8565-e3eda6ac3480" />

  Ada methond tambah unit yang berguna agar bisa menambahkan unit kamar dari id unit, tipe dan lainnya agar bisa menambahkan pada arraylist, juga ada input angka disana agar program saat memasukkan huruf tidak error dan ada juga input teks agar saat tidak memasuukkan apapun dia juga tidak error jadi akan mengulang memasukkan lagi dengan benar.

  <img width="629" height="246" alt="image" src="https://github.com/user-attachments/assets/16835887-ec45-41ff-91a4-679a1b08b392" />

  Gambar diatas digunakan ada method tempilkan daftar unit disini bisa menampilkan data yang sudah kita masukkan pada arraylist dan juga akan menapulkan data yang sudah kita tambah pada tambah unit.

  <img width="938" height="266" alt="image" src="https://github.com/user-attachments/assets/4379f3b1-f6a3-4427-9e7a-f8d867624b49" />

  Terus disini ada method update status unit yang berguna untuk merubah status nya, jadi bisa dibilang ini ada sistem inti updatenya.

  <img width="874" height="398" alt="image" src="https://github.com/user-attachments/assets/01ad5a80-8b03-468b-abb7-3c09482230b5" />

  Nah disini sistem untuk mengubahnya dengan memasukkan id unit nya terus dia akan menampilkan statusnya mau ubah kemnana.

  <img width="825" height="688" alt="image" src="https://github.com/user-attachments/assets/648c616d-62be-4a4a-b0bd-548b14599144" />

  Disini ada method input angka dan input teks, jadi input angka itu berfungsi untuk tipe integer jadi nanti saat data yang tipe nya integer saat memasukkan huruf dia akan menampilkan coba lagi, terus ada input teks yang berguna untuk tipe string jadi saat tidak memasukkan apa apa dia akan menampilkan coba lagi.

  <img width="796" height="130" alt="image" src="https://github.com/user-attachments/assets/3c2eaf23-ccbc-45de-9c5c-b484af5f696c" />

  Disini ada gambar program method yang berfungsi untuk menghentikan program nya jadi harus tekan enter lebih dahulu untuk lanjut.

  ### c. Package Main dan Class Main

  <img width="1011" height="254" alt="image" src="https://github.com/user-attachments/assets/607a7c3c-ff76-4377-8a3d-862a59f01ba3" />

  Nah jadi di class main Adalah tempat dimana digunakan nya untuk membaca semua code yang sudah dilakukan sebelumnya, nah diatas itu dimana kita memasukkan objek-objek untuk setiap atibut yang diawal sesuai tipe datanya jadi dia akan membaca semua buku yang sudah kita masukkan. Ada sistem scnner juga disana agar bisa melakukan input.

  <img width="838" height="405" alt="image" src="https://github.com/user-attachments/assets/8528ed4f-e7c4-4948-9291-16b07a808ea4" />

  Ada menu sistem pilihan pada manajemen apartemen ini dan yang bawah adalah salah satu validasi input jadi saat menginput huruf maka dia akan kembali jadi dia tidak akan error.

  <img width="814" height="825" alt="image" src="https://github.com/user-attachments/assets/4c52cf96-f0b2-432d-9c3d-b85db55e6751" />

  Terus disini case nya yang isi sistem-sistem yang sudah dibuat pada package service class sistem Aparetemn, jadi hanya memasukkan method sistem yang sudah dibuat.

  ## 4. Alur Program

  <img width="665" height="452" alt="image" src="https://github.com/user-attachments/assets/7ed85f9b-8e09-4136-a742-a7dffaae382a" />

  Jadi saat di run akan menampilkan menu yang ada pada unit dan saat memilih salah dia akan mengulang kemabali hingga memasukkan pilihan yang tepat. 

  <img width="785" height="443" alt="image" src="https://github.com/user-attachments/assets/2860b370-a997-43fa-9902-1077349df160" />

  Terus saat memilih menu 1 dia akan menambah unit baru dengan memsukkan id unit baru saat memasukkan huruf dia akan mengulang, juga memasukkan tipe unit jadi saat tidak memasukkan apapun dia akan mengulang memasukkan tipenya lagi dan seterusnay sama terakhir sebelum kembali ke manu harus tekan enter terlebih dahulu baru bisa lanjut.

  <img width="766" height="727" alt="image" src="https://github.com/user-attachments/assets/f19330cc-2df8-49e9-9786-e78309af9aa7" />

  Saat memilih menu 2 dia akan menampilkan daftar daftar unit yang yang ada pada sistem dengan tipe status yang disewa dan tersedia, jadi bagi unit yang sudah yang dibeli dia akan tidak memsukkan ke daftar lagi terakhir juga sama dia harus tekan enter dulu baru.

  <img width="746" height="483" alt="image" src="https://github.com/user-attachments/assets/ac5cd3d6-5de0-4a69-9b05-211fbbe22292" />

  Jadi saat memilih menu ke tiga dia akan memnapilkan daftar unit dulu baru kita memilih dafter unit yang ingin di ubah dengan memasukkan id unit nya, terus maemasukkan status apa yang mau dan sama seperti yang lain harus tekan enter dahulu baru lanjut.

  <img width="746" height="483" alt="image" src="https://github.com/user-attachments/assets/b6ef908a-16b6-499d-a1d9-8ca9a73ec55f" />

  Menu 4 ada hapus dafter unit hanya dengan memasukkan id unit nya maka dia akan menghapus unit tersebut, fungsi hapus unit digunakan untuk menghapus unit yang sudah di beli sama yang lain untuk lanjut harus tekan enter dulu.

  <img width="776" height="622" alt="image" src="https://github.com/user-attachments/assets/753410c7-3ab4-431a-8f24-fbb72f222355" />

  Menu 5 yaitu fitur search dengan memasukkan tipe unit yang ingin di cari maka dia akan menampilkan dengan yang kita cari jadi kalo ada 2 tipe yang dia akan menampilkan keduanya.

  <img width="928" height="322" alt="image" src="https://github.com/user-attachments/assets/d17d51b6-2bf4-468e-9fc8-5cc0a7877558" />

  Terakhir ada menu 6 yang berfungsi untuk keluar dari program tersebut.
