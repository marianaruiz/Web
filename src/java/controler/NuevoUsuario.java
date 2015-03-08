/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Date;
import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import model.daos.UsuarioDAO;
import model.from.UsuarioForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Mariana
 */
public class NuevoUsuario extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
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
            UsuarioForm bean =(UsuarioForm) form;
            Usuario user =new Usuario();
            UsuarioDAO userDAO=new UsuarioDAO();
            user.setNombreUsuario(bean.getNombreUsuario());
            user.setClave(bean.getClave());
            user.setNombre(bean.getNombre());
            user.setPaterno(bean.getPaterno());
            user.setMaterno(bean.getMaterno());
            user.setEmail(bean.getEmail());
            user.setRol(bean.getRol());
            user.setFechaIngreso(Date.valueOf(LocalDate.now()));
            if(userDAO.create(user)== 1){
                return mapping.findForward(SUCCESS);
            }
            else{
                return mapping.findForward(FAIL);
            }
    }
}
