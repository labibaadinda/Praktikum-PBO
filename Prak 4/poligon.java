/**
*File = poligon.java
*Penulis = Labiba Adinda Zahwana
*Nim = 24060121140111
*deskripsi = representasi dasar dari objek poligon (segi banyak)
*/
package org.poligon;

public class poligon{
	protected int jumlahSisi;
	public poligon(){
		this.jumlahSisi = 0;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
}