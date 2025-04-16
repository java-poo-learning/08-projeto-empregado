public abstract class Empregado extends Object{
    long matricula;
    String nome;

    // classe abstrata não ´pode ser instanciada.
    //  o metodo que não tem corpo é chamado de abstrato.
    // o metodo abstrato só pode existir se tiver numa classe abstrata.


    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getDados() {
        String aux = "";
        aux += "Matricula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;


    }

    public abstract double CalcularSalario();


}

