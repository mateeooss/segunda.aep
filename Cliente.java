package atividade;

public class Cliente {
	private String nome;
	private String cpf;
	private double conta;
	private boolean confirmacao_pagamento;

	
	 public void novoCliente(String nome, String cpf, double conta) {
	    this.nome=nome;  
			this.cpf=cpf;
			this.conta=conta;
			
			System.out.println("nome:"+nome+"\ncpf:"+cpf+"\nconta pendente: R$ "+conta+"\nCONTA CRIADA COM SUCESSO!\n\n");
		   }
	
	public void pagar_conta(double pagamento){
		this.conta=conta-pagamento;
		System.out.println("\nnome: "+this.nome+"\nrestante a pagar: R$"+this.conta+"\n");
		if(conta<=0.0) {
			this.confirmacao_pagamento=true;
		}
	}
	
	public void zerar_conta() {
		   if(this.confirmacao_pagamento == true) {
		      this.conta=0.0;	  
		      System.out.println("\n\nnome: "+this.nome+" | conta: quitada!");
		   }else {
			   System.out.println("\n\nerro em quitar a conta de "+this.nome+" !");
			   throw new RuntimeException("a conta ainda esta pendente!"); 
		   }
	}
}

