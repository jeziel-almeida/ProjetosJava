
public class TestaAluno {

	private static Aluno aluno1, aluno2, aluno3;
	private static Escola escola;
	
	public static void main(String[] args) {
		
		escola = new Escola("Escola Pedro Cabral", "232.323");
		criarAlunos();
		matricularAlunos();
		escola.agruparAlunos();
		System.out.println(escola.verLista());
		
	}
	
	private static void criarAlunos() {
		aluno1 = new Aluno("Marco Antônio", "Rio de Janeiro");
		aluno2 = new Aluno("Clara Silva", "Sorocaba");
		aluno3 = new Aluno("Ana Beatriz", "Rio de Janeiro");
	}
	
	private static void matricularAlunos() {
		escola.matricularAluno(aluno1);
		escola.matricularAluno(aluno2);
		escola.matricularAluno(aluno3);
	}
}