import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Address;
import com.entity.Address1;
import com.entity.Bid;
import com.entity.Buyer;
import com.entity.Category;
import com.entity.Item;
import com.entity.Product;
import com.entity.Supplier;
import com.util.HibernateUtil;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
//		Transaction object is used to do perform DML operations
		Transaction transaction = session.getTransaction();
	
		transaction.begin();
		
			//Product product = (Product)session.get(Product.class, 102);
			
			//records can also be fetched using load()
			//difference between get and load method is that load() method does lazy fetching where as get() method does eager fetching. 
			Product product = (Product)session.load(Product.class, 102);
			
				
		transaction.commit();
		
		session.close();
		
		//this will lead an error as the session is closed when using load(), this would not happen in case of get() method
		//Lazy fetching reduces dB i/o only when it is needed 		
		System.out.println("Id :"+product.getId());
		System.out.println("Id :"+product.getName());
		System.out.println("Id :"+product.getDescription());
		System.out.println("Id :"+product.getPrice());
		System.out.println();
		
		
		
		
		
		
		
		
		
//		
//		//when product object is created it is in transient(it is a normal java object not representing any dB record) stage first
//				Product product = new Product(77732, "Xperira E4g", "Mobile", 11000);
//				
//				
//				//Transaction object is used to do perform DML operations
//				Transaction transaction = session.getTransaction();
//			
//				transaction.begin();
//					
//					//object moves from transient stage to persistent stage when you call the save() method
//					session.save(product);
//				
//				transaction.commit();
//				
//				session.close();		
//					
//				
//				System.out.println("Id :"+product.getId());
//				System.out.println("Id :"+product.getName());
//				System.out.println("Id :"+product.getDescription());
//				System.out.println("Id :"+product.getPrice());
		
//		Transaction transaction = session.getTransaction();
//		
//		Buyer buyer = new Buyer();
//		buyer.setUserID(101);
//		buyer.setFirstName("Raj");
//		buyer.setLastName("J");
//		buyer.setFavoriteCategory("Mobiles");
//		
//		Bid bid1 = new Bid(99901,300);
//		Bid bid2 = new Bid(99902,300);
//		
//		Item item1 = new Item(11111,"XYZ");
//		Item item2 = new Item(11111,"ABC");
//		
//		bid1.setItem(item1);
//		bid2.setItem(item2);
//		
//		HashSet<Bid> bids = new HashSet<>();
//		bids.add(bid1);
//		bids.add(bid2);
//		
//		buyer.setBids(bids);
//		
//		Address1 address = new Address1(101,"Hyd","TG");
//		
//		buyer.setAddress(address);
//		
//		transaction.begin();
//		
//		session.save(buyer);
//		
//		transaction.commit();
		
		
			
		
		
		
		
		
		
		
		
//		//to fetch records using Criteria
//		//prepare statement using createCriteria()
//		Criteria criteria = session.createCriteria(Product.class);
//		
//		ProjectionList projectionList = Projections.projectionList();
//		
//		projectionList.add(Projections.max("price"));
//		
//		criteria.setProjection(projectionList);
//		
//		Float maxPrice = (Float)criteria.uniqueResult();
//		
//		System.out.println("MaxPrice : "+maxPrice);
		
		
//		//criterions are used to specify conditions(import org.hibernate.criterion.Criterion;)
//		Criterion criterion = Restrictions.gt("id", 5000);
//		Criterion criterion2 = Restrictions.like("name", "L%");
//		
//		//by default conditions are joined using "and" operator
////		criteria.add(criterion);
////		criteria.add(criterion2);
//		
//		//Restrictions.or() method returns an object called as logical expression		
//		LogicalExpression logicalExpression = Restrictions.or(criterion, criterion2);
//				
//		criteria.add(logicalExpression);
//		
//		ProjectionList projectionList = Projections.projectionList();
//		projectionList.add(Projections.property("name"));
//		projectionList.add(Projections.property("price"));
//		
//		criteria.setProjection(projectionList);
//		
//		List<Object[]> objectsArrList = criteria.list();
//		
//		for (Object[] objects: objectsArrList) {
//			System.out.println("Name : "+objects[0]);
//			System.out.println("Name : "+objects[1]);
//			System.out.println();
//		}
		
				
//		List<Product> productList = criteria.list();
//		
//		for (Product product : productList) {
//			
//			System.out.println("Id :"+product.getId());
//			System.out.println("Id :"+product.getName());
//			System.out.println("Id :"+product.getDescription());
//			System.out.println("Id :"+product.getPrice());
//			System.out.println();
//			
//		}
//		
		
		
		
