
public class Main {
	public static void main(String[] args){
		Traductor trans = new Traductor();
		int resultado = trans.Calcular(trans.LeerArchivo("datos.txt"));
		System.out.println(String.valueOf("El resultado es: " + resultado));
	}
}
