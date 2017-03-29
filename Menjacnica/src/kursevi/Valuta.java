package kursevi;

import kursevi.Valuta;

public class Valuta {
	private String naziv;
	private String oznaka;
	public String getNaziv() {
		return naziv;
	}
	public String getOznaka() {
		return oznaka;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((oznaka == null) ? 0 : oznaka.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (oznaka == null) {
			if (other.oznaka != null)
				return false;
		} else if (!oznaka.equals(other.oznaka))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", oznaka=" + oznaka + "]";
	}

}
