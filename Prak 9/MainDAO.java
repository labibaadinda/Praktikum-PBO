/*
	Nama  File	: MainDAO.java
	Pembuat		: Labiba Adinda Zahwana
	NIM		: 24060121140111
	Tanggal		: Sabtu, 10 Juni 2023
	Deskripsi	: Main program untuk mengakses DAO
*/

public class MainDAO {
    public static void main(String[] args){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
