package com.orikaexample.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.orikaexample.demo.mapper.OrdemMapper;
import com.orikaexample.demo.model.Cliente;
import com.orikaexample.demo.model.Endereco;
import com.orikaexample.demo.model.Nome;
import com.orikaexample.demo.model.Ordem;
import com.orikaexample.demo.model.OrdemDTO;


@SpringBootTest
class OricaexampleApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testMapperOrika() {
		OrdemMapper  ordemDTOMapper = new OrdemMapper();
	    
		Ordem ordem = new Ordem();
		ordem.setCliente(new Cliente(new Nome("Davi", "Silva")));
		ordem.setEnderecoFinanceiro(new Endereco("Av. Matheus", "Tel Aviv"));
		
		OrdemDTO ordemDTO = ordemDTOMapper.map(ordem, OrdemDTO.class);
		
		assertEquals(ordem.getCliente().getNome().getNome(), ordemDTO.getClienteNome());
		assertEquals(ordem.getCliente().getNome().getSobreNome(), ordemDTO.getClienteSobreNome());
		assertEquals(ordem.getEnderecoFinanceiro().getRua(), ordemDTO.getEnderecoRua());
		assertEquals(ordem.getEnderecoFinanceiro().getCidade(), ordemDTO.getEnderecoCidade());
		
		Ordem ordem2 = new Ordem();
		ordem2.setCliente(new Cliente(new Nome("Elias", "Oliveira")));
		ordem2.setEnderecoFinanceiro(new Endereco("Av. Pedro", "Tel Aviv"));
		
		OrdemDTO ordemDTO2 = ordemDTOMapper.map(ordem2, OrdemDTO.class);
		
		assertEquals("Elias", ordemDTO2.getClienteNome());
		assertEquals("Oliveira", ordemDTO2.getClienteSobreNome());
		assertEquals("Av. Pedro", ordemDTO2.getEnderecoRua());
		assertEquals("Tel Aviv", ordemDTO2.getEnderecoCidade());

	}

}
