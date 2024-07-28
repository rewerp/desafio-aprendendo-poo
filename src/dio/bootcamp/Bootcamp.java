package dio.bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private Set<Devs> devsInscritos = new HashSet<>();
    private Set<Atividades> atividades = new LinkedHashSet<>();
    
    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
    	this.nome = nome;
    	this.descricao = descricao;
    	this.dataInicial = dataInicial;
    	this.dataFinal = dataFinal;
    }
    
    public void adicionarAtividade(Atividades atividade) {
    	atividades.add(atividade);
    }
    
    public void adicionarDevInscrito(Devs dev) {
    	devsInscritos.add(dev);
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public Set<Devs> getDevsInscritos() {
		return devsInscritos;
	}

	public Set<Atividades> getAtividades() {
		return atividades;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public void exibirAtividades() {
		if (!atividades.isEmpty()) {
			System.out.println("=== ATIVIDADES DO BOOTCAMP ===");
			atividades.forEach(a -> System.out.println(a));
			System.out.println("");
		}
	}
	
	public void exibirDevs() {
		System.out.println("=== DEVS INSCRITOS NO BOOTCAMP ===");
		devsInscritos.forEach(d -> System.out.println(d));
		System.out.println("");
	}
	
}
