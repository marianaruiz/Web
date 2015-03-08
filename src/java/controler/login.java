/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import model.Profesor;
import model.Usuario;
import model.daos.AlumnoDAO;
import model.daos.ProfesorDAO;
import model.daos.UsuarioDAO;
import model.from.loginFrom;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Mariana
 */
public class login extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String ALUMNOMENU = "alumnomenu";
    private static final String PROFESORMENU = "profesormenu";
    private static final String ADMINMENU = "adminmenu"; 
private static final String FAIL = "fail"; 
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            String  tipo;
            String matricula;
            String contrasena;
            loginFrom bean =(loginFrom) form;
            //tipo=Integer.parseInt(bean.getTipo());
            tipo=bean.getTipo();
            matricula=bean.getUser();
            contrasena=bean.getClave();
            switch (tipo) {
            case "Alumno":
                AlumnoDAO adao=new AlumnoDAO();
                Alumno a= new Alumno();
                a=adao.login(matricula,contrasena);
                System.out.print(a.getNombre());
                if(a!=null){
                    return mapping.findForward(ALUMNOMENU);
                }
                break;
            case "Profesor":
                ProfesorDAO pdao=new ProfesorDAO();
                Profesor p= new Profesor();
                p=pdao.login(matricula,contrasena);
                System.out.print(p.getNombre());
                if(p!=null){
                    return mapping.findForward(PROFESORMENU);
                }
                break;
            default:
                UsuarioDAO udao=new UsuarioDAO();
                Usuario u= new Usuario();
                u=udao.login(matricula,contrasena);
                System.out.print(u.getNombre());
                if(u!=null){
                    return mapping.findForward(ADMINMENU);
                }
                break;
        }
        return mapping.findForward(FAIL);
    }
}
