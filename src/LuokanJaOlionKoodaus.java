
public class LuokanJaOlionKoodaus {

	public static void main(String[] args) {
		// Kun ohjelma käynnistyy, tämä lohko suoritetaan ensin
		// Muodostetaan Auto-luokasta olio
		Auto auto = new Auto();
		auto.merkki = "Audi";
		auto.malli = "Avant";
		auto.polttoaine = "Diesel";
		auto.paino = 2100;
		System.out.println(auto.merkki + " " + auto.malli);
		
		auto.Käynnisty();
		auto.muutaTiedot("Ford", "Focus", "Bensa", 2700);
		auto.tulostaTiedot();
		
		// Muodostetaan toinen olio Auto-luokasta
		Auto auto2 = new Auto();
		auto2.merkki = "Skoda";
		auto2.malli = "Octavia";
		System.out.println(auto2.merkki + " " + auto2.malli);
		
	}

} // Main-luokan lopetus


class Auto {
	// Ominaisuudet
	String merkki;
	String malli;
	String polttoaine;
	int paino;
	
	// Toiminnallisuudet
	public void Käynnisty()
	{
		System.out.println("Käynnistää auton");
	}
	
	public void Sammuta()
	{
		System.out.println("Sammuttaa auton");
	}
	
	public void Ajaa()
	{
		System.out.println("Ajaa autoa");
	}
	
	public void Jarruta()
	{
		System.out.println("Jarruttaa autoa");
	}
	public void tulostaTiedot()
	{
		System.out.println("Auto");
		System.out.println("Merkki " + merkki);
		System.out.println("Malli " + malli);
		System.out.println("Polttoaine " + polttoaine);
		System.out.println("Paino " + paino);
	}
	// Tietojen muuttamis-metodi
	public void muutaTiedot(String merkkiNimi, String malliNimi,String polttoaineNimi, int painoLuku)
	{
		merkki = merkkiNimi;
		malli = malliNimi;
		polttoaine = polttoaineNimi;
		paino = painoLuku;
	}
	
}