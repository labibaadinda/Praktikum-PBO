/*
	File		: MOperasiTitik.java
	Penulis		: Labiba Adinda Zahwana - 24060121140111
	Deskripsi	: Kelas yang berisi program untuk menjalankan kelas operasi titik.
*/

class OperasiTitik{
	private static void refleksiSumbuX (Titik t){
		t.ordinat = t.ordinat*(-1);
	}

	private static void refleksiSumbuY (Titik t){
		t.absis = t.absis*(-1);
	}
	
	public static void refleksiX (Titik t){
		refleksiSumbuX(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
	
	public static void refleksiY (Titik t) {
		refleksiSumbuY(t);
		System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
	}
} 