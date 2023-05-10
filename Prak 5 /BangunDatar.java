/*
	Nama  File	: BangunDatar.java
	Pembuat		: Labiba Adinda Zahwana
	NIM	        : 24060121140111
	Tanggal		: Selasa, 9 Mei 2023
	Deskripsi	: Abstrak Bangun Datar
*/
 
 public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
 } 
 
 
