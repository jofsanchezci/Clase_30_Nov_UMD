import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 0){
        	System.out.println("ERROR");
        }else {
        	int acum=1;
        for (int i=1;i<numero+1;i++){
        	acum*=i;
        	System.out.println(acum);
        }


        
        }

     }
    

    

   
}

