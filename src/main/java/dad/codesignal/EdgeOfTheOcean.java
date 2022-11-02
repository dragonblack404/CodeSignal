package dad.codesignal;

import java.util.ArrayList;

public class EdgeOfTheOcean {

	public int adjacentElementsProduct(int[] lista) {
		int solution, aux;
		solution = lista[0] * lista[1];
		if (lista.length > 2) {
			for (int i = 1, j = 2; i < lista.length - 1; i++, j++) {
				aux = lista[i] * lista[j];
				if (aux > solution)
					solution = aux;
			}
		}
		return solution;
	}

	public int shapeArea(int n) {
		return n * n + (n - 1) * (n - 1);
	}

	public int makeArrayConsecutive2(int[] statues) {
		int min = statues[0], max = 0, longArray = statues.length, solution;
		if (longArray == 1)
			solution = 0;
		else {
			for (int i = 1; i < longArray; i++) {
				if (statues[i] < min) {
					if (min > max) {
						max = min;
						min = statues[i];
					} else
						min = statues[i];
				} else if (statues[i] > max)
					max = statues[i];
			}
			solution = max - min + 1 - longArray;
		}

		return solution;
	}

	public boolean almostIncreasingSequence(int[] sequence) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		boolean comprobador = true;
		int aux = 0, cont = -1, bandera = 0, martir = 0, limite = 0;
		for (int i = 0; i < sequence.length; i++) {
			lista.add(sequence[i]);
		}
		while (cont < sequence.length - limite) {
			cont++;
			for (int j = 1; j < lista.size() && comprobador; j++) {
				if (lista.get(j - 1) >= lista.get(j)) {
					comprobador = false;
					bandera = j - 1;
				}
			}
			if (comprobador)
				return true;
			else {
				if (cont == 0) {
					aux = lista.remove(bandera);
					martir = bandera;
					limite = bandera;
				} else if (cont != 0 & martir < lista.size()) {
					lista.add(martir, aux);
					martir++;
					aux = lista.remove(martir);
				}
			}
			comprobador = true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = { 3, 5, 67, 98, 3 };
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			lista.add(list[i]);
		}
		EdgeOfTheOcean eoto = new EdgeOfTheOcean();
		System.out.println(eoto.almostIncreasingSequence(list));
//		System.out.println(lista);
//		lista.remove(1);
//		System.out.println(lista);
//		lista.add(1, 5);
//		System.out.println(lista);
		System.out.println(list.length);
	}

}
