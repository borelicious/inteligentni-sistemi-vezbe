package studenti;

public class Student {
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private int ocena;
	
	public Student(String ime, String prezime, int ocena) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocena = ocena;
	}
	
	public void izmenaOcene(int ocena) {
		this.ocena = ocena;
	}
	
	public void prikazPodataka() {
		System.out.println("=== Podaci o studentu ===");
		System.out.println("Ime: " + this.ime);
		System.out.println("prezime: " + this.prezime);
		System.out.println("Ocena: " + this.ocena);
		if(brojIndeksa == null)
			System.out.println("Student nije upisan ni na jedan smer!");
		else
			System.out.println("Broj indeksa: " + this.brojIndeksa);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
}
