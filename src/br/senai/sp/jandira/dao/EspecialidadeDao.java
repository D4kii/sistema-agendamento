package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EspecialidadeDao {
    
    private final static String URL ="C:\\Users\\22282183\\Java\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);

    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade
    excluir uma especialidade, etc.
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    public static TableModel getEspecialidadesModel;

    public static void gravar(Especialidade e) { // CREATE
        especialidades.add(e);
        
        //***GRAVAR EM ARQUIVO ***
        try {
            BufferedWriter escritor;
            escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getCodigo() + ";" + e.getNome() + ";" + e.getDescricao());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
    }

    public static ArrayList<Especialidade> getEspecialidades() { // READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { // READ

        for (Especialidade e : especialidades) {
            if (Objects.equals(e.getCodigo(), codigo)) {
                return e;
            }
        }
        
        return null;
      
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) { // UPDATE
        for (Especialidade e : especialidades) {
            if (Objects.equals(
                    e.getCodigo(),
                    especialidadeAtualizada.getCodigo())) {
                        especialidades.set(
                        especialidades.indexOf(e),
                        especialidadeAtualizada);
                break;
            }
        }
    }
        
    public static void excluir(Integer codigo) { // DELETE

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }

    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaEspecialidades() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha= leitor.readLine();
            
            while(linha != null) {
                
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));
                
                //Guardar Especialidade na lista
                especialidades.add(e);
                
                //Ler a próxima linha
                linha = leitor.readLine();
            }
            leitor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }
        
        System.out.println(especialidades.size());
        
    }
    
    public static DefaultTableModel getEspecialidadesModel() {
        
        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        
        String[][] dados = new String[especialidades.size()][3];
        //o int tem que ser fora do for
        
        int i = 0; 
        
        for (Especialidade e : especialidades){
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }

}
