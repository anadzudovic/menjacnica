package kursevi;

import java.util.GregorianCalendar;

import kursevi.Valuta;

public class Kurs {
	private GregorianCalendar datum;
	private Valuta valuta;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	public GregorianCalendar getDatum() {
		return datum;
	}
	public Valuta getValuta() {
		return valuta;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	

}
