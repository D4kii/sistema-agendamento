package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao {

    private final static String URL = "C:\\Users\\22282183\\Java\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282183\\Java\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude e) { //CREATE
        planoDeSaude.add(e);

        try {
            BufferedWriter escritor;
            escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getCodigo() + ";" + e.getOperadora() + ";" + e.getCategoria() + ";" + e.getNumero() + ";" + e.getValidade());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaudes() { //READ
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // READ

        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }

    public static void atualizar(PlanoDeSaude planoAtualizado) { // UPDATE
        for (PlanoDeSaude plano : planoDeSaude) {
            if (Objects.equals(
                    plano.getCodigo(),
                    planoAtualizado.getCodigo())) {
                planoDeSaude.set(
                        planoDeSaude.indexOf(plano),
                        planoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude plano : planoDeSaude) {
            if (plano.getCodigo().equals(codigo)) {
                planoDeSaude.remove(plano);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {

        //PASSO 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporáril para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar as especialidades no arquivo temporáril, 
            //exceto o registro que  não queremos mais
            for (PlanoDeSaude e : planoDeSaude) {
                bwTemp.write(e.getPlanoDeSaudeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void criarListaPlanos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetorPlano = linha.split(";");
                String[] data = vetorPlano[4].split("/");
                PlanoDeSaude e = new PlanoDeSaude(
                        vetorPlano[1],
                        vetorPlano[2],
                        vetorPlano[3],
                        LocalDate.of(
                                Integer.parseInt(data[2]),
                                Integer.parseInt(data[1]),
                                Integer.parseInt(data[0])),
                        Integer.valueOf(vetorPlano[0]));

                //Guardar Especialidade na lista
                planoDeSaude.add(e);

                //Ler a próxima linha
                linha = leitor.readLine();
            }
            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }

        System.out.println(planoDeSaude.size());

    }

    public static DefaultTableModel getPlanoDeSaudeModel() {

        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planoDeSaude.size()][5];
        //o int tem que ser fora do for

        int i = 0;

        for (PlanoDeSaude e : planoDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            dados[i][4] = e.getValidade().toString();
            i++;
        }

        return new DefaultTableModel(dados, titulos);
    }

}
