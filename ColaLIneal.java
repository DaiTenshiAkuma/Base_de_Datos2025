import java.util.Scanner;

public class ColaLineal {
	
	private static final int MAXTAMQ=10;
	 protected int frente;
	 protected int fin;
	 protected int []listaCola;

	 //Constructor
 public ColaLineal() {
	 // TODO Auto-generated constructor stub
	 frente=0;
	 fin=-1;
	 listaCola =new int [MAXTAMQ];
	 }
 //operaciones
 public void insertar(int elemento) throws Exception
 {
  if(!colaLlena())
  {
  listaCola[++fin]=elemento;
  }
  else
 throw new Exception("OverFlow: cola llena");

  }
 
 public int quitar() throws Exception
  {
  if(!colaVacia())
  return listaCola[frente++];
  else
  throw new Exception("Cola Vacia: Empty Queue");
  }
 
 //vaciar la cola
  public void borrarCola()
  {
  frente=0;
  fin=-1;
  }
 
 //acceso a la cola: ver elemento frente
  public int frenteCola() throws Exception
  {
  if(!colaVacia())
 return listaCola[frente];
 else
 throw new Exception("Cola Vacia: Empty Queue");
 }
  //verificación estado de la cola
  public boolean colaVacia()
  {
  if(frente>fin)
  return true;
 else
  return false;
  }
 
 public boolean colaLlena()
  {
  if(fin==MAXTAMQ-1)
  return true;
  else
  return false;
 
  }
 
  public static void main(String[] args) {
  // TODO Auto-generated method stub
 System.out.println("Programa ejemplo Cola Simple ITST\n\n");
 
 int x; //variable auxiliar para introducir elementos
  final int CLAVE = -1;
 
  Scanner sc=new Scanner(System.in);
 
  System.out.println("Teclea los elemento (termina con -1).");
  try
  {
  ColaLineal queue=new ColaLineal(); //crea cola vacia
  int i=0;
  do {
 System.out.print(i+"=");
  x = sc.nextInt(); //introduce elemento desde el teclado
  queue.insertar(x);
  i++;
  }while (x != CLAVE);
 
  System.out.println("Elementos de la Pila: ");
 
 while (!queue.colaVacia())
{
  x = queue.quitar(); //saca elemento de la cola y lo guarda en x
  System.out.print(x + " ");
 }
 
  x=queue.quitar();
  }
  catch (Exception er)
  {
  System.err.println("Excepcion: " + er);
  }
  }//fin main

}
