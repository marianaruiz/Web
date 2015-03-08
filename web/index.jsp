<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="CSS/bootstrap/signin.css" rel="stylesheet" type="text/css">
        <script src="js/jquery/jquery-2.1.1.js"></script>
        <script src="CSS/bootstrap/bootstrap.js"></script>
        <title>Ingresar</title>
    </head>
    <body>
     <div class="navbar navbar-inverse " role="navigation">
        <div class="navbar-header ">
            <a class="navbar-brand  " href="ReAdmin.html"></a>
        </div>
         <div></div>
         <div class="jumbotron boxlogin">
            <html:form action="/login" >   
                <fieldset>
                  <legend class="form-signin-heading">Ingresar</legend>
                  <table>
                      <tr>
                            <td>usuario</td>
                            <td><html:text property="user" styleClass="form-control"/></td>
                      </tr>
                      <tr>
                          <td>Contraseña</td>
                          <td><html:password property="clave" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td></td>
                      <td><html:select property="tipo" styleClass="form-control">
                                <html:option value="Alumno"/>
                                 <html:option value="Profesor"/>
                                <html:option value="Administrador"/>                
                                </html:select></td>
                      </tr>
                      <tr>
                          
                          <td><html:submit value="Recuperar contraseña" styleClass="btn btn-lg btn-success"/></td>
                          <td><html:submit value="Ingresar" styleClass="btn btn-lg btn-success"/></td>
                      </tr>
                  </table>
            </fieldset>
            </html:form>
        </div>
    </body>
</html>
