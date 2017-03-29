package specifikacija;

import java.util.GregorianCalendar;

import kursevi.Kurs;
import kursevi.Valuta;

public interface SpecifikacijaInterfejs {
	public void dodajKursValuteZaDan(GregorianCalendar dan, Valuta valuta, double prodajniKurs,double kupovniKurs,double SrednjiKurs);
	public void obrisiKursValuteZaDan(GregorianCalendar dan, Valuta valuta);
	public Kurs vratiKursValuteZaDan( GregorianCalendar dan, Valuta valuta);


}
