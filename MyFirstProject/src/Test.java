import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
//import java.util.List;

//E below represent Generics
public class Test <E> {
	
	public void process(E e){
		
	}
	//type safety is lost, Object 
//	public void process(Object e){
//		
//	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Test<String> test = new Test<>();
		
		test.process("Hary");
		
		Test<Customer> test2 = new Test<>();
		
		test2.process(new Customer());
		
		
		// TODO Auto-generated method stub
		
		//1 byte of memory is allocated
		//int i = 0, j= 1, k = 2;
		//if((i++ == 1) & (j++ == 2)){
		//	i = 42;
		//}
		//System.out.println("i =" + i + ", j =" + j + ", k =" + k);
		
//		int[] arr = new int[5];
//		arr[0] = 22;
//		arr[1] = 34;
//		arr[2] = 45;
//		arr[3] = 56;
//		arr[4] = 19;
//		
//		int[] arr = {12,20,34,11,66,90};
//		
//		//for (int i = 0; i < arr.length; i++) {
//		//	System.out.println(arr[i]);
//		//}
//		for (int t : arr){
//			System.out.println(t);
//		}
		
//		String[] names = {"Hary","John","Kumar","Ahmed"};
//			for(String s: names){
//				System.out.println(s);
//			}
		
//		int[][] arr = new int[3][2];
//		
//		arr[0][0] = 12;
//		arr[0][1] = 14;
//		
//		arr[1][0] = 44;
//		arr[1][1] = 56;	
//		
//		arr[2][0] = 67;
//		arr[2][1] = 34;	
		
//		for (int i = 0; i < 3; i++) {
//			
//			for (int j = 0; j < 2; j++) {
//				System.out.println(arr[i][j]);				
//			}			
//		}
		
//		for (int[] is : arr) {
//			for (int i : is) {
//				System.out.println(i);
//			}
//				
//		}
//		
//		
		
//		Date today = new Date();
//		
//		System.out.println(today);
//		
//		Date today = new Date();
//		
//		System.out.println(today);
//		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
//		
//		String formattedDate = simpleDateFormat.format(today);
//		
//		System.out.println(formattedDate);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Date date = dateFormat.parse("20/01/2015");
//		
//		System.out.println(date);
		
//		Calendar today = Calendar.getInstance();
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Date date = dateFormat.parse("20/01/2000");
//		
//		Calendar dob = Calendar.getInstance();
//		
//		dob.setTime(date);
//		
//		int ageInYears = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
//		
//		System.out.println(ageInYears);
		
//		//local variable:all variable declared inside a method are called local variables and the memory is allocated in stack
//		int i = 10;
//		
//		//account below is a local reference variable and the memory is allocated is stack
//		//new keyword below indicates an object and the memory is allocated on heap
//		SavingsAccount account = new SavingsAccount(101, 5000f, 12345);
//		
//		//example of an unreacble object
//		account = null;
//		
//		//method call. Main method waits till withdraw method finishes execution
//		account.withdraw(300);
//		
//		System.gc();
//		
//		System.out.println("End of Main");
		
//		Runtime runtime = Runtime.getRuntime();
//		
//		System.out.println("Total memory :"+runtime.totalMemory());		
//		System.out.println("Free memory before creating objects:"+runtime.freeMemory());
//		
//		for(int i = 0; i < 40000; i++){
//			new SavingsAccount(i+1, 5000, 12345);
//		}
//	
//		System.out.println("Free memory after creating objects:"+runtime.freeMemory());
//		
//		System.out.println("calling gc()");
//		
//		runtime.gc();
//		
//		System.out.println("Free memory after calling gc..:"+runtime.freeMemory());	
//		
		
//		System.out.println(calender.get(Calendar.DAY_OF_YEAR));
//		
//		System.out.println(calender.get(Calendar.MONTH));
//		
//		System.out.println(calender.get(Calendar.WEEK_OF_YEAR));
//		
//		System.out.println(calender.get(Calendar.WEEK_OF_MONTH));
//		
//		try{
//		
//		SavingsAccount account = new SavingsAccount(101,5000, 12345);
//		
//		System.out.println("AccountNo : " +account.getAccountNo());
//		System.out.println(account.getBalance());
//		
//		account = null;
//		
//		account.withdraw(2000);
//		
//		System.out.println(account.getBalance());
//		
//		}catch(Exception e){
//			System.out.println("Catch Block");
//		}
//		
//		System.out.println("End of main()");
//		
//		//Compiler complains saying exception is not handled
//		try{
//			Connection connection = DriverManager.getConnection("");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
//	public static void main(String[] args) throws SQLException{
//		Connection connection = DriverManager.getConnection("");	
	
//	public static void process() throws SQLException {
//		
//		Connection connection = null;
//		
//		try{
//			connection = DriverManager.getConnection("");
//		//db operations
//		//db operations
//		connection.close();
//		
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			connection.close();
//		}
//		
//	}
//	
//	public static void main(String[] args) throws SQLException {
//		
//		process();
//		
//	}
	
//	public static void main(String[] args) throws SQLException {
//		
//		
//		LinkedList<String> names = new LinkedList<>();
//		
//		names.add("Harry");//index position 0
//		names.add("Kumar");//index position 1
//		names.add("Harry");//index position 2
//		names.add("John");//index position 3
//		names.add("Sunil");//index position 4
//		
//		
//		List<String> list = names.subList(1, 4);
//		
//		for (String str : list) {
//			System.out.println(str);
//			
//		}
	
//	Vector<String> names = new Vector<>();
//	names.add("Harry");//index position 0
//	names.add("Kumar");//index position 1
//	names.add("John");//index position 3
//	names.add("Sunil");//index position 4
//	
//	Collections.sort(names);
//	
//	Enumeration<String> enumeration = names.elements();
//	
//	while (enumeration.hasMoreElements()) {
//		String str = enumeration.nextElement();
//		
//		System.out.println(str);
//		
//	}
//		
//		SavingsAccount account = new SavingsAccount(104,2000, 1234);
//		
//		TreeSet<SavingsAccount> accounts = new TreeSet<>(new SavingsAccountComparator());
//		
//		accounts.add(new SavingsAccount(102, 5000, 1234));
//		accounts.add(new SavingsAccount(101, 7000, 1234));
//		accounts.add(account);
//		accounts.add(new SavingsAccount(103, 8000, 1234));
//		accounts.add(account);
//		
//				
//		
//		//Collections.sort(accounts, new SavingsAccountComparator());
//		
//		for (SavingsAccount savingsAccount : accounts) {
//			System.out.println("Account No :" + savingsAccount.getAccountNo());
//			System.out.println("Balance :" + savingsAccount.getBalance());
//		}
			   //key  , value
//		HashMap<String, String> hashMap = new HashMap<>();
//		
//		hashMap.put("IND","091");
//		hashMap.put("US","001");
//		hashMap.put("CAN","001");		
//		hashMap.put("AUS","006");
//		hashMap.put("UK","044");
//		
//		Set<Entry<String, String>> entries = hashMap.entrySet();
//		//each entry will be stored into an Entry object
//		
//		for (Entry<String, String> entry : entries) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		Customer customer = new Customer(101, "Hary", "hary@gmail.com", "123123");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream("customerdata.ser");
//		
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		
//		objectOutputStream.writeObject(customer);
//		
//		objectOutputStream.close();
//		
//		fileOutputStream.close();
//		
//		System.out.println("Object state written to the file");
//		
//		FileInputStream inputStream = new FileInputStream("customerdata.ser");
//		
//		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//		
//		objectInputStream.readObject();
//		
//		Customer customer = (Customer)objectInputStream.readObject();
//		
//		System.out.println("Id :"+ customer.getId());
//		System.out.println("Name :"+ customer.getName());
//		System.out.println("Mail :"+ customer.getMail());
//		System.out.println("Phone"+ customer.getPhone());
		
