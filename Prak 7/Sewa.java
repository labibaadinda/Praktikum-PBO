/*
	Nama  File	: Sewa.java
	Pembuat		: Labiba Adinda Zahwana
	NIM	: 24060121140111
	Tanggal		: Rabu, 10 Mei 2023
	Deskripsi	: Main dari Vehicle
*/

public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan=new Vehicle();
        Vehicle mobil=new Car();
        Vehicle bis=new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50,1000);
        bis.calRent(50,1000);
    }
}
