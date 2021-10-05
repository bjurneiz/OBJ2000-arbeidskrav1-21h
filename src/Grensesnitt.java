import javax.swing.JOptionPane;

public class Grensesnitt {
	Kontroll Kontroll = new Kontroll();

	/* Hovedmeny kommer under her: 
	   Menyvalg */
	private String[] ALTERNATIVER = {"Enkelt dikt", "Avansert dikt", "Avslutt"};
	// Lager et objekt av TegneKontroll
	// Metoden meny() behandler hovedmenyen og valgene:
	public void hovedMeny() {
		// Bruker en l�kkestyrt meny med bolske variabler og switch for � velge utfall
		boolean fortsette = true;
		while(fortsette) {
			// Skriver meny og leser valg:
			int valg = lesValg();
			// Bruker en case for � behandle valg:
			switch(valg) {
			case 0 : enkeltDiktMeny();
				break;
			case 1 : avansertDiktMeny();
				break;
			default : fortsette = false;
			}
		}
	}
	// Metode som skriver ut hovedmeny og returnerer valget:
	public int lesValg() {
		// Bruker showOptionDialog:
		int valg = JOptionPane.showOptionDialog(null, "Gj�r et valg:", "Hovedmeny", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		return valg;
	}
	
	
	// Her kommer MENY for enkelt dikt
	private String[] ALTERNATIVERENKELTMENY = {"Registrer ord", "Skriv dikt", "Avslutt"};
	
	public void enkeltDiktMeny() {
		// Bruker en l�kkestyrt meny med bolske variabler og switch for � velge utfall
		boolean fortsette = true;
		while(fortsette) {
			// Skriver meny og leser valg:
			int valg = lesValgEnkeltMeny();
			// Bruker en case for � behandle valg:
			switch(valg) {
				case 0 : registrerOrdEnkeltDikt();
					break;
				case 1 : skrivUtDikt();
					break;
				default : fortsette = false;
			}
		}
	}
	// Metode som skriver ut hovedmeny og returnerer valget:
		public int lesValgEnkeltMeny() {
			// Bruker showOptionDialog:
			int valg = JOptionPane.showOptionDialog(null, "Gj�r et valg:", "Enkelt dikt", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVERENKELTMENY, ALTERNATIVERENKELTMENY[0]);
			return valg;
		}
	
	// Kode for registrering av ord til enkeltDikt. Lage gjentagente inputer
	public void registrerOrdEnkeltDikt() {
		JOptionPane.showMessageDialog(null, "Du m� skrive inn 10 ord for � lage ett dikt.");
		String ord1 = JOptionPane.showInputDialog("Skriv inn f�rste ordet til diktet:");
		String ord2 = JOptionPane.showInputDialog("Skriv inn andre ordet til diktet:");
		String ord3 = JOptionPane.showInputDialog("Skriv inn tredje ordet til diktet:");
		String ord4 = JOptionPane.showInputDialog("Skriv inn fjerde ordet til diktet:");
		String ord5 = JOptionPane.showInputDialog("Skriv inn femte ordet til diktet:");
		String ord6 = JOptionPane.showInputDialog("Skriv inn sjette ordet til diktet:");
		String ord7 = JOptionPane.showInputDialog("Skriv inn syvende ordet til diktet:");
		String ord8 = JOptionPane.showInputDialog("Skriv inn �ttende ordet til diktet:");
		String ord9 = JOptionPane.showInputDialog("Skriv inn niende ordet til diktet:");
		String ord10 = JOptionPane.showInputDialog("Skriv inn tiende ordet til diktet:");
		Kontroll.enkeltDikt(ord1, ord2, ord3, ord4, ord5, ord6, ord7, ord8, ord9, ord10); // Sende parameterne til diktkontroll klassen som kontrollerer ordene som er sendt inn
	}

	private void skrivUtDikt() {
		String tegningEnkeltDikt = Kontroll.skrivUtDikt();
		JOptionPane.showMessageDialog(null, tegningEnkeltDikt);
		
	}

	// Her kommer meny for avansert dikt
	private String[] ALTERNATIVERAVANSERTTMENY = {"Registrer ord", "Skriv dikt", "Avslutt"};
	public void avansertDiktMeny() {
		// Bruker en l�kkestyrt meny med bolske variabler og switch for � velge utfall
		boolean fortsette = true;
		while(fortsette) {
			// Skriver meny og leser valg:
			int valg = lesValgAvanserttMeny();
			// Bruker en case for � behandle valg:
			switch(valg) {
				case 0 : registrerOrdAvansertDikt();
					break;
				case 1 : skrivUtAvansertDikt();
					break;
				default : fortsette = false;
			}
		}
	}
	// Metode som skriver ut hovedmeny og returnerer valget:
		public int lesValgAvanserttMeny() {
			// Bruker showOptionDialog:
			int valg = JOptionPane.showOptionDialog(null, "Gj�r et valg:", "Avansert dikt", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVERAVANSERTTMENY, ALTERNATIVERAVANSERTTMENY[0]);
			return valg;
		}
	
		// Kode for registrering av ord til avansertDikt
	public void registrerOrdAvansertDikt() {
		JOptionPane.showMessageDialog(null, "Du m� skrive inn 10 ord for � lage ett dikt.");
		String ord1 = JOptionPane.showInputDialog("Skriv inn f�rste artikkel ordet til diktet:");
		String ord2 = JOptionPane.showInputDialog("Skriv inn andre adjektiv ordet til diktet:");
		String ord3 = JOptionPane.showInputDialog("Skriv inn f�rste adjektiv ordet til diktet:");
		String ord4 = JOptionPane.showInputDialog("Skriv inn andre adjektiv ordet til diktet:");
		String ord5 = JOptionPane.showInputDialog("Skriv inn femte substantiv ordet til diktet:");
		String ord6 = JOptionPane.showInputDialog("Skriv inn sjette substantiv ordet til diktet:");
		String ord7 = JOptionPane.showInputDialog("Skriv inn syvende substantiv ordet til diktet:");
		String ord8 = JOptionPane.showInputDialog("Skriv inn �ttende verb ordet til diktet:");
		String ord9 = JOptionPane.showInputDialog("Skriv inn niende verb ordet til diktet:");
		String ord10 = JOptionPane.showInputDialog("Skriv inn tiende verb ordet til diktet:");
		Kontroll.avansertDikt(ord1, ord2, ord3, ord4, ord5, ord6, ord7, ord8, ord9, ord10); //Sende parameterne til diktkontroll klassen som kontrollerer ordene som er sendt inn
	}
	// Kode for � ta imot paramter fra avansert dikt p� kontroll og skrive ut i JOptionPane
	public void skrivUtAvansertDikt() {
		String tegningAvansertDikt = Kontroll.skrivUtAvansertDikt();
		JOptionPane.showMessageDialog(null, tegningAvansertDikt);
	}
}
