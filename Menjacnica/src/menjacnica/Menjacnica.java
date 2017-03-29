package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import kursevi.Kurs;
import kursevi.Valuta;
import specifikacija.SpecifikacijaInterfejs;

public class Menjacnica implements SpecifikacijaInterfejs {
	private LinkedList<Kurs> lista = new LinkedList<Kurs>();

	@Override
	public void dodajKursValuteZaDan(GregorianCalendar dan, Valuta valuta, double prodajniKurs, double kupovniKurs,
			double SrednjiKurs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
