import java.beans.IndexedPropertyChangeEvent;
import java.util.concurrent.ExecutionException;

/*
	Nama  File	: PersonDAO.java
	Pembuat		: Labiba Adinda Zahwana
	NIM			: 24060121140111
	Tanggal		: Sabtu, 10 Juni 2023
	Deskripsi	: Interface untuk person access object
*/

public interface PersonDAO {
    public void savePerson(Person P) throws Exception;
}
