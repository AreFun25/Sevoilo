#include <iostream>
#include <cmath> 
// Mencetak ke layar tulisan sekaligus varibael

using namespace std;

int main() {
    // Printing text
    string nama = "Contoh";
    cout << "Halo " << nama << endl;

    // Deklarasi sekaligus inisialisasi variabel baru
    int num1 = 3;
    double num2 = 4;

    // Printing variables
    cout << "Angka pertama: " << num1 << endl;
    cout << "Angka kedua: " << num2 << endl;

    // Inputan keyboard
    cout << "Masukkan sebuah Angka: ";
    double userInput;
    cin >> userInput;

    // Menghitung akar 2 dari sebuah angka
    double squareRoot = sqrt(userInput);
    cout << "Akar dari " << userInput << " adalah: " << squareRoot << endl;

    // Menghitung pangkat
    cout << num1 <<"^2: " << pow(num1, 2) << endl;
    cout <<  num2 <<"^3: "<< pow(num2, 3) << endl;

    return 0;
}
