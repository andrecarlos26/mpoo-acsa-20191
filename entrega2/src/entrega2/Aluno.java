package entrega2;

public class Aluno extends Pessoa{
	private int anoEntrada;
	private int periodoEntrada;

	
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public int getPeriodoEntrada() {
		return periodoEntrada;
	}
	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	
	public void imprimir() {
		System.out.println("--- ALUNO ---");
		System.out.println("O nome do Aluno é: " + this.getNome());
		System.out.println("O CPF do Aluno é: " + this.getCpf());
		System.out.println("Ano entrada: " + this.getAnoEntrada());
		System.out.println("Periodo Entrada: " + this.getPeriodoEntrada());
		
		System.out.println("--- Endereço do Aluno ---");
		System.out.println("Rua: " +  super.getEndereco().getRua());
		System.out.println("Nº: " + super.getEndereco().getNumero());
		System.out.println("Complemento: " + super.getEndereco().getComplemento());
		System.out.println("Cidade: " + super.getEndereco().getCidade());
		System.out.println(" ");
	}
}