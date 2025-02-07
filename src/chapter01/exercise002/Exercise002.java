package chapter01.exercise002;

public class Exercise002 {
    public static void main(String[] args) {
        var tb1 = """
                SELECT Orders.OrderID, Customers.CustomerName
                FROM Orders
                INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;""";
        
        var tb2 = """
                SELECT Orders.OrderID, Customers.CustomerName
                FROM Orders
                INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID; 
                """;
        
        System.out.println("BEFORE tb1\n" + tb1 + "AFTER tb1\n\n" + "BEFORE tb2\n" + tb2 + "AFTER tb2\n");
        
        var tb3 = """
                SELECT Orders.OrderID, Customers.CustomerName
                FROM Orders
                INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;""";
        
        var tb4 = """
                SELECT Orders.OrderID, Customers.CustomerName
                FROM Orders
                INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
""";
        
        System.out.println("BEFORE tb3\n" + tb3 + "AFTER tb3\n\n" + "BEFORE tb4\n" + tb4 + "AFTER tb4\n");
    }

}
