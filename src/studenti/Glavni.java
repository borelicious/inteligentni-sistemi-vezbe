package studenti;

public class Glavni {

	public static void main(String[] args) {
		Student s1 = new Student("Uros", "Lastic", 8);
		Student s2 = new Student("Jovan", "Malesevic", 5);
		Student s3 = new Student("Milos", "Stanojevic", 9);
		Smer sm1 = new Smer("Mehatronika", 3);
		
		sm1.dodajStudenta(0, s1);
		sm1.dodajStudenta(1, s2);
		sm1.dodajStudenta(2, s3);
		
		
		//sm1.prikapPoBrojuIndexa();
		sm1.prikazStudenataKojiSuPolozili();
		sm1.prosecnaOcena();
	}

}
