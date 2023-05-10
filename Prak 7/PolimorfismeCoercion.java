/*
	Nama  File	: PolimorfismeCoercion.java
	Pembuat		: Labiba Adinda Zahwana
	NIM			: 24060121140111
	Tanggal		: Rabu, 10 Mei 2023
	Deskripsi	: Contoh kode yang menerapkan polimorfisme coercion
*/

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args){
        //deklarasi objek integer
        Integer bilangan=10;

        //objek integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat=kuadrat(bilangan);
        System.out.printf("Hasil kuadrat %d adalah %d",bilangan,hasilKuadrat);
    }
}
