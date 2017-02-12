import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;




public class Test {

	
	
	public static void addProduct(Product product) throws SQLException{
		
		String insertQuery = "insert into test.product(product_id,product_name,product_price,product_description)"
				+"values(?,?,?,?)";
						//1,2,3,4
				
		Connection connection = null;
	
	try{
		
		//Step1 : Load Drivers
		Class.forName("org.gjt.mm.mysql.Driver");
		
		//Step2 : Establish connection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
		
		//Step3: Create Statement Object(purpose to execute a query)
		//When using Bind Parameters, we cannot use Statement, we have to PreparedStatement
		//Statement statement = connection.createStatement();
		
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		
		//this is the right approach
		preparedStatement.setInt(1,product.getId());
		preparedStatement.setString(2,product.getName());
		preparedStatement.setFloat(3,product.getPrice());
		preparedStatement.setString(4,product.getDescription());
				
		//Step4: Execute Query
		int i = preparedStatement.executeUpdate(insertQuery);
//		int i = statement.executeUpdate(insertQuery);
		
		if(i == 1){
			System.out.println("Record added successfully...");
		}		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{		
		connection.close();
	}
	

	}
	
	public static void main(String[] args) throws SQLException{
		
		Product product = new Product(77730,"U410", "Lenovo Laptop", 40000);
		
		addProduct(product);
	}
}
