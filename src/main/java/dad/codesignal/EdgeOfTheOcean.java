package dad.codesignal;

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

	@SuppressWarnings("unused")
	public int makeArrayConsecutive(int[] statues) {
		int min, max = statues[0], longArray = statues.length;
		if (longArray > 1)
			for (int i = 1; i < statues.length; i++) {
				if (statues[i] < max)
					min = statues[i];
				else {
					min = max;
					max = statues[i];
				}
			}
		else
			return max - 1;

		return max - longArray;

	}

}
