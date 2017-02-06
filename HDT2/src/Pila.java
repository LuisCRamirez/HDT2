//Universidad del Valle de Guatemala
//Autores: Mario Hernandez 15135 y Luis Carlo Ramirez 15019

//Descripcion: codigo de Pila que va almacenando los resultados en pila 
import java.util.Vector;



public class Pila implements Stack {

	private Vector stack = new Vector();

	
 //en pila 
	@Override

	public void Push(Object t) {

		stack.addElement(t);

	}



	@Override

	public Object Pop() {

		return stack.remove(stack.size()-1);

                

	}



	@Override

	public boolean IsEmpty() {

		return stack.isEmpty();

	}



	@Override

	public int Size() {

		return stack.size();

	}



	@Override

	public Object get() {

		return null;

	}



}