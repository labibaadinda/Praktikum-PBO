/*
	Nama  File	: Asersi1.java
	Pembuat	  	: Labiba Adinda Zahwana
	NIM			    : 24060121140111
	Tanggal		  : Selasa, 09 Mei 2023
	Deskripsi	  : Program untuk menunjukkan asersi
*/

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x adalah bilangan positif");
        }
        else{
            assert(x<0):"Ada kesalahan kode";
            System.out.println("x adalah bilangan negatif");
        }
    }
}
