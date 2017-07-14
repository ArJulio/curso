import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String nombre=consola.nextLine();
        System.out.print("Hi "+nombre+ " , which do you choose? (O)dds or (E)vens?");
        String elegir=consola.next();
        if(elegir.equals("O") || elegir.equals("o")){
        	System.out.println(nombre+ " has picked odds! The computer will be evens");
        }else if(elegir.equals("E") || elegir.equals("e")){
        	System.out.println(nombre+ " has picked evens! The computer will be odds");
        }
        System.out.println("-----------------------------------------");
        System.out.print("How many \"fingers\" do you put out ?");
        int jugador = consola.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println(nombre+ " plays "+jugador+ " \"fingers\"");
        System.out.println("The computer plays "+computer+ " \"fingers\"");
        System.out.println("-----------------------------------------");
        int sum = jugador + computer;
        System.out.println(jugador+ " + " +computer+ " = "+sum);
        boolean oddOrEven = sum % 2 == 0;
        if(oddOrEven){
        	System.out.println(sum+ " is ... even!");
        	if(elegir.equals("E") || elegir.equals("e")){
        		System.out.println(nombre+ " wins");
        	}else{
        		System.out.println("The computer wins");
        	}
        }else{
        	System.out.println(sum+ " is ... odd!");
        	if(elegir.equals("O") || elegir.equals("o")){
        		System.out.println(nombre+ " wins");
        	}else{
        		System.out.println("The computer wins");
        	}
        }
        System.out.println("-----------------------------------------");
        consola.close();
	}

}