//		Query query = session.createQuery("from Product");//this can be also be represented as below line
		
//		Query query = session.createQuery("select p from Product p);
		
//		Query query = session.createQuery("select p from Product p where p.id>5000 and p.name like 'L%'");
		
		//use positional bind parameters(? below) to make the query dynamic   //0               //1
//		Query query = session.createQuery("select p from Product p where p.id>? and p.name like ?");
		
		//named bind parameters
//		Query query = session.createQuery("select p from Product p where p.id> :pid and p.name like :pname");
		
//		//get partial records
//		Query query = session.createQuery("select p.name, p.pricde from Product p where p.id> :pid and p.name like :pname");
//		
//		query.setInteger("pid", 6000);
//		query.setString("pname", "L%");
//		
//		List<Object[]> objectsArrList = query.list();
//		
//		for (Object[] objects : objectsArrList) {
//			
//			System.out.println("Name : "+objects[0]);
//			System.out.println("Name : "+objects[1]);
//			
//		}
		
//		//Aggregate operations
//		Query query =session.createQuery("select max(p.price) from Product p");
//		
//		//when ever a query return single value or row use uniqueResult()
//		
//		Float maxPrice = (Float)query.uniqueResult();
//		
//		System.out.println("MaxPrice : "+maxPrice);
		
		//Joins in HQL:
		//inner join
//		Query query = session.createQuery("select p,s from Product p inner join p.supplier s");
		
//		//left outer join
//		Query query = session.createQuery("select p,s from Product p left outer join p.supplier s");
//		
//		List<Object[]> listOfArr = query.list();
//	
//		for (Object[] objects : listOfArr) {
//			
//			Product product = (Product)objects[0];
//			Supplier supplier = (Supplier)objects[1];
//			
//
//			System.out.println("Id :"+product.getId());
//			System.out.println("Id :"+product.getName());
//			System.out.println("Id :"+product.getDescription());
//			System.out.println("Id :"+product.getPrice());
//			System.out.println();
//			
//			if(supplier!=null){//in case of left outer join
//			System.out.println("Id :"+supplier.getId());
//			System.out.println("Id :"+supplier.getName());
//			}
//			System.out.println();
//			System.out.println();
//			
//		}
		
		
		
//		query.setInteger(0, 6000);
//		query.setString(0, "L%");
		
//		List<Product> products = query.list();
//		
//		for (Product product : products) {
//			
//			System.out.println("Id :"+product.getId());
//			System.out.println("Id :"+product.getName());
//			System.out.println("Id :"+product.getDescription());
//			System.out.println("Id :"+product.getPrice());
//			System.out.println();
//			
//		}
//		
		
		
//		Item item = (Item)session.get(Item.class, 101);
//		
//		System.out.println("ItemID : "+item.getId());
//		System.out.println("ItemName : "+item.getName());
//		
//		Set<Category> categories = item.getCategories();
//		
//		for (Category category : categories) {
//			
//			System.out.println("CategoryId : "+category.getId());
//			System.out.println("CategoryName : "+category.getName());
//			System.out.println();
//			
//		}
//		
//		Set<Bid> bids = item.getBids();
//		
//		for (Bid bid : bids) {
//			System.out.println("BidId : "+bid.getId());
//			System.out.println("BidId : "+bid.getBidAmount());
//			System.out.println();
//		}
		
		
		
//		Product product = new Product(77732, "Xperira E4g", "Mobile", 11000);
//		
//		//Transaction object is used to do perform DML operations
//		Transaction transaction = session.getTransaction();
//		
//		transaction.begin();
//			
//			session.save(product);
//		
//		transaction.commit();
//		
//		session.close();
	
		
//		Product product = (Product)session.get(Product.class, 102);		
//		
//		System.out.println("Id :"+product.getId());
//		System.out.println("Id :"+product.getName());
//		System.out.println("Id :"+product.getDescription());
//		System.out.println("Id :"+product.getPrice());
		
	}

}
