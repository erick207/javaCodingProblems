package chapter01.exercise001;

public class Exercise001 {
    public static void main(String[] args) {
        var tb = """
                	SELECT Orders.OrderID, Customers.CustomerName
                	FROM Orders
                	INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID; 
                	""";
		System.out.println(tb);
}
}
