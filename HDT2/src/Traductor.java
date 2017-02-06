import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Traductor implements InterfazTrans {

	Pila pila = new Pila();
	String operaciones;
	
	@Override
	public int Calcular(String ops) {
		int resultado = 0; 
		
		String[] separar = ops.split(" "); //Instruccion para separar cada caracter entre cada espacion que haya
		for(int i=0; i<separar.length; i++){ 
			try{
				pila.Push(Integer.parseInt(separar[i])); //Si se puede convertir es porque es un num
				
			}catch(Exception e){//Si no se convierte a num, es porque es un operando            
                try{ 
                    int b = (int)pila.Pop();
                    int a = (int)pila.Pop();
					switch(separar[i]){

						case "+":
							resultado = a+b;
							pila.Push(resultado);
                            	System.out.println(String.valueOf("Se sumo "+a+" y " + b));
							break;
							
						case "*":
							resultado = a*b;
							pila.Push(resultado);
                             	System.out.println(String.valueOf("Se multiplico "+a+" por " + b));
							break;
							 
						case "/":
							resultado = a/b;
							pila.Push(resultado);
                                System.out.println(String.valueOf("Se dividio "+ a + " entre "+ b));
							break;
		                                        
		                case "-":
							resultado = a-b;
							pila.Push(resultado);
                                System.out.println(String.valueOf("Se le resto "+ b + " a "+ a));
							break;
							
                                default:
                                System.out.println(String.valueOf("El codigo ingresado no es postfix"));
					}
					
                }
                catch(Exception error){
                    System.out.println(String.valueOf("El codigo ingresado no es postfix"));
                }
			}
		}
		
		return resultado;
	}

	//Metodo para leer el archivo de texto
	@Override
	public String LeerArchivo(String direccion) {
		String instrucciones = "";
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				temp = temp + bfRead;				
			}
			
		instrucciones = temp;
		
		}
		catch(Exception e){
			System.err.println("No es posible leer el archivo");
		}
		return instrucciones;
	}

	@Override
	public String ToString() {
		return null;
	}

}

