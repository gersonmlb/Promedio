package upeu.edu.pe.mvp;

public class FactorialPresentador implements Main.Presentador {
    private Main.Model model;
    private Main.Vista vista;

    public FactorialPresentador(Main.Vista vista){
        this.vista = vista;
        model = new FactorialModel(this);
    }

    @Override
    public void mostrarResultado(String r) {
        if(vista!=null){
            vista.mostrarResultado(r);
        }
    }


    @Override
    public void calcularFactorial(String n1,String n2,String n3) {
        if(vista!=null){
            model.calcularFactorial(n1,n2,n3);
        }
    }
}
