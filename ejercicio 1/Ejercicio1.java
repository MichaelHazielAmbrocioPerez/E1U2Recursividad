package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    
    int opc;
    
    do{
        System.out.println("¿Qué operación desea realizar\n"
            +"[1]Serie Fibonacci\n"
            +"[2]Presentar números del 1 al 10\n"
            +"[3]Factorial\n"
            +"[4]Desaparece números\n"
            +"[5]Palindromo\n"    
            +"[6]Salir\n");
        
    opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println(fibonacci(10));
            break;
            
            case 2:
        
            int[] res = {1,2,3,4,5,6,7,8,9,10};
            numeros(res,0);
            
        
            break;
            
            case 3:
                System.out.println(factorial(5));
            break;
            
            case 4:
                System.out.println("No me salió");
            break;
            
            case 5:
            String palabra = "ana lava lana";
            int cont = 1;
            
            for (int i = 0; i < palabra.length(); i++)  {
                
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
            
            cont = 0;
            break;
    
        }
    System.out.println(cont == 1? "es palindromo":"no es ");
    
    }      
            
            break;
            
            case 6:
                
            break;
            default:
                System.out.println("Opción incorrecta");
            break;
        }
        
    }while(opc!=6);
        System.out.println("Entendido, vuelva pronto");
}
private static int fibonacci(int n){
    if (n == 0){
       return 0;   
    }
    else if (n==1) {
        return 1;
    }
    else {
        return fibonacci(n-1) + fibonacci(n-2);
    
    }
}
private static void numeros(int[] res,int rs){
    if (rs == res.length) {
        
    } else {
        System.out.println(res[rs]);
       numeros(res,rs+1);
    }

}
private static int factorial(int n){
    int res;
    
    if (n == 1) {      
        return 1;
    } 
    else {  
        res = n * factorial(n-1);    
    }  
    return res;
}
}
