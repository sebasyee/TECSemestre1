import java.util.*;
public class Contraseña {
static Random rnd = new Random();
	public static void main(String[] args) {
      String datos ="ABCDEFGHIJKLMNOPQRSTWXYZabcdefghijklmnopqrstwxyz0123456789!@/";
              
              Scanner sc= new Scanner(System.in);
    		  int tamPas=-1,op=0;
    		  String pass = "";
    		  
    		  do {
    			 tamPas = rnd.nextInt(8)+ 8;
    			 pass =crearContra( tamPas, datos);
    			 System.out.println("la contraseña generada es:" + pass + ". Deseas generar otra?");
    			 op = sc.nextInt();
    		  }while (op==1);
	}
    public static String crearContra(int tam, String datos) {
    	String result="";
    	for( int i= 0; i <tam; i++) {
    		result += datos.charAt(rnd.nextInt(0|datos.length()-1)); 
    	}
    	return result;
    }
}
