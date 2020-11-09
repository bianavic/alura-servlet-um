package alura.javaservletum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Empresa> listaEmpresas = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Caramelos");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Nero");
        listaEmpresas.add(empresa);
        listaEmpresas.add(empresa2);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.listaEmpresas.add(empresa);
    }

    public List<Empresa> getListaEmpresas() {
        return Banco.listaEmpresas;
    }

    public List<Empresa> getEmpresas() {
        return null;
    }

    public void removeEmpresa(Integer id) {

        Iterator<Empresa> it = listaEmpresas.iterator();

        while (it.hasNext()) {
            Empresa emp = it.next();

            if (emp.getId() == id) {
                it.remove();
            }
        }

//        for (Empresa empresa : listaEmpresas) {
//            if (empresa.getId() == id) {
//                listaEmpresas.remove(empresa);
//            }
//        }
    }
}
