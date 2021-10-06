<h1>OBJ2000 Objektorientert Programmering - Arbeidskrav 1- 2021 - USN Ringerike</h1>

<h2>Diktgenerator</h2>
Du skal lage et program som skriver dikt. I del 1 skal du lage en enkel versjon uten strenge krav til hvordan diktene skal se ut, mens du i del 2 har flere krav. Legg vekt på å beskrive programmet med pseudokode og klassediagram før du begynner å programmere. Trinnvis forfining av programmet vil være en god idé. Legg vekt på først å få hovedkravene til programmet oppfylt, deretter kan du utvide med mer funksjonalitet. Legg også vekt på kommentarer i programkoden, samt gode ledetekster i menyen.
De to delene av oppgaven skrives i samme program. Dette skal da ha et valg mellom «enkle» dikt og «avanserte» dikt. Meny lages ved å bruke klassen JOptionPane. Hovedmenyen skal ha tre valg: Enkelt dikt, avansert dikt og avslutt. De to første valgene skal åpne nye menyer med tre valg: registrer ord, skriv dikt og avslutt. Valget avansert dikt skal igjen åpne en meny der du kan velge å registrere ord fordelt på de fire ordklassene (se under En litt mer avansert diktgenerator).
Programmet skal bruke kontrollobjekt til å kontrollere programutførelsen og et grensesnittobjekt for kommunikasjon med brukeren. Kontrollobjektet skal bruke en array til å håndtere ordene. Innlesing av ord gjennom grensesnittobjektet skal gjøres ved å bruke klassen JOptionPane.
Arbeidet gjøres individuelt eller i grupper på 2 personer. Innlevering som zip-filer av prosjektet i Canvas. Jobber dere to sammen, så leverer dere på den ene, og skriver i kommentarfeltet hvem som jobbet sammen. Bruk etternavnet ditt som en del av både prosjektnavnet og filnavnet. Det gjør det lettere for meg å teste programmene.
For å få oppgaven godkjent må dere ha gjort del 1. Del 2 er en ekstra utfordring.
Innlevering senest fredag 24. september

<h2>Del 1. Enkel diktgenerator</h2>
Diktgeneratoren skal lage meningsløse dikt. Det trenger følgende funksjoner, som kan være utgangspunkt for menyvalg:<br>
- Registrere ord<br>
- Skrive dikt<br>
- Avslutt
 
Avhengig av hvilke ord som er lest inn, skal nå programmet kunne lage et ”tulledikt” på ett vers, der verset har 4 linjer og hver linje 4 ord. 

Ordene skal velges tilfeldig fra de ordene du har tastet inn:<br>
håper gulrot virrer grønn<br>
vinter snerrer borte lenge<br>
snakker borte grønn inne<br>
derfra sover gulrot borte

Vær oppmerksom på at dere trenger en del ord i ordlisten for at det skal bli noe særlig ut av diktene.

<h2>Del 2. En litt mer avansert diktgenerator</h2>
I den avanserte formen settes det mer formelle krav til utformingen av diktet. 

Det skal nå ha denne formen:<br>
artikkel adjektiv substantiv verb<br>
artikkel adjektiv substantiv verb<br>
artikkel adjektiv substantiv verb<br>
verb artikkel adjektiv substantiv

Dette skal gi dikt av denne formen:<br>
den grønne boken danser<br>
den vimsete gulroten sover<br>
den klønete trekanten vokser<br>
snorker den ville læreren

Programmet må altså skille mellom de fire ordtypene og sette dem sammen i riktig rekkefølge.

<h2>Preview:</h2>

![alt text](https://github.com/binariicodice/OBJ2000-arbeidskrav1-21h/blob/main/hovedmeny.png?raw=true)

![alt text](https://github.com/binariicodice/OBJ2000-arbeidskrav1-21h/blob/main/enkeltDikt.png?raw=true)

![alt text](https://github.com/binariicodice/OBJ2000-arbeidskrav1-21h/blob/main/enkeltDiktUtskrift.png?raw=true)

![alt text](https://github.com/binariicodice/OBJ2000-arbeidskrav1-21h/blob/main/avansertDikt.png?raw=true)

![alt text](https://github.com/binariicodice/OBJ2000-arbeidskrav1-21h/blob/main/avansertDiktUtskrift.png?raw=true)
