/*
	Nama  File	: ExceptionOnArray.java
	Pembuat		  : Labiba Adinda Zahwana
	NIM			    : 24060121140111
	Tanggal	   	: Selasa, 09 Mei 2023
	Deskripsi	  : Program penggunaan eksepsi menggunakan class library pada Java
*/
 
public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("Clean up code...");
		}
	}
}
