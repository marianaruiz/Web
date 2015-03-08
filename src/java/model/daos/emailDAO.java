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
import model.email;
/**
 *
 * @author Mariana
 */
public class emailDAO {
    public void create(email e) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try{
            tx.begin();
            session.save(e);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     public void update(email e) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.saveOrUpdate(e);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     
     
      public void delete(email e) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.delete(e);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
       public email load(email e) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            e = (email)session.get(email.class, e.getIdemail());
            tx.commit();
           
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
         return e;
    }
       
    public Collection loadAll() throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        List l = null; 
        
        try{
            tx.begin();
            Query q = session.createQuery("from email"); 
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
