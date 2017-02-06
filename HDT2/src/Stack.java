//Universidad del Valle de Guatemala
//Autores: Mario Hernandez 15135 y Luis Carlo Ramirez 15019

//Descripcion: codigo de Pila que va almacenando los resultados en stack, tambien da los Push y Pop
public interface Stack <T> {

	public void Push(T element);

	public T Pop();

	public boolean IsEmpty();

	public int Size();

	public T get();

}