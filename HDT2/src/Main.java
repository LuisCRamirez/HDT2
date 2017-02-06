//Universidad del Valle de Guatemala
//Autores: Mario Hernandez 15135 y Luis Carlo Ramirez 15019

//Descripcion: codigo principal que lee el archivo y muestra el resultado


public class Main {

	public static void main(String[] args){

		Traductor trans = new Traductor();

		int resultado = trans.Calcular(trans.LeerArchivo("datos.txt"));

		System.out.println(String.valueOf("El resultado es: " + resultado));

	}
}
