package com.orikaexample.demo.model;

public class Ordem {
private Cliente cliente;
private Endereco enderecoFinanceiro;
public Ordem() {
	super();
}
public Ordem(Cliente cliente, Endereco enderecoFinanceiro) {
	super();
	this.cliente = cliente;
	this.enderecoFinanceiro = enderecoFinanceiro;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Endereco getEnderecoFinanceiro() {
	return enderecoFinanceiro;
}
public void setEnderecoFinanceiro(Endereco enderecoFinanceiro) {
	this.enderecoFinanceiro = enderecoFinanceiro;
}


}
