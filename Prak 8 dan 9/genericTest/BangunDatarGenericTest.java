/*
	Nama  File	: BangunDatarGenericTest.java
	Pembuat		: Labiba Adinda Zahwana
	NIM			: 24060121140111
	Deskripsi	: main class generic  bangun datar
*/
public class BangunDatarGenericTest{
	public static void main(String[] args){
	Lingkaran l = new Lingkaran(2);
	BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
	bdg.set(l);
	System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
	System.out.println("tipe generic : " +bdg.get().getClass().getName());
	}
}
