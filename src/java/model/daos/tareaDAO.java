/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.daos;

import controler.NewHibernateUtil;
import java.util.Collection;
import java.util.List;
import model.tarea;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mariana
 */
public class tareaDAO {
    public void create(tarea t) throws Exception{
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
     public void update(tarea t) throws Exception{
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
     
     
      public void delete(tarea t) throws Exception{
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
       public tarea load(tarea t) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            t = (tarea)session.get(tarea.class, t.getIdTarea());
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
            Query q = session.createQuery("from tarea"); 
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
