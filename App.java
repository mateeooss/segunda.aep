package atividade;

import aulaarthur.Paciente;

public class App {
	public static void main(String[] args) {
		  Cliente renata= new Cliente();	
		  Cliente reginaldo= new Cliente();
      renata.novoCliente("renata","119.862.543.56",300.00);
      reginaldo.novoCliente("reginaldo","112.462.553.20",1000.00);	 
      renata.pagar_conta(200.00);
      reginaldo.pagar_conta(1000.00);
      reginaldo.zerar_conta();

      try{
         renata.zerar_conta();
 	    }catch(RuntimeException e){
 	          System.out.println("Mensagem da exceção: "+e.getMessage());
 	      }

	}
}
