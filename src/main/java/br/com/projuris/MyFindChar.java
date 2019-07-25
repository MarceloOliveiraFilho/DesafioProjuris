package br.com.projuris;

public class MyFindChar implements FindCharachter {
	//primeiro um int dos caracteres pois é um char e tem apenas esse numero em char set 2^8
	private int chars = 256;
	//pegando o total de chars e passando para um array cada um deles
	private char[] contador = new char[chars];

	public String findChar(String palavra) {
		//armazenando espaço no charset de acordo com o tamanho da palavra
		for (int i = 0; i < palavra.length();  i++){
			//adicionando um numero para cada letra igual encontrada
			contador[palavra.charAt(i)]++;
		}
		//criando um index -1 pois é onde começa a array
		int index = -1, i;
		//o i vai ter o tamanho dos caracteres
		for (i = 0; i < palavra.length();  i++)
		{
			//verificando a primeira iteração que tem o numero 1 pois no for acima adicionou apenas 1 vez
			if (contador[palavra.charAt(i)] == 1)
			{
				//se é = 1 dá um break e para o foreach e retornar o idex ou seja a letra
				index = i;
				break;
			}
		}
		//se não achar nenhuma interação retorna o que foi pedido no exercício
		if (index == -1){
			return "‘ ’";
		}
		return String.valueOf(palavra.charAt(index));

	}
}
