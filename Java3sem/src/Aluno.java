
public class Aluno {
	
	private String matricula, nome, naturalidade;
	
	public Aluno(String nome, String naturalidade) {
		this.nome = nome;
		this.naturalidade = naturalidade;
	}
	
	public String recuperarNaturalidade() {
		return this.naturalidade;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", this.nome, this.naturalidade);
	}
}
