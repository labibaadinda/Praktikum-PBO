/*
	Nama  File	: Vehicle.java
	Pembuat		: Labiba Adinda Zahwana
	NIM	: 24060121140111
	Tanggal		: Rabu, 10 Mei 2023
	Deskripsi	: Superclass yang digunakan untuk menghitung harga sewa kendaraan
*/

public class Vehicle {
    void calRent(int distance,float price){
        float fare=distance*price;
        System.out.println("Harga sewa kendaraan = "+fare);
    }
}
