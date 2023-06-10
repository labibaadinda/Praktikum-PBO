/*
	Nama  File	: DAOManager.java
	Pembuat		: Labiba Adinda Zahwana
	NIM			: 24060121140111
	Tanggal		: Sabtu, 10 Juni 2023
	Deskripsi	: Pengelolaan DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
