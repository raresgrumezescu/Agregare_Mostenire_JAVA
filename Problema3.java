package laborator4;

import java.util.*;

class HSet extends Hashtable {
	//Adauga un element in multime, daca nu exista deja
	public boolean add(Object value) {
		if (this.isEmpty() == true) {
			this.put (value, value);
		}
		else if (this.containsValue(value) == false) {
			this.put (value, value);
		}
		return true;
	}
	//returneaza un String cu elementele multimii (doar cheile, nu perechi)
	public String toString() {
		return keySet().toString();
	}
	//Sterge perechea corespunzatoare cheii, intorcand valoarea
	public Object remove(Object key) {
		if (this.containsKey(key) == true) {
			super.remove(key);
		}
		return key;
	}
}

public class Problema3 {

	 public static void main(String args[]) {
	        HSet set = new HSet();
	        set.add("Laborator");
	        set.add("Agregare");
	        set.add("Mostenire");
	        System.out.println(set);
	        System.out.println(set.size());
	        set.add("Laborator");
	        if(set.size() == 4) {
	            System.out.println("Multimea nu trebuie sa contina duplicate!");
	        }
	        System.out.println(set.remove("POO"));
	        System.out.println(set.remove("Laborator"));
	        if(set.size() != 2) {
	            System.out.println("Stergerea nu functioneaza!");
	        }
	        set.add("Supradefinire");
	        set.add("Supraincarcare");
	        System.out.println(set);
	    }

}
