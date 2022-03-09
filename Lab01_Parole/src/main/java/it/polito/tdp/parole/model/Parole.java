package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> parole;
	
	public Parole() {
		parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(parole, new Comparatore());
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

	

}
