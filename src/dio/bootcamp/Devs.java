package dio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Devs {

	private String nome;
	private double totalXp;
	private Set<Atividades> atividadesInscritas;
	private Set<Atividades> atividadesConcluidas;
	
	public Devs(String nome) {
		this.nome = nome;
		this.totalXp = 0;
		atividadesInscritas = new LinkedHashSet<>();
		atividadesConcluidas = new LinkedHashSet<>();
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		atividadesInscritas.addAll(bootcamp.getAtividades());
		bootcamp.adicionarDevInscrito(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getTotalXp() {
		return totalXp;
	}

	public void progredir() {
        Optional<Atividades> atividade = this.atividadesInscritas.stream().findFirst();
        
        if (atividade.isPresent()) {
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesInscritas.remove(atividade.get());
            
            calcularTotalXp(atividade.get());
        } 
        else {
            System.err.println("Você não possui inscrição em nenhuma Atividade!");
        }
	}
	
	public void calcularTotalXp(Atividades atividade) {
		totalXp += atividade.calcularXp();
	}
	
	public void exibirAtividades() {
		
		if (!this.atividadesInscritas.isEmpty()) {
			System.out.println("=== ATIVIDADES INSCRITAS - " + nome + " ===");
			this.atividadesInscritas.forEach(ai -> System.out.println(ai));
			System.out.println("");
		}
		
		if (!this.atividadesConcluidas.isEmpty()) {
			System.out.println("=== ATIVIDADES CONCLUÍDAS - " + nome + " ===");
			this.atividadesConcluidas.forEach(ac -> System.out.println(ac));
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return "Dev { nome = " + nome + ", totalXp = " + totalXp + " }";
	}
	
}
