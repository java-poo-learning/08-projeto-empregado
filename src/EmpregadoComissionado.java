import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado {
    double totaldeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double comissao, double totaldeVendas) {
        super(matricula, nome);
        this.comissao = comissao;
        this.totaldeVendas = totaldeVendas;
    }

    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas: R$" + df.format(totaldeVendas) + "\n";
        aux += "Comissão: " + df.format(comissao) + "%\n";
        return aux;


    }

    public double CalcularSalario() {
        return totaldeVendas * comissao/100;




    }



}
