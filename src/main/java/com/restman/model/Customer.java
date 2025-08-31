package com.restman.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Class Customer - Lớp khách hàng kế thừa từ Member
 * 
 * @author RestMan Team
 * @version 1.0
 */
public class Customer extends Member {
    // Private attributes
    private String customerId;
    private String membershipCard;
    private Date registrationDate;
    private List<String> favoriteDishes;

    // Constructors
    public Customer() {
        super();
        this.favoriteDishes = new ArrayList<>();
    }

    public Customer(int id, String username, String password, String fullName,
            String address, Date birthDate, String email, String phone,
            String customerId, String membershipCard, Date registrationDate) {
        super(id, username, password, fullName, address, birthDate, email, phone);
        this.customerId = customerId;
        this.membershipCard = membershipCard;
        this.registrationDate = registrationDate;
        this.favoriteDishes = new ArrayList<>();
    }

    // Public methods
    /**
     * Tìm kiếm thông tin món ăn theo từ khóa
     * 
     * @param keyword Từ khóa tìm kiếm
     * @return Danh sách món ăn phù hợp
     */
    public List<String> searchDish(String keyword) {
        System.out.println("Khách hàng " + getFullName() + " tìm kiếm món ăn với từ khóa: " + keyword);

        // Giả lập kết quả tìm kiếm
        List<String> searchResults = new ArrayList<>();
        if (keyword != null && !keyword.trim().isEmpty()) {
            searchResults.add("Món ăn 1: " + keyword + " - Giá: 50,000 VND");
            searchResults.add("Món ăn 2: " + keyword + " đặc biệt - Giá: 75,000 VND");
            searchResults.add("Món ăn 3: " + keyword + " truyền thống - Giá: 60,000 VND");
        }

        System.out.println("Tìm thấy " + searchResults.size() + " món ăn phù hợp");
        return searchResults;
    }

    /**
     * Đặt bàn tại nhà hàng
     * 
     * @param tableName       Tên bàn
     * @param reservationDate Ngày đặt bàn
     * @param reservationTime Giờ đặt bàn
     * @param numberOfGuests  Số lượng khách
     * @return true nếu đặt bàn thành công, false nếu thất bại
     */
    public boolean reserveTable(String tableName, Date reservationDate,
            String reservationTime, int numberOfGuests) {
        System.out.println("Khách hàng " + getFullName() + " đặt bàn:");
        System.out.println("- Tên bàn: " + tableName);
        System.out.println("- Ngày: " + reservationDate);
        System.out.println("- Giờ: " + reservationTime);
        System.out.println("- Số khách: " + numberOfGuests);

        // Giả lập kiểm tra bàn có sẵn
        boolean tableAvailable = Math.random() > 0.3; // 70% khả năng bàn có sẵn

        if (tableAvailable) {
            System.out.println("Đặt bàn thành công! Bàn " + tableName + " đã được đặt cho bạn.");
            return true;
        } else {
            System.out.println("Xin lỗi, bàn " + tableName + " không có sẵn vào thời gian này.");
            return false;
        }
    }

    /**
     * Đặt hàng online
     * 
     * @param dishNames       Danh sách tên món ăn
     * @param quantities      Danh sách số lượng tương ứng
     * @param deliveryAddress Địa chỉ giao hàng
     * @return true nếu đặt hàng thành công, false nếu thất bại
     */
    public boolean orderOnline(List<String> dishNames, List<Integer> quantities,
            String deliveryAddress) {
        System.out.println("Khách hàng " + getFullName() + " đặt hàng online:");
        System.out.println("- Địa chỉ giao hàng: " + deliveryAddress);

        for (int i = 0; i < dishNames.size(); i++) {
            System.out.println("- " + dishNames.get(i) + " x" + quantities.get(i));
        }

        // Giả lập xử lý đặt hàng
        boolean orderSuccess = Math.random() > 0.2; // 80% khả năng đặt hàng thành công

        if (orderSuccess) {
            System.out.println("Đặt hàng online thành công! Đơn hàng sẽ được giao trong 30-45 phút.");
            return true;
        } else {
            System.out.println("Xin lỗi, có lỗi xảy ra khi đặt hàng. Vui lòng thử lại.");
            return false;
        }
    }

    /**
     * Thêm món ăn vào danh sách yêu thích
     * 
     * @param dishName Tên món ăn
     */
    public void addFavoriteDish(String dishName) {
        if (!favoriteDishes.contains(dishName)) {
            favoriteDishes.add(dishName);
            System.out.println("Đã thêm " + dishName + " vào danh sách yêu thích");
        } else {
            System.out.println(dishName + " đã có trong danh sách yêu thích");
        }
    }

    /**
     * Xem danh sách món ăn yêu thích
     * 
     * @return Danh sách món ăn yêu thích
     */
    public List<String> getFavoriteDishes() {
        return new ArrayList<>(favoriteDishes);
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMembershipCard() {
        return membershipCard;
    }

    public void setMembershipCard(String membershipCard) {
        this.membershipCard = membershipCard;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", membershipCard='" + membershipCard + '\'' +
                ", registrationDate=" + registrationDate +
                ", favoriteDishes=" + favoriteDishes +
                ", " + super.toString() +
                '}';
    }
}
