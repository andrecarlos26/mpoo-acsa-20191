package entrega2;

public class Application {

	public static void main(String[] args) {
		
		/* Inicialmente instanciei um novo aluno com seus atributos da classe Aluno
		 * e da classe Pessoa que a classe Aluno herdou.
		 * Isso foi feito com o Aluno01 e Professor01.
		 * Também instanciei um novo endereço para o novo objeto aluno01 em que eu chamei
		 * de enderecoAluno01 e também criei um novo endereço para o objeto professor01
		 * que eu chamei de enderecoProfessor01
		 */
		Endereco enderecoAluno01 = new Endereco();
		enderecoAluno01.setRua("rua Gabriel Caboclo");
		enderecoAluno01.setNumero(99);
		enderecoAluno01.setComplemento("Casa");
		enderecoAluno01.setCidade("Recife");
		
		Aluno aluno01 = new Aluno();
		aluno01.setNome("André");
		aluno01.setCpf("123456789");
		aluno01.setPeriodoEntrada(1);
		aluno01.setAnoEntrada(2018);
		aluno01.setEndereco(enderecoAluno01);
		
		Endereco enderecoProfessor01 = new Endereco();
		enderecoProfessor01.setRua("rua Gerson Gonçalves");
		enderecoProfessor01.setNumero(100);
		enderecoProfessor01.setComplemento("Casa");
		enderecoProfessor01.setCidade("Camaragibe");
		
		Professor professor01 = new Professor();
		professor01.setNome("Bruno da Silva");
		professor01.setCpf("7894561230");
		professor01.setAdmissao(new java.util.Date());
		professor01.setEndereco(enderecoProfessor01);
		
		/* Agora o aluno01 também se tornou professor, então eu usei os métodos Getters
		 * e Setters. Desta forma eu criei um novo objeto chamado professor02 e utilizei
		 * o método set e passei como parâmetro o getNome() do aluno01.
		 * Fiz a mesma coisa para seus outros atributos: CPF e Endereço.
		 */
		
		Professor professor02 = new Professor();
		professor02.setNome(aluno01.getNome());
		professor02.setCpf(aluno01.getCpf());
		professor02.setAdmissao(new java.util.Date());
		
		professor02.setEndereco(aluno01.getEndereco());
		
		/* Nesta parte o professor01 se tornou aluno, então eu também utilizei os métodos
		 * Getters e Setters para. Também criei um novo objeto aluno02 e utilizei o
		 * método set e passei como parâmetro o getNome() do professor01.
		 * Fiz a mesma coisa para seus outros atributos: CPF e Endereço.
		 */
		Aluno aluno02 = new Aluno();
		aluno02.setNome(professor01.getNome());
		aluno02.setCpf(professor01.getCpf());
		
		aluno02.setEndereco(professor01.getEndereco());
		
		// Criei o método imprimir() na classe aluno e professor
		
		aluno01.imprimir();
		professor02.imprimir();
		aluno02.imprimir();
		professor01.imprimir();
		
	}

}
