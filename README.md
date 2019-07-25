# Desafio Projuris

## Em primeiro lugar ultilizei o IntelliJ para programar este desafio

Como foi solicitado no e-mail ultilizarei todos os exercícios via API quando tiver que mandar alguma informação eu ultilizarei um método POST, quando for apenas para pegar informações ultilizarei método do tipo GET. Cada exercício vou colocar aqui como mandar ou pegar as informações (sugiro o uso do postman ou qualquer aplicação que simule os métodos).

comentei nos métodos das classes que tem calculo para melhor entendimento

1) Dados dois arrays, implementar um método que encontre a primeira ocorrência
no segundo array.
Resposta:
Requisição POST para url http://localhost:8080/exercicio1
com body do tipo JSON:
{
	"array": [4, 9, 3, 7, 8, 3, 7, 1],
	"subArray": [3, 7]
}
pode trocar como quiser o body ele retornará apenas o número assim como pedido no desafio.

2) Dado uma String, retornar a primeira letra não duplicada na palavra.
Mostrar a primeira letra não repetida.
####Resposta:
Requisição POST para url http://localhost:8080/exercicio2
com body do tipo JSON:
{
	"palavra": "stress"
}
trocar palavra para mudar retorno.

3) Cada funcionário tem um departamento. String
Cada funcionário tem um salário. BigDecimal
Cada funcionário tem um cargo. String
Dado uma lista de funcionários, seu salário e departamento e cargo, calcule:
● Custo total por departamento
● Custo total por cargo
O retorno deve ser uma implementação da Interface Calculo.
Resposta:
Requisição GET para url http://localhost:8080/exercicio3/total_cargo
retorna Custo total por departamento.
Requisição GET para url http://localhost:8080/exercicio3/total_departamento
retorna Custo total por cargo.


