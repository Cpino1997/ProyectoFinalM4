package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Curso;
import servicios.CursoService;
import servicios.CursoServiceImpl;

@WebServlet("/curso")
public class CursoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public CursoServlet() {
		super();
	}

	CursoService service = new CursoServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "list";
		}

		String jsp = "/vista/cursos.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "list": {

			request.setAttribute("cursos", service.leer());

			break;
		}
		case "edit": {

			String id = request.getParameter("id");

			request.setAttribute("curso", service.leer(Integer.parseInt(id)));
			jsp = "/vista/curso.jsp";

			break;
		}
		case "new": {
			jsp = "/vista/curso.jsp";
			break;
		}		
		case "del": {
			//obtengo el ID de Customer que se quiere borrar.
			String id = request.getParameter("id");
			//borramos el cliente
			service.borrar(Integer.parseInt(id));
			
			//obtengo la lista de clietnes restantes, y se las paso al request.
			request.setAttribute("cursos", service.leer());
			break;
		}
		
		default:
			break;
		}

		getServletContext().getRequestDispatcher(jsp).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "new";
		}

		String jsp = "/vista/cursos.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "new": {

			Curso c = new Curso();
			c.setIdCurso(0);
			c.setCodigoCurso(request.getParameter("codigoCurso"));
			c.setNombreCurso(request.getParameter("nombreCurso"));
			c.setIdFacilitadorFK(Integer.parseInt(request.getParameter("idFacilitadorFK")));
			
			service.crear(c);
			
			break;
		}
		case "edit": {

			String id = request.getParameter("idCurso");			
			Curso c = service.leer(Integer.parseInt(id));
			
			c.setCodigoCurso(request.getParameter("codigoCurso"));
			c.setNombreCurso(request.getParameter("nombreCurso"));
			c.setIdFacilitadorFK(Integer.parseInt(request.getParameter("idFacilitadorFK")));
			
			service.actualizar(c);

			break;
		}
		default:
			break;
		}

		request.setAttribute("cursos", service.leer());
		jsp = "/vista/cursos.jsp";
		
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
	}

}