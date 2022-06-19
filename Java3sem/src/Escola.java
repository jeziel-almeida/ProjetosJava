import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Escola {
	
	private String nome, CNPJ;
	//private Endereco endereco;
	//private List departamentos;
	private List<Aluno> discentes;
	
	public Escola(String nome, String CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		//this.departamentos = new ArrayList<Departamento>();
		this.discentes = new ArrayList<>();
	}
	
	public void matricularAluno(Aluno novoAluno) {
		discentes.add(novoAluno);
	}
	
	public List<Aluno> verLista() {
		return this.discentes;
	}
	
	public void agruparAlunos() {
		Map < String, List<Aluno> > agrupamento = discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
		System.out.println("Resultado do agrupamento por naturalidade: ");
		agrupamento.forEach((String chave, List<Aluno> lista) -> System.out.println(chave + " => " + lista));
	}
}
