/*
	Nama  File	: AngkaSialException.java
	Pembuat	  	: Labiba Adinda Zahwana
	NIM		    	: 24060121140111
	Tanggal		  : Selasa, 09 Mei 2023
	Deskripsi	  : Eksepsi buatan sendiri, Menolak masukan angka 13
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("Jangan memasukkan angka 13 karena angka sial!");
	}
 }
