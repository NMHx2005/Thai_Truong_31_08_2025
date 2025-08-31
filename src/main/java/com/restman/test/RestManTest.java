package com.restman.test;

import com.restman.model.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Class test để kiểm tra các chức năng của hệ thống RestMan
 * 
 * @author RestMan Team
 * @version 1.0
 */
public class RestManTest {

    public static void main(String[] args) {
        System.out.println("=== KIỂM TRA HỆ THỐNG RESTMAN ===\n");

        // Test chức năng tìm kiếm món ăn (Customer)
        testCustomerSearchDish();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Test chức năng xử lý thanh toán (Sales Staff)
        testSalesStaffProcessPayment();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Test các chức năng khác
        testOtherFunctions();
    }

    /**
     * Test chức năng tìm kiếm món ăn của khách hàng
     */
    private static void testCustomerSearchDish() {
        System.out.println("1. KIỂM TRA CHỨC NĂNG TÌM KIẾM MÓN ĂN (CUSTOMER)");
        System.out.println("-".repeat(50));

        // Tạo khách hàng
        Customer customer = new Customer(1, "customer1", "pass123", "Nguyễn Văn A",
                "123 Đường ABC, Quận 1, TP.HCM", new Date(90, 0, 15),
                "nguyenvana@email.com", "0901234567",
                "CUST001", "MEM001", new Date());

        // Test đăng nhập
        System.out.println("Test đăng nhập:");
        customer.login("customer1", "pass123");

        // Test tìm kiếm món ăn
        System.out.println("\nTest tìm kiếm món ăn:");
        List<String> searchResults = customer.searchDish("phở");
        System.out.println("Kết quả tìm kiếm:");
        for (String result : searchResults) {
            System.out.println("  + " + result);
        }

        // Test đặt bàn
        System.out.println("\nTest đặt bàn:");
        customer.reserveTable("Bàn 1", new Date(), "18:00", 4);

        // Test đặt hàng online
        System.out.println("\nTest đặt hàng online:");
        List<String> dishNames = new ArrayList<>();
        dishNames.add("Phở bò");
        dishNames.add("Gỏi cuốn");
        List<Integer> quantities = new ArrayList<>();
        quantities.add(2);
        quantities.add(1);
        customer.orderOnline(dishNames, quantities, "456 Đường XYZ, Quận 2, TP.HCM");
    }

    /**
     * Test chức năng xử lý thanh toán của nhân viên bán hàng
     */
    private static void testSalesStaffProcessPayment() {
        System.out.println("2. KIỂM TRA CHỨC NĂNG XỬ LÝ THANH TOÁN (SALES STAFF)");
        System.out.println("-".repeat(50));

        // Tạo nhân viên bán hàng
        SalesStaff salesStaff = new SalesStaff(2, "sales1", "pass456", "Trần Thị B",
                "789 Đường DEF, Quận 3, TP.HCM", new Date(85, 5, 20),
                "tranthib@email.com", "0909876543",
                "Nhân viên bán hàng", new Date(120, 0, 1), 8000000.0,
                "SALES001");

        // Test đăng nhập
        System.out.println("Test đăng nhập:");
        salesStaff.login("sales1", "pass456");

        // Test tiếp nhận khách hàng
        System.out.println("\nTest tiếp nhận khách hàng:");
        salesStaff.receiveCustomer("Lê Văn C", 3);

        // Test nhận đơn hàng
        System.out.println("\nTest nhận đơn hàng:");
        List<String> dishNames = new ArrayList<>();
        dishNames.add("Phở bò");
        dishNames.add("Bún chả");
        List<Integer> quantities = new ArrayList<>();
        quantities.add(2);
        quantities.add(1);
        String orderId = salesStaff.takeOrder("Lê Văn C", dishNames, quantities);

        // Test xử lý thanh toán
        System.out.println("\nTest xử lý thanh toán:");
        String invoice = salesStaff.processPayment(orderId, "Bàn 2");

        // Test tạo thẻ thành viên
        System.out.println("\nTest tạo thẻ thành viên:");
        salesStaff.createMembershipCard("Phạm Thị D", "0905555666");

        // Test xác nhận đặt bàn
        System.out.println("\nTest xác nhận đặt bàn:");
        salesStaff.confirmReservation("Võ Văn E", "Bàn 3", new Date(), "19:00");

        // Test xác nhận đơn hàng online
        System.out.println("\nTest xác nhận đơn hàng online:");
        salesStaff.confirmOnlineOrder("ORD123", "Hoàng Thị F", "321 Đường GHI, Quận 4, TP.HCM");
    }

    /**
     * Test các chức năng khác
     */
    private static void testOtherFunctions() {
        System.out.println("3. KIỂM TRA CÁC CHỨC NĂNG KHÁC");
        System.out.println("-".repeat(50));

        // Test nhân viên bán hàng
        SalesStaff salesStaff = new SalesStaff(3, "sales2", "pass789", "Lý Văn G",
                "654 Đường JKL, Quận 5, TP.HCM", new Date(88, 8, 10),
                "lyvang@email.com", "0901111222",
                "Nhân viên bán hàng", new Date(121, 3, 15), 7500000.0,
                "SALES002");

        // Test xem thông tin cá nhân
        System.out.println("Test xem thông tin cá nhân:");
        salesStaff.viewProfile();

        // Test cập nhật thông tin
        System.out.println("\nTest cập nhật thông tin:");
        salesStaff.updateProfile("999 Đường MNO, Quận 6, TP.HCM", "lyvang_new@email.com", "0903333444");

        // Test xem lịch làm việc
        System.out.println("\nTest xem lịch làm việc:");
        salesStaff.viewSchedule(new Date());

        // Test đổi mật khẩu
        System.out.println("\nTest đổi mật khẩu:");
        salesStaff.changePassword("pass789", "newpass123");

        // Test đăng xuất
        System.out.println("\nTest đăng xuất:");
        salesStaff.logout();

        // Test thống kê
        System.out.println("\nThống kê nhân viên bán hàng:");
        System.out.println("- Số đơn hàng đã xử lý: " + salesStaff.getProcessedOrders().size());
        System.out.println("- Tổng doanh số: " + salesStaff.getTotalSales() + " VND");
    }
}
