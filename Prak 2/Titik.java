/*
	File 		: Titik.java
	Penulis		: Labiba Adinda Zahwana - 24060121140111
	Deskripsi	: Kelas ini merupakan program untuk membuat data koordinat titik dan menampilkannya ke layar.
*/

public class Titik{
	double absis;			
	double ordinat;				
	static int counterTitik;	
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double x){
		absis = x;
	}
	
	void setOrdinat(double y){
		ordinat = y;
	}

	public Titik(double x, double y){
		counterTitik++;
		absis = x;
		ordinat = y;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat (){
		return ordinat;
	}
	
	int getCounterTitik (){
		return counterTitik;
	}
}