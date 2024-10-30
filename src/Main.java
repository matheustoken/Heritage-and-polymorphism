import Entities.Lesson;
import Entities.Task;
import Entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da #" + i + " Aula");
            System.out.print("Conteúdo ou Tarefa? (c/t) ");
            char ch = sc.next().charAt(0);

            if (ch == 'c') {
                System.out.print("Título: ");
                sc.nextLine();
                String title = sc.nextLine();
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                Lesson less = new Video(title, url, seconds);
                list.add(less);
            } else if (ch == 't') {
                System.out.print("Título: ");
                sc.nextLine();
                String title = sc.nextLine();
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                Lesson less = new Task(title, description, questionCount);
                list.add(less);
            }
        }

        double total = 0.0;
        for (Lesson less : list) {
            total += less.duration();
        }
        System.out.printf("DURAÇÃO TOTAL DO CURSO: %.2f segundos%n", total);

        sc.close();
    }
}