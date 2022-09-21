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

}