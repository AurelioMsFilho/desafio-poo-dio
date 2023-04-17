import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java do básico ao avançado");
        curso1.setCargaHoraria(120);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python3");
        curso2.setDescricao("Curso Python do básico ao avançado");
        curso2.setCargaHoraria(108);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Aurélio Filho");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos "+dev1.getNome() +" \n"+ dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularTotalXp());


        System.out.println("-----------");
        Dev dev2 = new Dev();
        dev2.setNome("Shakira");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-----------");
        System.out.println("Conteudos inscritos " +dev2.getNome() +" \n"+ dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());




    }
}