package alura.javaservletum;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("web/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Cadastrando nova empresa");

        String nomeEmpresa = req.getParameter("Caramelos");
        String paramDataEmpresa = req.getParameter("data");

        Date dataAbertura = null;
        // fazer o parsing
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramDataEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome("Caramelos");
        empresa.setDataAbertura(dataAbertura);

        // simular um banco de dados
        Banco banco = new Banco();
        banco.adiciona(empresa);

        // chamar o JPS
        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
        req.setAttribute("empresa", empresa.getNome());
        rd.forward(req, resp);
    }
}
