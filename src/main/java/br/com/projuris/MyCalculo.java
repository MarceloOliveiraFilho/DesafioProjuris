package br.com.projuris;

import java.util.ArrayList;
import java.util.List;

public class MyCalculo implements Calculo {

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		// lista do CustoCargo para retorno
		List<CustoCargo> listaCustoCargo = new ArrayList<CustoCargo>();
		//primeiro um foreach da lista de funcionários da classe FuncionarioLista
		for (Funcionario funcionario : funcionarios) {
			//um lambda para pegar o objeto CustoCargo para poder adicionar o custo para cada cargo
			CustoCargo custoCargo = listaCustoCargo.stream().filter(c -> c.getCargo().equals(funcionario.getCargo()))
					.findFirst().orElse(new CustoCargo());
			custoCargo.setCargo(funcionario.getCargo());
			custoCargo.setCusto(custoCargo.getCusto() == null ? funcionario.getSalario()
					: funcionario.getSalario().add(custoCargo.getCusto()));
			//verificando se é o primeiro item do cargo para apenas adicionar ou adicionar ao montante
			if (listaCustoCargo.indexOf(custoCargo) < 0) {
				listaCustoCargo.add(custoCargo);
			} else {
				listaCustoCargo.set(listaCustoCargo.indexOf(custoCargo), custoCargo);
			}
		}
		//retorna a lista com todas as iterações que passaram no foreach
		return listaCustoCargo;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		//nos dois casos é para adicionar um montante de acordo com cada iten no caso do cargo é o custo por assistente
		//no caso deste método adiciona no montante para cada departamento
		//por esta razão ficam muito parecidos os métodos
		List<CustoDepartamento> listaCustoDepartamento = new ArrayList<CustoDepartamento>();
		for (Funcionario funcionario : funcionarios) {
			CustoDepartamento custoDepartamento = listaCustoDepartamento.stream().filter(c -> c.getDepartamento().equals(funcionario.getDepartamento()))
					.findFirst().orElse(new CustoDepartamento());
			custoDepartamento.setDepartamento(funcionario.getDepartamento());
			custoDepartamento.setCusto(custoDepartamento.getCusto() == null ? funcionario.getSalario()
					: funcionario.getSalario().add(custoDepartamento.getCusto()));
			if (listaCustoDepartamento.indexOf(custoDepartamento) < 0) {
				listaCustoDepartamento.add(custoDepartamento);
			} else {
				listaCustoDepartamento.set(listaCustoDepartamento.indexOf(custoDepartamento), custoDepartamento);
			}
		}
		return listaCustoDepartamento;
	}

}
