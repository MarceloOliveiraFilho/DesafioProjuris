package br.com.projuris;

import java.util.stream.IntStream;

public class MyFindArray implements FindArray {
	public int findArray(int[] array1, int[] array2) {
		//foreach para pegar cada numero no array que compara no caso do exercício 1 o array 2 que compara com o 1
		for (int numeroArray2: array2) {
			//neste retorno ele já faz a validação por lambda retornando o resultado que é encontrar primeiro igual entre array 2 e array 1
			return IntStream.range(0, array1.length)
					.filter(i -> numeroArray2 == array1[i])
					.findFirst()
					.orElse(-1);
		}
		//retorno -1 como pedido na questão pois pode vir vazio
		return -1;
	}
}
