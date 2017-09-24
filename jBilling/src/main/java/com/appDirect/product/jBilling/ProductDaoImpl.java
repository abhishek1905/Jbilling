package com.appDirect.product.jBilling;


 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductDaoImpl {
	
	private static SessionFactory factory; 

	static{
		

		
		 try{
			 ProductDaoImpl.factory = new Configuration().configure("/hibernate.cfg.xml" ).buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}
		
	
	   public Integer addProduct(int id, String name, double base){
		      Session session = ProductDaoImpl.factory.openSession();
		      Transaction tx = null;
		      Integer employeeID = null;
		      try{
		         tx = session.beginTransaction();
		         Product product = new Product(id, name, base);
		         employeeID = (Integer) session.save(product); 
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return employeeID;
		   

}
	   
}






