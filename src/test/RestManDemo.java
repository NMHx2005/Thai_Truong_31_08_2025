import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Class demo to test RestMan system functions
 * 
 * @author RestMan Team
 * @version 1.0
 */
public class RestManDemo {

    public static void main(String[] args) {
        System.out.println("=== RESTMAN SYSTEM DEMO ===\n");

        // Demo dish search function (Customer)
        demoCustomerSearchDish();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demo payment processing function (Sales Staff)
        demoSalesStaffProcessPayment();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demo other functions
        demoOtherFunctions();
    }

    /**
     * Demo dish search function for customer
     */
    private static void demoCustomerSearchDish() {
        System.out.println("1. DEMO DISH SEARCH FUNCTION (CUSTOMER)");
        System.out.println("-".repeat(50));

        // Simulate customer searching for dishes
        System.out.println("Customer Nguyen Van A searches for dishes with keyword: 'pho'");

        // Simulate search results
        List<String> searchResults = new ArrayList<>();
        searchResults.add("Dish 1: Pho Bo - Price: 50,000 VND");
        searchResults.add("Dish 2: Pho Ga - Price: 45,000 VND");
        searchResults.add("Dish 3: Pho Chay - Price: 40,000 VND");

        System.out.println("Search results:");
        for (String result : searchResults) {
            System.out.println("  + " + result);
        }

        // Simulate customer viewing dish details
        System.out.println("\nCustomer clicks on 'Pho Bo' to view details:");
        System.out.println("=== DISH DETAILS ===");
        System.out.println("Name: Pho Bo");
        System.out.println("Description: Traditional beef pho with rich broth");
        System.out.println("Price: 50,000 VND");
        System.out.println("Ingredients: Rice noodles, beef, broth, herbs");
        System.out.println("Preparation time: 15 minutes");

        // Simulate table reservation
        System.out.println("\nCustomer reserves table:");
        System.out.println("- Table name: Table 1");
        System.out.println("- Date: " + new Date());
        System.out.println("- Time: 18:00");
        System.out.println("- Number of guests: 4");
        System.out.println("Table reservation successful! Table 1 has been reserved for you.");

        // Simulate online ordering
        System.out.println("\nCustomer places online order:");
        System.out.println("- Delivery address: 456 XYZ Street, District 2, HCMC");
        System.out.println("- Pho Bo x 2");
        System.out.println("- Fresh Spring Rolls x 1");
        System.out.println("Online order successful! Order will be delivered in 30-45 minutes.");
    }

    /**
     * Demo payment processing function for sales staff
     */
    private static void demoSalesStaffProcessPayment() {
        System.out.println("2. DEMO PAYMENT PROCESSING FUNCTION (SALES STAFF)");
        System.out.println("-".repeat(50));

        // Simulate sales staff receiving customer
        System.out.println("Sales staff Tran Thi B receives customer:");
        System.out.println("- Customer name: Le Van C");
        System.out.println("- Number of guests: 3");
        System.out.println("Welcome to RestMan restaurant!");

        // Simulate taking order
        System.out.println("\nSales staff takes order:");
        System.out.println("- Customer: Le Van C");
        System.out.println("- Pho Bo x 2");
        System.out.println("- Bun Cha x 1");
        System.out.println("Order ORD001 has been created successfully!");

        // Simulate payment processing
        System.out.println("\nSales staff processes payment:");
        System.out.println("- Order ID: ORD001");
        System.out.println("- Table: Table 2");
        System.out.println("Searching for Table 2...");

        // Simulate invoice display
        String invoice = generateInvoice("ORD001", "Table 2");
        System.out.println("Invoice has been created:");
        System.out.println(invoice);

        // Simulate payment confirmation
        System.out.println("Payment confirmation successful!");

        // Simulate creating membership card
        System.out.println("\nSales staff creates membership card:");
        System.out.println("- Customer name: Pham Thi D");
        System.out.println("- Phone number: 0905555666");
        System.out.println("Membership card MEM001 has been created successfully!");

        // Simulate reservation confirmation
        System.out.println("\nSales staff confirms reservation:");
        System.out.println("- Customer: Vo Van E");
        System.out.println("- Table: Table 3");
        System.out.println("- Date: " + new Date());
        System.out.println("- Time: 19:00");
        System.out.println("Reservation has been confirmed successfully!");

        // Simulate online order confirmation
        System.out.println("\nSales staff confirms online order:");
        System.out.println("- Order ID: ORD123");
        System.out.println("- Customer: Hoang Thi F");
        System.out.println("- Delivery address: 321 GHI Street, District 4, HCMC");
        System.out.println("Online order has been confirmed and will be delivered in 30-45 minutes!");
    }

    /**
     * Demo other functions
     */
    private static void demoOtherFunctions() {
        System.out.println("3. DEMO OTHER FUNCTIONS");
        System.out.println("-".repeat(50));

        // Simulate sales staff viewing personal information
        System.out.println("Sales staff Ly Van G views personal information:");
        System.out.println("=== STAFF INFORMATION ===");
        System.out.println("Full name: Ly Van G");
        System.out.println("Position: Sales Staff");
        System.out.println("Hire date: 15/04/2021");
        System.out.println("Salary: 7,500,000 VND");
        System.out.println("Email: lyvang@email.com");
        System.out.println("Phone: 0901111222");

        // Simulate updating information
        System.out.println("\nStaff updates information:");
        System.out.println("- New address: 999 MNO Street, District 6, HCMC");
        System.out.println("- New email: lyvang_new@email.com");
        System.out.println("- New phone: 0903333444");
        System.out.println("Personal information update successful!");

        // Simulate viewing work schedule
        System.out.println("\nStaff views work schedule:");
        System.out.println("Work schedule for " + new Date() + " of Ly Van G");
        System.out.println("Position: Sales Staff");
        System.out.println("Work hours: 8:00 - 17:00");
        System.out.println("Lunch break: 12:00 - 13:00");

        // Simulate password change
        System.out.println("\nStaff changes password:");
        System.out.println("Password change successful for staff: Ly Van G");

        // Simulate logout
        System.out.println("\nStaff logs out:");
        System.out.println("Staff Ly Van G has logged out");

        // Simulate statistics
        System.out.println("\nSales staff statistics:");
        System.out.println("- Number of processed orders: 0");
        System.out.println("- Total sales: 0.0 VND");
    }

    /**
     * Generate sample invoice
     */
    private static String generateInvoice(String orderId, String tableName) {
        StringBuilder invoice = new StringBuilder();
        invoice.append("================================\n");
        invoice.append("           INVOICE\n");
        invoice.append("================================\n");
        invoice.append("Order ID: ").append(orderId).append("\n");
        invoice.append("Table: ").append(tableName).append("\n");
        invoice.append("Date: ").append(new Date()).append("\n");
        invoice.append("Staff: Tran Thi B\n");
        invoice.append("--------------------------------\n");
        invoice.append("Dish: Pho Bo x 2\n");
        invoice.append("Unit price: 50,000 VND\n");
        invoice.append("Subtotal: 100,000 VND\n");
        invoice.append("Dish: Bun Cha x 1\n");
        invoice.append("Unit price: 45,000 VND\n");
        invoice.append("Subtotal: 45,000 VND\n");
        invoice.append("--------------------------------\n");
        invoice.append("Total: 145,000 VND\n");
        invoice.append("================================\n");

        return invoice.toString();
    }
}