		//System.in refers to the standard input device.
//		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//		
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//		String line = bufferedReader.readLine();
//		
//		System.out.println("you typed :"+line);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
//		System.out.println(names.lastIndexOf("Harry"));
		
//		names.remove(1);
		
		
		
		//System.out.println(names.get(1));
		
//		Iterator<String> iterator = names.iterator();
//		
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
//		}
//		
//		iterator.next();
		
//		LinkedList<String> names2 = new LinkedList<>();
//		
//		names2.add("Harry");
//		names2.add("Anil");
//		names2.add("John");
//		names2.add("Purimetla");
//		
//		names.addAll(names2);
//		
//		for (String str : names) {
//			System.out.println(str);
//		}
		
//		Object[] objects = names.toArray();
//		
//		String[] namesArray = new String[names.size()];
//		
//		//this toArray method is overloaded and it reads the elements from the collection and store them into String Array with reference we passed in this case
//		names.toArray(namesArray);
//		
//		for (String str : namesArray ) {
//			
//			System.out.println(str);
//			
//		}
//		
//		
//		
//		for(Object object: objects){
//			String str = (String)object;
//			
//			System.out.println(str);
//		}
//		
//		
//		
//		System.out.println(names.size());
//				
//		System.out.println(names.contains("Harry"));

		
	}
}
