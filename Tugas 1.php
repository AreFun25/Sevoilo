<?php
// Mencetak ke layar tulisan sekaligus varibael
$nama = readline("Namamu adalah: ");
$welcomeMessage = "Halo, ";
echo $welcomeMessage . "\n";

// Inputan keyboard
$number = readline("Masukkan sebuah angka: ");

// Deklarasi sekaligus inisialisasi variabel baru
$number = floatval($number); // Convert input to a float
echo "Angka yang dipilih adalah $number";

// menghitung akar 2 dari sebuah angka
$squareRoot = sqrt($number);
echo ", Akar dari $number adalah: $squareRoot\n";

// menghitung pangkat
$exponent = 3; // You can change this to any desired exponent
$powerResult = pow($number, $exponent);
echo "$number dipangkatkan $exponent adalah: $powerResult\n";
?>
