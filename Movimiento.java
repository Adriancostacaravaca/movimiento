import java.util.Scanner;

	public class Movimiento {


		public static void main(String[] args) {
			
				int ejeX = 4;
				int ejeY = 6;
				Scanner sc = new Scanner(System.in);
				
				int movimiento;
				int casillas;
				System.out.println("Tu personaje se encuentra en la posición (" + ejeX + ", " + ejeY + ")");
				
				boolean correcto = true;
				
				while (correcto) {
					System.out.println("Introduce tu siguiente movimiento:");
					System.out.println("1. Arriba");
					System.out.println("2. Abajo");
					System.out.println("3. Izquierda");
					System.out.println("4. Derecha");
					System.out.println("5. Fin");
					movimiento = sc.nextInt();
					
					if (movimiento == 5) {
						System.err.println("Fin");
						break;
					}
					System.out.println("Introduce el número de casillas a mover:");
					casillas = sc.nextInt();
					
					switch (movimiento) {
					
						case 1:
							ejeY = ejeY + casillas;
							System.out.println("El personaje se mueve a la posición x = " + ejeX + ", y = " + ejeY);
							break;
						
						case 2:
							ejeY = ejeY - casillas;
							System.out.println("El personaje se mueve a la posición x = " + ejeX + ", y = " + ejeY);
							break;
						
						case 3:
							ejeX = ejeX - casillas;
							System.out.println("El personaje se mueve a la posición x = " + ejeX + ", y = " + ejeY);
							break;	
							
						case 4:
							ejeX = ejeX + casillas;
							System.out.println("El personaje se mueve a la posición x = " + ejeX + ", y = " + ejeY);
							break;
							
						case 5:
							System.err.println("Fin");
							correcto = false;
							break;
					}
					
				}
				

				sc.close();
				
			}

}

