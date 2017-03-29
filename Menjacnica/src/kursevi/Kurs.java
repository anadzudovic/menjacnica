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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Kurs))
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null) 
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", valuta=" + valuta + ", prodajniKurs=" + prodajniKurs + ", kupovniKurs="
				+ kupovniKurs + ", srednjiKurs=" + srednjiKurs + "]";
	}

}
