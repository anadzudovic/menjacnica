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
		Kurs novi = new Kurs();
		novi.setDatum(dan);
		novi.setValuta(valuta);
		novi.setKupovniKurs(kupovniKurs);
		novi.setProdajniKurs(prodajniKurs);
		novi.setSrednjiKurs(SrednjiKurs);
		if(lista.contains(novi)!=true) lista.addLast(novi);
		
	}

	@Override
	public void obrisiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		for(int i =0;i<lista.size();i++){
			Kurs trenutni = new Kurs ();
			if(trenutni.getDatum()==dan && trenutni.getValuta().equals(valuta)){
				lista.remove(trenutni);
				break;
			}
			
			
		}
		
		
	}

	@Override
	public Kurs vratiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		for(int i =0;i<lista.size();i++){
			Kurs trenutni = new Kurs ();
			if(trenutni.getDatum()==dan && trenutni.getValuta().equals(valuta)){
				return trenutni;
		   }
	
	      }
	            return null;
	}
}
