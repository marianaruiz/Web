/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.daos;

import controler.NewHibernateUtil;
import java.util.Collection;
import java.util.List;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Usuario;
/**
 *
 * @author Mariana
 */
public class UsuarioDAO {
     public void create(Usuario u) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.save(u);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
    
     public void update(Usuario u) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();  
            session.saveOrUpdate(u);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     
     
      public void delete(Usuario u) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.delete(u);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
      
      
      
       public Usuario load(Usuario u) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            u = (Usuario)session.get(Usuario.class, u.getIdUsuario());
            tx.commit();
           
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
         return u;
    }
       
    public Collection loadAll() throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        List l = null; 
        
        try{
            tx.begin();
            Query q = session.createQuery("from usuario"); 
            l=q.list();
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
        return l;
    }
}
