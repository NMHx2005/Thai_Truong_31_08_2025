package com.restman.test;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Class test đơn giản để kiểm tra các chức năng cơ bản
 * 
 * @author RestMan Team
 * @version 1.0
 */
public class SimpleTest {

    public static void main(String[] args) {
        System.out.println("=== KIỂM TRA HỆ THỐNG RESTMAN ===\n");

        // Test tạo đối tượng và gọi phương thức
        testBasicFunctionality();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Test các chức năng khác
        testOtherFeatures();
    }

    /**
     * Test các chức năng cơ bản
     */
    private static void testBasicFunctionality() {
        System.out.println("1. KIỂM TRA CHỨC NĂNG CƠ BẢN");
        System.out.println("-".repeat(50));

        // Giả lập test tìm kiếm món ăn
        System.out.println("Test tìm kiếm món ăn:");
        List<String> searchResults = searchDish("phở");
        System.out.println("Kết quả tìm kiếm:");
        for (String result : searchResults) {
            System.out.println("  + " + result);
        }

        // Giả lập test xử lý thanh toán
        System.out.println("\nTest xử lý thanh toán:");
        String invoice = processPayment("ORD001", "Bàn 1");
        System.out.println("Hóa đơn được tạo:");
        System.out.println(invoice);
    }

    /**
     * Test các tính năng khác
     */
    private static void testOtherFeatures() {
        System.out.println("2. KIỂM TRA CÁC TÍNH NĂNG KHÁC");
        System.out.println("-".repeat(50));

        // Test đặt bàn
        System.out.println("Test đặt bàn:");
        boolean reservationSuccess = reserveTable("Bàn 2", new Date(), "18:00", 4);
        System.out.println("Kết quả đặt bàn: " + (reservationSuccess ? "Thành công" : "Thất bại"));

        // Test tạo thẻ thành viên
        System.out.println("\nTest tạo thẻ thành viên:");
        String membershipId = createMembershipCard("Nguyễn Văn A", "0901234567");
        System.out.println("Thẻ thành viên được tạo: " + membershipId);

        // Test đặt hàng online
        System.out.println("\nTest đặt hàng online:");
        List<String> dishNames = new ArrayList<>();
        dishNames.add("Phở bò");
        dishNames.add("Gỏi cuốn");
        List<Integer> quantities = new ArrayList<>();
        quantities.add(2);
        quantities.add(1);
        boolean orderSuccess = orderOnline(dishNames, quantities, "123 Đường ABC, Quận 1, TP.HCM");
        System.out.println("Kết quả đặt hàng: " + (orderSuccess ? "Thành công" : "Thất bại"));
    }

    /**
     * Giả lập chức năng tìm kiếm món ăn
     */
    private static List<String> searchDish(String keyword) {
        List<String> results = new ArrayList<>();
        if (keyword != null && !keyword.trim().isEmpty()) {
            results.add("Món ăn 1: " + keyword + " - Giá: 50,000 VND");
            results.add("Món ăn 2: " + keyword + " đặc biệt - Giá: 75,000 VND");
            results.add("Món ăn 3: " + keyword + " truyền thống - Giá: 60,000 VND");
        }
        return results;
    }

    /**
     * Giả lập chức năng xử lý thanh toán
     */
    private static String processPayment(String orderId, String tableName) {
        StringBuilder invoice = new StringBuilder();
        invoice.append("================================\n");
        invoice.append("           HÓA ĐƠN\n");
        invoice.append("================================\n");
        invoice.append("Mã đơn hàng: ").append(orderId).append("\n");
        invoice.append("Bàn: ").append(tableName).append("\n");
        invoice.append("Ngày: ").append(new Date()).append("\n");
        invoice.append("Nhân viên: Nhân viên bán hàng\n");
        invoice.append("--------------------------------\n");
        invoice.append("Món ăn: Phở bò x 2\n");
        invoice.append("Đơn giá: 50,000 VND\n");
        invoice.append("Thành tiền: 100,000 VND\n");
        invoice.append("--------------------------------\n");
        invoice.append("Tổng cộng: 100,000 VND\n");
        invoice.append("================================\n");

        return invoice.toString();
    }

    /**
     * Giả lập chức năng đặt bàn
     */
    private static boolean reserveTable(String tableName, Date date, String time, int guests) {
        System.out.println("Đặt bàn " + tableName + " cho " + guests + " khách vào " + time + " ngày " + date);
        return Math.random() > 0.3; // 70% khả năng thành công
    }

    /**
     * Giả lập chức năng tạo thẻ thành viên
     */
    private static String createMembershipCard(String customerName, String phone) {
        System.out.println("Tạo thẻ thành viên cho " + customerName + " - " + phone);
        return "MEM" + System.currentTimeMillis();
    }

    /**
     * Giả lập chức năng đặt hàng online
     */
    private static boolean orderOnline(List<String> dishNames, List<Integer> quantities, String address) {
        System.out.println("Đặt hàng online cho địa chỉ: " + address);
        for (int i = 0; i < dishNames.size(); i++) {
            System.out.println("- " + dishNames.get(i) + " x" + quantities.get(i));
        }
        return Math.random() > 0.2; // 80% khả năng thành công
    }
}
