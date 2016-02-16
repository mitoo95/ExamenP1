import java.util.Scanner;

public class ExamenI{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		int p = 0, x = 0, w = 0, o=0;
		char menu;

		System.out.print("Ingrese cantidad total de juegos: ");
		int cant = rd.nextInt();

		System.out.println("Ingrese texto p o P, x o X, w o W, o u O por cada juego que se tenga(p,P=PS3;x,X=Xbox;w,W=Wii;o,O=Otro): ");
		char juego = rd.next().charAt(0);

		switch(menu)
		case 'P': p++;
		continue;
		case 'p': p++;
		continue;
		case 'X': x++;
		continue;
		case 'x': x++;
		continue;
		case 'o': main ExamenI(null);
		continue;
		case 'O'
		System.out.println("Ps3: "+p +"\nXbox"+x +"\nWii")
	}
}