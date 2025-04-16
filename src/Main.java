public class Main {
    public static void main(String[] args) {

        Empregado [] empregado = new Empregado[3];
        empregado [0] = new EmpregadoComissionado(1, "Dani", 40, 2000);
        empregado [1] = new EmpregadoHorista(2, "Isa", 500, 30);
        empregado [2] = new EmpregadoComissionado(3, "Karla", 30, 1500);


        for(Empregado e : empregado) {
            System.out.println(e.getDados());
            System.out.println(e.CalcularSalario());
        }




    }
}
