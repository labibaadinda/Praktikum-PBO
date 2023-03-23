/*
	File		: Segitiga.java
	Penulis		: Labiba Adinda Zahwana - 24060121140111
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas operasi segitiga.
*/

package org.bangundatar;

import org.poligon.poligon; //import dari file poligon.java dan dari folder poligon
public class Segitiga extends poligon{
	private double alas,tinggi;
	public Segitiga(double alas,double tinggi,int JumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.JumlahSisi = JumlahSisi;
	}
	public double HitungLuas(){
		return 0.5 * alas * tinggi;
	}
	public void PrintInfo(){
		System.out.println("Bangun segitiga Bersisi = "+this.getJumlahSisi());
	}
}