package entrega2;

public class Professor extends Pessoa{
	private java.util.Date admissao;

	public java.util.Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(java.util.Date admissao) {
		this.admissao = admissao;
	}
	
	public void imprimir() {
		System.out.println("--- PROFESSOR ---");
		System.out.println("O nome do Professor �: " + this.getNome());
		System.out.println("O CPF do Professor �: " + this.getCpf());
		System.out.println("Admiss�o: " + this.getAdmissao());
		System.out.println("--- Endere�o do Professor ---");
		System.out.println("Rua: " +  super.getEndereco().getRua());
		System.out.println("N�: " + super.getEndereco().getNumero());
		System.out.println("Complemento: " + super.getEndereco().getComplemento());
		System.out.println("Cidade: " + super.getEndereco().getCidade());
		System.out.println(" ");
	}
}