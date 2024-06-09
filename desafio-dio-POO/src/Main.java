import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);


		Curso curso2 = new Curso();

		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Descrição Curso Python");
		curso2.setCargaHoraria(18);


		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição da Mnetoria Java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println("\n\n");
		System.out.println(curso2);
		System.out.println("\n\n");
		System.out.println(mentoria);

	}
}
