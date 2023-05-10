/*
	Nama  File	: Lingkaran.java
	Pembuat		  : Labiba Adinda Zahwana
	NIM			    : 24060121140111
	Tanggal		  : selasa, 09 mei 2023
	Deskripsi	  : Lingkaran
*/

 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jariJari;
	
	public Lingkaran(double r){
		jariJari = r;
	}
	
	public double hitungLuas(){
		return PI* jariJari * jariJari;
	}
 }
 
 
