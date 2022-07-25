package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Facilitador;
import servicios.FacilitadorService;
import servicios.FacilitadorServiceImpl;

@WebServlet("/facilitador")
public class FacilitadorServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public FacilitadorServlet() {
		super();
	}
	


	FacilitadorService service = new FacilitadorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "list";
		}

		String jsp = "/vista/facilitadores.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "list": {
			request.setAttribute("facilitadores", service.leer());
			break;
		}
		case "edit": {
			String id = request.getParameter("id");
			request.setAttribute("facilitador", service.leer(Integer.parseInt(id)));
			jsp = "/vista/facilitador.jsp";
			break;
		}
		case "new": {
			jsp = "/vista/facilitador.jsp";
			break;
		}		
		case "del": {
			
			String id = request.getParameter("id");
			service.borrar(Integer.parseInt(id));
			request.setAttribute("facilitadores", service.leer());
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

		String jsp = "/vista/facilitadores.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "new": {

			Facilitador f = new Facilitador();
			f.setId(0);
			f.setNombreFa(request.getParameter("nombreFa"));
			f.setRutFa(request.getParameter("rutFa"));
			f.setEmailFa(request.getParameter("emailFa"));
			f.setTelefonoFa(request.getParameter("telefonoFa"));
			f.setValorHora(Float.parseFloat(request.getParameter("valorHora")));
			f.setBancoFa(request.getParameter("bancoFa"));
			f.setCtaBancariaFa(request.getParameter("ctaBancaria"));
			
			service.crear(f);
			
			break;
		}
		case "edit": {
			String id = request.getParameter("idFa");			
			Facilitador f = service.leer(Integer.parseInt(id));

			f.setNombreFa(request.getParameter("nombreFa"));
			f.setRutFa(request.getParameter("rutFa"));
			f.setEmailFa(request.getParameter("emailFa"));
			f.setTelefonoFa(request.getParameter("telefonoFa"));
			f.setValorHora(Float.parseFloat(request.getParameter("valorHora")));
			f.setBancoFa(request.getParameter("bancoFa"));
			f.setCtaBancariaFa(request.getParameter("ctaBancaria"));
			
			service.actualizar(f);

			break;
		}
		default:
			break;
		}

		request.setAttribute("facilitadores", service.leer());
		jsp = "/vista/facilitadores.jsp";
		
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
	}
	
}
