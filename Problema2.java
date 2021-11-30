package laborator4;

import java.util.*;

class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;
 
    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }
 
    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }
 
    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }
 
    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }
 
    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }
 
    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }
 
    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }
 
    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }
 
    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {
	
	public void add (int value) {
		super.addElement(value);
		super.sort();
	}
	
	public void sort () {
		super.sort();
	}
}

class MyStack{
	Array stack = new Array();
	
	public void push (int value) {
		stack.addElement(value, 0);
	}
	
	public void pop () {
		//int elem = stack.get(0);
		System.out.print(stack.remove(0));
	}
	
	public void displayStack() {
		for (int i = 0; i < stack.getSize(); i++) {
			System.out.print(stack.get(i) + "\n");
		}
	}
}

public class Problema2 {

	public static void main(String[] args) {
		SortedArray array = new SortedArray();
		array.add(9);
		array.add(12);
		array.add(3);
		array.add(40);
		System.out.println (array);
		/*MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.displayStack();
		s.pop();
		s.push(5);
		s.pop();
		s.pop();
		s.displayStack();*/
	}

}
