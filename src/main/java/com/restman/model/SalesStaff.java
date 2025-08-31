package com.restman.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Class SalesStaff - Lớp nhân viên bán hàng kế thừa từ Staff
 * 
 * @author RestMan Team
 * @version 1.0
 */
public class SalesStaff extends Staff {
    // Private attributes
    private String salesId;
    private List<String> processedOrders;
    private double totalSales;

    // Constructors
    public SalesStaff() {
        super();
        this.processedOrders = new ArrayList<>();
        this.totalSales = 0.0;
    }

    public SalesStaff(int id, String username, String password, String fullName,
            String address, Date birthDate, String email, String phone,
            String position, Date hireDate, double salary, String salesId) {
        super(id, username, password, fullName, address, birthDate, email, phone,
                position, hireDate, salary);
        this.salesId = salesId;
        this.processedOrders = new ArrayList<>();
        this.totalSales = 0.0;
    }

    // Public methods
    /**
     * Tiếp nhận khách hàng
     * 
     * @param customerName   Tên khách hàng
     * @param numberOfGuests Số lượng khách
     * @return true nếu tiếp nhận thành công
     */
    public boolean receiveCustomer(String customerName, int numberOfGuests) {
        System.out.println("Nhân viên " + getFullName() + " tiếp nhận khách hàng:");
        System.out.println("- Tên khách hàng: " + customerName);
        System.out.println("- Số lượng khách: " + numberOfGuests);
        System.out.println("Chào mừng quý khách đến với nhà hàng RestMan!");
        return true;
    }

    /**
     * Nhận đơn hàng từ khách hàng
     * 
     * @param customerName Tên khách hàng
     * @param dishNames    Danh sách món ăn
     * @param quantities   Danh sách số lượng
     * @return Mã đơn hàng
     */
    public String takeOrder(String customerName, List<String> dishNames, List<Integer> quantities) {
        System.out.println("Nhân viên " + getFullName() + " nhận đơn hàng:");
        System.out.println("- Khách hàng: " + customerName);

        String orderId = "ORD" + System.currentTimeMillis();

        for (int i = 0; i < dishNames.size(); i++) {
            System.out.println("- " + dishNames.get(i) + " x" + quantities.get(i));
        }

        System.out.println("Đơn hàng " + orderId + " đã được tạo thành công!");
        processedOrders.add(orderId);

        return orderId;
    }

    /**
     * Xử lý thanh toán cho đơn hàng
     * 
     * @param orderId   Mã đơn hàng
     * @param tableName Tên bàn
     * @return Hóa đơn thanh toán
     */
    public String processPayment(String orderId, String tableName) {
        System.out.println("Nhân viên " + getFullName() + " xử lý thanh toán:");
        System.out.println("- Mã đơn hàng: " + orderId);
        System.out.println("- Bàn: " + tableName);

        // Giả lập tìm kiếm bàn
        System.out.println("Tìm kiếm bàn " + tableName + "...");

        // Giả lập hiển thị hóa đơn
        String invoice = generateInvoice(orderId, tableName);
        System.out.println("Hóa đơn đã được tạo:");
        System.out.println(invoice);

        // Giả lập xác nhận thanh toán
        System.out.println("Xác nhận thanh toán thành công!");

        // Cập nhật doanh số
        double orderAmount = calculateOrderAmount(orderId);
        totalSales += orderAmount;

        return invoice;
    }

    /**
     * Tạo thẻ thành viên cho khách hàng
     * 
     * @param customerName  Tên khách hàng
     * @param customerPhone Số điện thoại khách hàng
     * @return Mã thẻ thành viên
     */
    public String createMembershipCard(String customerName, String customerPhone) {
        System.out.println("Nhân viên " + getFullName() + " tạo thẻ thành viên:");
        System.out.println("- Tên khách hàng: " + customerName);
        System.out.println("- Số điện thoại: " + customerPhone);

        String membershipId = "MEM" + System.currentTimeMillis();
        System.out.println("Thẻ thành viên " + membershipId + " đã được tạo thành công!");

        return membershipId;
    }

    /**
     * Xác nhận đặt bàn
     * 
     * @param customerName    Tên khách hàng
     * @param tableName       Tên bàn
     * @param reservationDate Ngày đặt bàn
     * @param reservationTime Giờ đặt bàn
     * @return true nếu xác nhận thành công
     */
    public boolean confirmReservation(String customerName, String tableName,
            Date reservationDate, String reservationTime) {
        System.out.println("Nhân viên " + getFullName() + " xác nhận đặt bàn:");
        System.out.println("- Khách hàng: " + customerName);
        System.out.println("- Bàn: " + tableName);
        System.out.println("- Ngày: " + reservationDate);
        System.out.println("- Giờ: " + reservationTime);
        System.out.println("Đặt bàn đã được xác nhận thành công!");

        return true;
    }

    /**
     * Xác nhận đơn hàng online
     * 
     * @param orderId         Mã đơn hàng
     * @param customerName    Tên khách hàng
     * @param deliveryAddress Địa chỉ giao hàng
     * @return true nếu xác nhận thành công
     */
    public boolean confirmOnlineOrder(String orderId, String customerName, String deliveryAddress) {
        System.out.println("Nhân viên " + getFullName() + " xác nhận đơn hàng online:");
        System.out.println("- Mã đơn hàng: " + orderId);
        System.out.println("- Khách hàng: " + customerName);
        System.out.println("- Địa chỉ giao hàng: " + deliveryAddress);
        System.out.println("Đơn hàng online đã được xác nhận và sẽ được giao trong 30-45 phút!");

        return true;
    }

    /**
     * Tạo hóa đơn
     * 
     * @param orderId   Mã đơn hàng
     * @param tableName Tên bàn
     * @return Nội dung hóa đơn
     */
    private String generateInvoice(String orderId, String tableName) {
        StringBuilder invoice = new StringBuilder();
        invoice.append("================================\n");
        invoice.append("           HÓA ĐƠN\n");
        invoice.append("================================\n");
        invoice.append("Mã đơn hàng: ").append(orderId).append("\n");
        invoice.append("Bàn: ").append(tableName).append("\n");
        invoice.append("Ngày: ").append(new Date()).append("\n");
        invoice.append("Nhân viên: ").append(getFullName()).append("\n");
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
     * Tính tổng tiền đơn hàng
     * 
     * @param orderId Mã đơn hàng
     * @return Tổng tiền
     */
    private double calculateOrderAmount(String orderId) {
        // Giả lập tính tổng tiền
        return 100000.0;
    }

    // Getters and Setters
    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public List<String> getProcessedOrders() {
        return new ArrayList<>(processedOrders);
    }

    public double getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return "SalesStaff{" +
                "salesId='" + salesId + '\'' +
                ", processedOrders=" + processedOrders +
                ", totalSales=" + totalSales +
                ", " + super.toString() +
                '}';
    }
}
