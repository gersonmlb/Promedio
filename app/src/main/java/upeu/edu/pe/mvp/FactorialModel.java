package upeu.edu.pe.mvp;

public class FactorialModel implements Main.Model{
    private Main.Presentador presentador;

    public FactorialModel(Main.Presentador presentador){
        this.presentador= presentador;
    }

    @Override
    public void calcularFactorial(String n1, String n2, String n3) {

        int r1 = Integer.parseInt(n1);
        int r2 = Integer.parseInt(n2);
        int r3 = Integer.parseInt(n3);

        int suma = (r1+r2+r3)/3;

        presentador.mostrarResultado(String.valueOf(suma));

    }
}
