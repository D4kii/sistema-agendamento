package br.senai.sp.jandira.testes;

import java.util.ArrayList;

//import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int[] a = {6, 9, 87, 35, 96};
        int[] b = new int[4];
        b[0] = 55;
        b[1] = 55;
        b[2] = 11;
        b[3] = 99;
        
        int[][] c = {
            {4, 6, 5},
            {5, 9, 7},
            {1, 13, 3},
            {5, 5, 8}
        };
        
        String[][] quitanda = {
            {"banana","Maçã", "Uva", "Morango"},
            {"Alface", "Couve", "Pepino", "Salsinha", "Pimentão", "Brócolis"},
            {"Abacate", "Tomate", "Jiló", "Abóbora"}
        };
        
        System.out.println(quitanda[1][4]);
        System.out.println(c[2][1]);
        
        System.out.println("*******************************************************");

        Especialidade e1 = new Especialidade("Cardiologia");
        //e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque.");
        
        EspecialidadeDao.gravar(e1);

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga.");
        
        EspecialidadeDao.gravar(e2);

        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido;");

        EspecialidadeDao.gravar(e4);
        
        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa!");
        
        EspecialidadeDao.gravar(e3);

        Especialidade e5 = new Especialidade();
        e5.setNome("Especialidade 5");
        
        EspecialidadeDao.gravar(e5);
        
        for (Especialidade ee : EspecialidadeDao.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        
        EspecialidadeDao.excluir(101);
        System.out.println("---------------------------------------");
        for (Especialidade ee : EspecialidadeDao.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        
        System.out.println("-------------BUSCA-------------");
        Especialidade procurada = EspecialidadeDao.getEspecialidade(102);
        System.out.println(procurada.getNome());
        
        System.out.println("-----------UPDATE------------");
        Especialidade especialidadeAtualizada = new Especialidade();
        especialidadeAtualizada.setCodigo(104);
        especialidadeAtualizada.setNome("Otorrinolaringologia");
        especialidadeAtualizada.setDescricao("Essa é uma nova descrição");
        EspecialidadeDao.atualizar(especialidadeAtualizada);
        
        System.out.println("------------------NOVO RESULTADO---------------------");
        for (Especialidade ee : EspecialidadeDao.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        
        // Exibir a quantidade de especialidades criadas até agora
        System.out.println("TOTAL DE ESPECIALIDADES -----> " + e1.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());
        System.out.println(e5.getCodigo() + " - " + e5.getNome());

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        // Imprimir no console o nome das especialidades
        // que estão armazenadas no arraylist
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // Utilização do for para iteração no arraylist
//		for(contador; condição; acumulador) {
//			
//		}
        System.out.println("------------------ FOR ------------------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        // FOR EACH -> para cada
        System.out.println("---------------- FOR EACH -----------------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // Criar 3 planos de saúde, armazenar em um arraylist
        // e exibir o nome da operadora de cada um deles
        // usando for each.
        PlanoDeSaude p1 = new PlanoDeSaude("Amil");
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);

        System.out.println("-------------- OPERADORA --------------");
        for (PlanoDeSaude o : planos) {
            System.out.println(o.getOperadora());
            System.out.println(o.getQuantidade());
        }

        PlanoDeSaude xpto1 = new PlanoDeSaude();
        PlanoDeSaude xpto2 = new PlanoDeSaude();
        PlanoDeSaude xpto3 = new PlanoDeSaude();

        System.out.println("-------- " + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("-------- " + PlanoDeSaude.getQuantidade());

    }

}
