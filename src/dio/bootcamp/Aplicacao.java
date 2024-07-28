package dio.bootcamp;

import java.time.LocalDate;

public class Aplicacao {

	public static void main(String[] args) {
		
		Cursos cursoUm = new Cursos();
		cursoUm.setTitulo("java");
		cursoUm.setDescricao("Curso de Java");
		cursoUm.setCargaHoraria (8);

        Cursos cursoDois = new Cursos();
        cursoDois.setTitulo("javascript");
        cursoDois.setDescricao("Curso de Javascript");
        cursoDois.setCargaHoraria(4);

        Mentorias mentoriaUm = new Mentorias();
        mentoriaUm.setTitulo("mentoria java");
        mentoriaUm.setDescricao("Mentoria de java");
        mentoriaUm.setDataMentoria(LocalDate.now());
        
        Bootcamp bootcampSantander = new Bootcamp("santander", "Bootcamp Santander DIO", LocalDate.of(2024, 5, 1), LocalDate.of(2024, 7, 29));
        bootcampSantander.adicionarAtividade(cursoUm);
        bootcampSantander.adicionarAtividade(cursoDois);
        bootcampSantander.adicionarAtividade(mentoriaUm);
        
        Devs devUm = new Devs("João da Silva");
        devUm.inscreverBootcamp(bootcampSantander);
        
        Devs devDois = new Devs("Maria das Graças");
        devDois.inscreverBootcamp(bootcampSantander);
                
        bootcampSantander.exibirAtividades();
        bootcampSantander.exibirDevs();
        
        devUm.progredir();
        devUm.progredir();
        devUm.exibirAtividades();
        
        devDois.progredir();
        devDois.exibirAtividades();
        
        bootcampSantander.exibirDevs();
		
	}
	
}
