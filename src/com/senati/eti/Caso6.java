package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][] datos = {{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
							{"Callao", "Comas", "Puente Piedra"}};
		
		
		// datos.length   -> Cantidad de filas de la matriz
		
		System.out.println("---------IMPRESION POR FILAS-----------");
		System.out.println("---------------------------------------");
		System.out.println("");

		for (int f = 0; f < datos.length; f++) {
			
			for (int c = 0; c < datos[0].length; c++)
				
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		
		System.out.println("---------IMPRESION POR COlUMNAS-----------");
		System.out.println("---------------------------------------");
		System.out.println("");

		for (int c = 0; c < datos[0].length; c++) {
			
			for (int f = 0; f < datos.length; f++)
				
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		

	}
}