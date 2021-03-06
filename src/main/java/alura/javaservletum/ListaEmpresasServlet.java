package alura.javaservletum;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Banco banco = new Banco();
        List<Empresa> listaEmpresas = banco.getEmpresas();

        req.setAttribute("empresas", listaEmpresas);

        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        rd.forward(req, resp);

    }
}
