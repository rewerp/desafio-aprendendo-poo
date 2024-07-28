package dio.bootcamp;

import java.time.LocalDate;

public class Mentorias extends Atividades {
	
	private static final double XP_MENTORIA = 25d;

	private LocalDate dataMentoria;
	
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}

	@Override
	protected double calcularXp() {
		return XP_MENTORIA;
	}

	@Override
	public String toString() {
		return "Mentoria { titulo = " + titulo + ", descricao = " + descricao + ", dataMentoria = " + dataMentoria + " }";
	}
	
}
