/*
	Nama  File	: MLingkaran.java
	Pembuat	  	: Labiba Adinda Zahwana
	NIM			    : 24060121140111
	Tanggal	  	: Selasa, 09 Mei 2023
	Deskripsi	  : Main dari Lingkaran
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang jari-jari lingkaran : ");
		double jariJari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jariJari);
		System.out.println("Luas lingkaran dengan "+
			"jari-jari "+jariJari+" satuan adalah "+l.hitungLuas());
	}
 }
