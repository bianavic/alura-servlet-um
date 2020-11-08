package alura.javaservletum;

import org.springframework.web.bind.ServletRequestParameterPropertyValues;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// estendendo para criar uma classe servlet
@WebServlet(urlPatterns = "/hello") // marca a classe como servlet e registra a url
public class HelloServletWorld extends ServletRequestParameterPropertyValues {

    protected void HelloServletWorld(HttpServletRequest request, HttpServletResponse res) throws IOException {

        // definir a resposta
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("hello world, congrats you wrote your first servlet");
        out.println("</body>");
        out.println("</html>");

        System.out.println("O HelloServletWorld está rodando");
    }

    public HelloServletWorld(ServletRequest request) {
        super(request);
    }
}
