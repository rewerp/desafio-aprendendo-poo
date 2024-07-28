package dio.bootcamp;

public class Cursos extends Atividades {
	
	private static final double XP_CURSO = 20d;

	private double cargaHoraria;

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	protected double calcularXp() {
		return XP_CURSO;
	}

	@Override
	public String toString() {
		return "Curso { titulo = " + titulo + ", descricao = " + descricao + ", cargaHoraria = " + cargaHoraria + " }";
	}
	
}
