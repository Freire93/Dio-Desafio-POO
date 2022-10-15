import br.com.dio.desafio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição: curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição: curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição: mentoria java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonatas = new Dev();
        devJonatas.setNome("Jonatas");
        devJonatas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jonatas: " + devJonatas.getConteudosInscritos());
        devJonatas.progredir();
        devJonatas.progredir();
        System.out.println("---");
        System.out.println("Conteudos Concluidos Jonatas: " + devJonatas.getConteudosConcluidos());
        System.out.println("XP: "+ devJonatas.calcularTotalXp());
        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos Concluidos Joao: " + devJonatas.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());








    }
}
