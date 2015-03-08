/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.daos;

import controler.NewHibernateUtil;
import java.util.Collection;
import java.util.List;
import model.telefono;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mariana
 */
public class telefonoDAO {
    public void create(telefono t) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try{
            tx.begin();
            session.save(t);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     public void update(telefono t) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.saveOrUpdate(t);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     
     
      public void delete(telefono t) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.delete(t);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
       public telefono load(telefono t) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            t = (telefono)session.get(telefono.class, t.getIdtelefono());
            tx.commit();
           
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
         return t;
    }
       
    public Collection loadAll() throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        List l = null; 
        
        try{
            tx.begin();
            Query q = session.createQuery("from telefono"); 
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
