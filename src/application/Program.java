package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas aulas tem o curso?");
		int c = sc.nextInt();
		List<Lesson> list = new ArrayList<>();

		for (int i = 1; i <= c; i++) {
			System.out.println("Dados da " + i + "a aula: ");

			System.out.println("Conteúdo ou tarefa (c/t)?");
			char ch = sc.next().charAt(0);

			System.out.println("Título:");
			String title = sc.next();

			
			if (ch == 'c') {
				System.out.println("URL do vídeo:");
				String url = sc.next();

				System.out.println("Duração em segundos:");
				int seconds = sc.nextInt();

				list.add(new Video(title, url, seconds));
				
			} else {
				System.out.println("Descrição:");
				String description = sc.next();

				System.out.println("Quantidade de questões:");
				int question = sc.nextInt();

				list.add(new Task(title, description, question));
			}
		}
		
		int soma = 0;
		
		for (Lesson lesson : list) {

			soma += lesson.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + soma);
		sc.close();
	}

}
