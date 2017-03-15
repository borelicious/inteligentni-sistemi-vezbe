package studenti;

public class Smer {
	private String smer;
	//private String predmet;
	//private String brojIndeksa;
	private Student[] student;
	
	
	public Smer(String naziv, int brojStudenata){
		this.smer = naziv;
		this.student = new Student[brojStudenata];
	}
	
	public void dodajStudenta(int broj, Student s) {
	   student[broj] = s;
	   s.setBrojIndeksa(smer + "/" + (broj+1));
	}
	
	public void prikapPoBrojuIndexa() {
		System.out.println("=== Prikaz studenata po broju indeksa ===");
		for(int i=0; i<student.length; i++){
			System.out.println(" ");
			student[i].prikazPodataka();
			System.out.println("");
		}
	}
	
	public void prikazStudenataKojiSuPolozili() {
		System.out.println("=== Prikaz studenata koji su polozili ===");
		for(int i=0; i<student.length; i++){
			if(student[i].getOcena() > 5){
				System.out.println(" ");
				student[i].prikazPodataka();
				System.out.println("");
			}
		}
	}
	
	public void prosecnaOcena() {
		int zbirOcena = 0;
		int studentiKojiSuPolozili = 0;
		for(int i=0; i<student.length; i++){
			if(student[i].getOcena() > 5){
				zbirOcena = zbirOcena + student[i].getOcena();
				studentiKojiSuPolozili++;
			}
		}
		System.out.println("Prosecna ocena studenata koji su polozili: " + (zbirOcena/studentiKojiSuPolozili));
	}

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}
}
