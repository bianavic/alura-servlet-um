package alura.javaservletum;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> listaEmpresas = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Caramelos");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Nero");
        listaEmpresas.add(empresa);
        listaEmpresas.add(empresa2);
    }

    public void adiciona(Empresa empresa) {
        listaEmpresas.add(empresa);
    }

    public List<Empresa> getListaEmpresas() {
        return Banco.listaEmpresas;
    }

    public List<Empresa> getEmpresas() {
        return null;
    }
}
