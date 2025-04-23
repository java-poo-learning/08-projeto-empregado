import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;


public class Util {

    private Controle controle = new Controle ();
    public void menu () {
        inserir();
        pesquisar();
        pesquisar();
        listar();
    }

    private void inserir () {
        long matricula;
        String nome;
        double totaldeVendas , comissao , valorDaHoraTrabalhada;
        int totalDeHorasTrabalhadas;
        int opcao;
        String menu = "1.Empregado Comissionado\n2.Empregado Horista\n3.Sair";

        while (true) {
            opcao = parseInt(showInputDialog(menu));
            if (opcao == 3) {
                return;
            }
            if (opcao == 1 || opcao == 2) {
                matricula = parseLong(showInputDialog("Matricula do empregado"));
                nome = showInputDialog("Nome do empregado");
                if(opcao == 1) {
                    totaldeVendas = parseDouble(showInputDialog("Valor total das vendas"));
                    comissao = parseDouble(showInputDialog("Comissao (porcentagem)"));
                    controle.inserir(new EmpregadoComissionado(matricula, nome, comissao, totaldeVendas));
                }
                else {
                    totalDeHorasTrabalhadas = parseInt(showInputDialog("Total de horas trabalhadas"));
                    valorDaHoraTrabalhada = parseDouble(showInputDialog("Valor da hora:  "));
                    controle.inserir(new EmpregadoHorista(matricula , nome, totalDeHorasTrabalhadas, valorDaHoraTrabalhada));
                }
            }
        }
    }

    private void pesquisar () {
        long matricula = parseLong(showInputDialog("Matícula para pesquisa"));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado == null) {
            showMessageDialog(null, "Empregado com a matrícula" + matricula + "não encontrado");
        }
        else {
            showMessageDialog(null, empregado.getDados());
        }

    }

    private void listar () {
        showMessageDialog(null, controle.listar());
    }
}
