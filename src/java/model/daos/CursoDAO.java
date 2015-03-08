/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.daos;

import controler.NewHibernateUtil;
import java.util.Collection;
import java.util.List;
import model.Curso;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mariana
 */
public class CursoDAO {
    public void create(Curso c) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        try{
            tx.begin();
            session.save(c);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     public void update(Curso c) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.saveOrUpdate(c);
            tx.commit();
            session.close();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
     
     
      public void delete(Curso c) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            session.delete(c);
            tx.commit();
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
    }
       public Curso load(Curso c) throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        
        try{
            tx.begin();
            c = (Curso)session.get(Curso.class, c.getIdCurso());
            tx.commit();
           
        }catch(HibernateError he){
            if(tx != null && tx.isActive())
                tx.rollback();
            System.out.println("Se ha cerrado la transaccion");
        }
         return c;
    }
       
    public Collection loadAll() throws Exception{
        Session session =NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();
        List l = null; 
        
        try{
            tx.begin();
            Query q = session.createQuery("from curso"); 
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
