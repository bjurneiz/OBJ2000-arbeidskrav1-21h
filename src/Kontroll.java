import java.util.Random;
public class Kontroll {
	String [] nyttEnkeltDikt = new String[16];
	String [] nyttAvansertDikt = new String[16];
	// Kode for å generere ett enkelt dikt og mikse rundt på ordene som kommer inn
	public String[] enkeltDikt(String ord1, String ord2, String ord3, String ord4, String ord5, String ord6, String ord7, String ord8, String ord9, String ord10) {	
		for (int i = 0; i < nyttEnkeltDikt.length; i++) { // for loop for å loope igjennom den ny opprettede arrayen på 16 tomme verdier
			Random rand = new Random();
			int j = rand.nextInt(10) + 1; // generere random tall og hvis tallet stemmer med verdien så skal parameteret som er overført til variabelen legges til i arrayen
			if (j == 1) nyttEnkeltDikt[i] = ord1;
			else
				if (j == 2) nyttEnkeltDikt[i] = ord2;
				else
					if (j == 3) nyttEnkeltDikt[i] = ord3;
					else
						if (j == 4) nyttEnkeltDikt[i] = ord4;
						else
							if (j == 5) nyttEnkeltDikt[i] = ord5;
							else
								if (j == 6) nyttEnkeltDikt[i] = ord6;
								else
									if (j == 7) nyttEnkeltDikt[i] = ord7;
									else
										if (j == 8) nyttEnkeltDikt[i] = ord8;
										else
											if (j == 9) nyttEnkeltDikt[i] = ord9;
											else
												nyttEnkeltDikt[i] = ord10;
		}
		
		return nyttEnkeltDikt;
	}
	
	public String skrivUtDikt() {
		String tegningEnkeltDikt = nyttEnkeltDikt[0] + " " + nyttEnkeltDikt[1] + " " + nyttEnkeltDikt[2] + " " + nyttEnkeltDikt[3] + "\n" +
				nyttEnkeltDikt[4] + " " + nyttEnkeltDikt[5] + " " + nyttEnkeltDikt[6] + " " + nyttEnkeltDikt[7] + "\n" +
				nyttEnkeltDikt[8] + " " + nyttEnkeltDikt[9] + " " + nyttEnkeltDikt[10] + " " + nyttEnkeltDikt[11] + "\n" +
				nyttEnkeltDikt[12] + " " + nyttEnkeltDikt[13] + " " + nyttEnkeltDikt[14] + " " + nyttEnkeltDikt[15] + "\n";
		// Formatere og returnere array i riktig format 4 x 4 linje oppsett
		return tegningEnkeltDikt;
	}
	
	public String[] avansertDikt(String ord1, String ord2, String ord3, String ord4, String ord5, String ord6, String ord7, String ord8, String ord9, String ord10) {
		
		String [] Adjektiv = new String[3]; // Opprette adjektiv array
		Adjektiv[0] = ord2; Adjektiv[1] = ord3; Adjektiv[2] = ord4; //Legge adjektiv ordene inn i adjektiv array
		String [] Substantiv = new String[3]; // Opprette adjektiv array
		Substantiv[0] = ord5; Substantiv[1] = ord6; Substantiv[2] = ord7; //Legge adjektiv ordene inn i adjektiv array
		String [] Verb = new String[3]; // Opprette adjektiv array
		Verb[0] = ord8; Verb[1] = ord9; Verb[2] = ord10; //Legge adjektiv ordene inn i adjektiv array
		
		for (int i = 0; i < nyttAvansertDikt.length; i++) {
			Random rand1 = new Random(); 
			int j = rand1.nextInt(3);
			if (i == 0 || i == 4 || i == 8 || i == 13) nyttAvansertDikt[i] = ord1;
				else
					if (i == 1 || i == 5 || i == 9 || i == 14) nyttAvansertDikt[i] = Adjektiv[j]; 
					else
						if (i == 2 || i == 6 || i == 10 || i == 15) nyttAvansertDikt[i] = Substantiv[j];
						else 
							if (i == 3 || i == 7 || i == 11 || i == 12) nyttAvansertDikt[i] = Verb[j];
			}
		
		return nyttAvansertDikt;	
	}		
	
	public String skrivUtAvansertDikt() {
		String tegningAvansertDikt = nyttAvansertDikt[0] + " " + nyttAvansertDikt[1] + " " + nyttAvansertDikt[2] + " " + nyttAvansertDikt[3] + "\n" +
				nyttAvansertDikt[4] + " " + nyttAvansertDikt[5] + " " + nyttAvansertDikt[6] + " " + nyttAvansertDikt[7] + "\n" +
				nyttAvansertDikt[8] + " " + nyttAvansertDikt[9] + " " + nyttAvansertDikt[10] + " " + nyttAvansertDikt[11] + "\n" +
				nyttAvansertDikt[12] + " " + nyttAvansertDikt[13] + " " + nyttAvansertDikt[14] + " " + nyttAvansertDikt[15] + "\n";
		// Formatere og returnere array i riktig format 4 x 4 linje oppsett
		return tegningAvansertDikt;
		
	}
}

	