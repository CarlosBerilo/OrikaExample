package com.orikaexample.demo.mapper;

import com.orikaexample.demo.model.Ordem;
import com.orikaexample.demo.model.OrdemDTO;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrdemMapper extends ConfigurableMapper{
	
	protected void configure(MapperFactory factory) {
		factory.classMap(Ordem.class, OrdemDTO.class)
		.field("cliente.nome.nome", "clienteNome")
		.field("cliente.nome.sobreNome", "clienteSobreNome")
		.field("enderecoFinanceiro.rua", "enderecoRua")
		.field("enderecoFinanceiro.cidade", "enderecoCidade")
		.byDefault()
		.register(); 
	}
	
}
