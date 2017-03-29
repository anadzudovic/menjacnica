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
		novi.setKupovniKurs(kupovniKurs);
		novi.setProdajniKurs(prodajniKurs);
		novi.setSrednjiKurs(SrednjiKurs);
		novi.setValuta(valuta);
		lista.add(novi);
	}

	@Override
	public void obrisiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		for (int i =0;i<lista.size();i++){
			if(lista.get(i).getDatum()==dan && lista.get(i).getValuta().equals(valuta)){
				lista.remove(i);
				return;
			}
		}
		
	}

	@Override
	public Kurs vratiKursValuteZaDan(GregorianCalendar dan, Valuta valuta) {
		for (int i =0;i<lista.size();i++){
			if(lista.get(i).getDatum()==dan && lista.get(i).getValuta().equals(valuta)){
				return lista.get(i);
			}
			}
		throw new RuntimeException("Nema kursa za taj dan i tu valutu u listi");
	}
	

}
