# RestMan – Lời giải đầy đủ cho ĐỀ SỐ 20

## BẢNG TỪ KHÓA (RestMan)

- Nhóm khái niệm liên quan đến con người

| STT | Tên Tiếng Việt | Tiếng Anh | Giải thích |
| --- | --- | --- | --- |
| 1 | Nhân viên | Staff | Người làm việc trong nhà hàng, có thể thuộc các vai trò: quản lý, bán hàng, kho. Thực hiện nghiệp vụ theo quyền hạn. |
| 2 | Nhân viên quản lý | Manager | Người có thẩm quyền cao nhất, truy cập chức năng quản lý danh mục, menu combo, xem thống kê tổng hợp. |
| 3 | Nhân viên bán hàng | Sales Staff | Phục vụ tại bàn: nhận khách, ghi order, xử lý thanh toán, in hóa đơn. |
| 4 | Nhân viên kho | Warehouse Staff | Nhập nguyên liệu từ nhà cung cấp, quản lý tồn kho, cập nhật chứng từ nhập. |
| 5 | Khách hàng | Customer | Người dùng cuối, có thể tìm món, đặt bàn/đặt món trực tuyến, dùng dịch vụ tại nhà hàng. |
| 6 | Nhà cung cấp | Supplier | Tổ chức/cá nhân cung cấp nguyên liệu cho nhà hàng, theo dõi giao dịch và chất lượng. |

- Nhóm khái niệm liên quan đến hành động

| STT | Tên Tiếng Việt | Tiếng Anh | Giải thích |
| --- | --- | --- | --- |
| 7 | Đăng nhập | Login | Xác thực để truy cập hệ thống RestMan với quyền theo vai trò. |
| 8 | Đăng xuất | Logout | Thoát khỏi hệ thống an toàn. |
| 9 | Quản lý món ăn | Manage Dish Information | Thêm/sửa/xóa/cập nhật thông tin món ăn. |
| 10 | Quản lý nguyên liệu | Manage Ingredient Information | Thêm/sửa/xóa/cập nhật nguyên liệu, đơn vị tính, giá nhập. |
| 11 | Quản lý nhà cung cấp | Manage Supplier Information | Quản lý danh mục nhà cung cấp, thông tin liên hệ, ghi chú. |
| 12 | Thiết lập menu combo | Setup Menu Combo | Tạo combo gồm nhiều món với giá ưu đãi. |
| 13 | Xem thống kê | View Statistics | Xem các báo cáo tổng hợp: món, nguyên liệu, khách hàng, nhà cung cấp. |
| 14 | Tìm kiếm món ăn | Search Dishes | Khách nhập từ khóa, hệ thống trả về danh sách món phù hợp; chọn món để xem chi tiết. |
| 15 | Đặt bàn trực tuyến | Reserve Table Online | Khách đặt chỗ theo thời gian/người, ghi chú; duyệt trạng thái. |
| 16 | Đặt món trực tuyến | Place Order Online | Khách chọn món trước khi đến (tùy chính sách), liên kết với đặt bàn. |
| 17 | Nhận khách tại bàn | Receive Customer at Table | Bố trí bàn cho khách đến trực tiếp, mở order cho bàn. |
| 18 | Ghi order tại bàn | Take Order at Table | Thêm dòng món/SL/ghi chú vào order đang mở. |
| 19 | Nhận thanh toán tại bàn | Receive Payment at Table | Tìm bàn → xem hóa đơn → xác nhận → in hóa đơn → nhận tiền mặt/chuyển khoản. |
| 20 | Nhập nguyên liệu từ NCC | Receive Inventory from Supplier | Tạo phiếu nhập, kiểm đếm, cập nhật tồn kho. |

- Nhóm khái niệm liên quan đến đối tượng xử lý

| STT | Tên Tiếng Việt | Tiếng Anh | Giải thích |
| --- | --- | --- | --- |
| 21 | Món ăn | Dish | Tên, mô tả, giá, hình ảnh, trạng thái kinh doanh. |
| 22 | Nguyên liệu | Ingredient | Mã, tên, đơn vị, giá nhập, tồn kho, trạng thái. |
| 23 | Món–Nguyên liệu | Dish Ingredient | Bảng n-n xác định định mức nguyên liệu cho từng món. |
| 24 | Combo | Combo | Gói nhiều món với đơn giá combo. |
| 25 | Mục combo | Combo Item | Bảng n-n giữa combo và món. |
| 26 | Bàn | Table | Mã bàn, sức chứa, trạng thái (FREE/OCCUPIED/CLEANING). |
| 27 | Đặt bàn | Reservation | Khách, bàn, thời điểm, số người, ghi chú, trạng thái. |
| 28 | Đơn gọi món | Order | Bàn, khách (tùy chọn), nhân viên, thời gian tạo, trạng thái. |
| 29 | Dòng món | Order Item | Món/Combo, số lượng, đơn giá, thành tiền. |
| 30 | Thanh toán | Payment | Phương thức, số tiền, thời điểm, trạng thái. |
| 31 | Hóa đơn | Invoice | Số hóa đơn, tổng tiền, thuế/chiết khấu, thành tiền, thời điểm xuất. |
| 32 | Phiếu nhập kho | Inventory Receipt | NCC, NV kho, thời điểm, ghi chú. |
| 33 | Dòng phiếu nhập | Inventory Receipt Item | Nguyên liệu, số lượng, đơn giá, thành tiền. |

---

> Tài liệu này tổng hợp phân tích yêu cầu, use case, kịch bản, mô hình lớp phân tích/thiết kế, sơ đồ giao tiếp, ánh xạ CSDL, khung mã Java, sơ đồ gói và triển khai 3 tầng cho hệ thống quản lý nhà hàng RestMan.

---

## 0. Đối chiếu nhanh với mẫu GaraMan (đề 30)
- GaraMan(Service/Part) ↔ RestMan(Dish/Ingredient).
- Receive Payment ↔ Receive Payment tại bàn.
- Book Appointment ↔ Đặt bàn/đặt món trực tuyến.
- Warehouse nhập Parts ↔ Kho nhập nguyên liệu từ Supplier.
- Thêm mới điểm riêng: Menu Combo, Bàn(Ban/Table), Đơn gọi món(Order) tại bàn.

---

## Câu 1. Use Case cho 2 chức năng trọng tâm

### 1.a) Biểu đồ use case (Mermaid)

#### UC: Khách hàng tìm kiếm thông tin món ăn
[Chèn hình PlantUML: vp_import/usecase_search_dish_detail.puml]

#### UC: Nhân viên bán hàng nhận thanh toán tại bàn
[Chèn hình PlantUML: vp_import/usecase_receive_payment_detail.puml]

### 1.b) Kịch bản (Scenario)

#### UC1: Khách hàng tìm kiếm thông tin món ăn
- Tiền điều kiện: Hệ thống có dữ liệu món ăn; khách có thể không cần đăng nhập.
- Luồng chính:
  1. Khách chọn menu "Tìm món".
  2. Nhập từ khóa tên món và nhấn tìm.
  3. Hệ thống hiển thị danh sách món có tên chứa từ khóa: tên, giá, mô tả ngắn, hình đại diện.
  4. Khách chọn một món.
  5. Hệ thống hiển thị chi tiết món: tên đầy đủ, mô tả, giá, thành phần chính, hình ảnh, tình trạng bán.
- Ngoại lệ/nhánh:
  - 3a. Không có kết quả: hiển thị thông báo và gợi ý từ khóa gần đúng.
  - 5a. Món tạm ngừng bán: gắn nhãn "Hết/Ngừng" và ẩn nút đặt món.

#### UC2: Nhân viên nhận thanh toán tại bàn
- Tiền điều kiện: Bàn đã có order ở trạng thái "Đang phục vụ" hoặc "Chờ thanh toán".
- Luồng chính:
  1. Nhân viên mở menu "Thanh toán".
  2. Nhập tên/mã bàn để tìm.
  3. Chọn đúng bàn từ danh sách kết quả.
  4. Hệ thống hiển thị hóa đơn: danh sách món, SL, đơn giá, thành tiền, tổng tiền, thuế/giảm giá (nếu có).
  5. Nhân viên xác nhận thanh toán.
  6. Hệ thống in hóa đơn và cập nhật trạng thái order → "Đã thanh toán", bàn → "Trống".
  7. Nhân viên nhận tiền mặt/chuyển khoản và kết thúc.
- Ngoại lệ/nhánh:
  - 2a. Không tìm thấy bàn: thông báo, cho thử lại.
  - 4a. Có món chưa chốt số lượng: yêu cầu xác nhận sửa dòng món trước khi thanh toán.
  - 5a. Khách yêu cầu tách/ghép hóa đơn: hệ thống hỗ trợ tách/ghép rồi quay lại bước 4.

---

## Câu 2. Thực thể và biểu đồ lớp phân tích

### 2.a) Danh sách lớp thực thể và thuộc tính cơ bản
- UserAccount(id, username, password_hash, full_name, email, phone, role)
- Staff(id, code, position, joined_at) – kế thừa từ UserAccount hoặc liên kết 1–1
- Manager, SalesStaff, WarehouseStaff – chuyên biệt vai trò Staff
- Customer(id, name, phone, email, dob, gender, member_card_no?)
- Supplier(id, name, address, phone, email, contact_person, note)
- Ingredient(id, code, name, unit, cost_price, stock_qty, status)
- Dish(id, code, name, description, price, is_active, image_url)
- DishIngredient(dish_id, ingredient_id, quantity_required)
- Combo(id, code, name, price, description)
- ComboItem(combo_id, dish_id, quantity)
- TableEntity(id, code, name, capacity, status)
- Reservation(id, customer_id, table_id, reserved_at, people, note, status)
- Order(id, table_id, customer_id?, sales_staff_id, created_at, status)
- OrderItem(id, order_id, dish_id, combo_id?, quantity, unit_price, amount)
- Payment(id, order_id, method, paid_amount, paid_at, status)
- Invoice(id, order_id, number, total_amount, tax_amount, discount_amount, grand_total, issued_at)
- InventoryReceipt(id, supplier_id, warehouse_staff_id, received_at, note)
- InventoryReceiptItem(receipt_id, ingredient_id, quantity, unit_cost, amount)

Quan hệ chính: Customer–Reservation(1–n), Table–Order(1–n), Order–OrderItem(1–n), Order–Payment(1–1..n), Supplier–Ingredient(n–m qua bảng cung ứng tùy chọn), Dish–Ingredient(n–m), Combo–Dish(n–m).

### 2.b) Biểu đồ lớp phân tích (Mermaid)
[Chèn hình PlantUML: vp_import/class_analysis.puml]

---

## Câu 3. Biểu đồ giao tiếp và lớp thiết kế cho 2 use case

### 3.a) Giao tiếp – UC Tìm kiếm món ăn (sequence/communication)
[Chèn hình PlantUML: vp_import/sequence_search_dish.puml]

### 3.a) Giao tiếp – UC Nhận thanh toán tại bàn
[Chèn hình PlantUML: vp_import/sequence_receive_payment.puml]

### 3.b) Biểu đồ lớp thiết kế (Controller–Service–Repository)
[Chèn hình PlantUML: vp_import/class_design.puml]

---

## Câu 4. Bảng dữ liệu và khung mã Java

### 4.a) Bảng dữ liệu (DDL rút gọn)
```sql
-- Khách hàng
CREATE TABLE customers (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  name VARCHAR(200) NOT NULL,
  phone VARCHAR(30),
  email VARCHAR(120),
  dob DATE,
  gender VARCHAR(10)
);

-- Bàn
CREATE TABLE tables (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  code VARCHAR(30) UNIQUE NOT NULL,
  name VARCHAR(100),
  capacity INT,
  status VARCHAR(20) -- FREE, OCCUPIED, CLEANING
);

-- Món ăn
CREATE TABLE dishes (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  code VARCHAR(30) UNIQUE,
  name VARCHAR(200) NOT NULL,
  description TEXT,
  price DECIMAL(12,2) NOT NULL,
  is_active BOOLEAN DEFAULT TRUE,
  image_url TEXT
);

-- Đơn gọi món
CREATE TABLE orders (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  table_id BIGINT NOT NULL REFERENCES tables(id),
  customer_id BIGINT REFERENCES customers(id),
  sales_staff_id BIGINT,
  created_at TIMESTAMP NOT NULL DEFAULT NOW(),
  status VARCHAR(20) NOT NULL -- OPEN, SERVING, PENDING_PAYMENT, PAID
);

CREATE TABLE order_items (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  order_id BIGINT NOT NULL REFERENCES orders(id) ON DELETE CASCADE,
  dish_id BIGINT REFERENCES dishes(id),
  quantity INT NOT NULL,
  unit_price DECIMAL(12,2) NOT NULL,
  amount DECIMAL(12,2) NOT NULL
);

-- Thanh toán & hóa đơn
CREATE TABLE payments (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  order_id BIGINT NOT NULL REFERENCES orders(id) ON DELETE CASCADE,
  method VARCHAR(20) NOT NULL, -- CASH, CARD, TRANSFER
  paid_amount DECIMAL(12,2) NOT NULL,
  paid_at TIMESTAMP NOT NULL DEFAULT NOW(),
  status VARCHAR(20) NOT NULL -- SUCCESS, FAILED
);

CREATE TABLE invoices (
  id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  order_id BIGINT NOT NULL UNIQUE REFERENCES orders(id) ON DELETE CASCADE,
  number VARCHAR(50) UNIQUE NOT NULL,
  total_amount DECIMAL(12,2) NOT NULL,
  tax_amount DECIMAL(12,2) DEFAULT 0,
  discount_amount DECIMAL(12,2) DEFAULT 0,
  grand_total DECIMAL(12,2) NOT NULL,
  issued_at TIMESTAMP NOT NULL DEFAULT NOW()
);
```

Gợi ý thêm các bảng Ingredient/Supplier/Inventory nếu triển khai đủ nghiệp vụ kho.

### 4.b) Khung mã Java (POJO + Service Interface)

```java
// Domain
public class Dish {
  private Long id;
  private String code;
  private String name;
  private String description;
  private BigDecimal price;
  private boolean active;
  private String imageUrl;
  // getters/setters
}

public class OrderItem {
  private Long id;
  private Long orderId;
  private Long dishId;
  private int quantity;
  private BigDecimal unitPrice;
  private BigDecimal amount; // quantity * unitPrice
  // getters/setters
}

public class Order {
  private Long id;
  private Long tableId;
  private Long customerId;
  private Long salesStaffId;
  private Instant createdAt;
  private String status; // OPEN, PENDING_PAYMENT, PAID
  private List<OrderItem> items;
  // getters/setters
}

public class Payment {
  private Long id;
  private Long orderId;
  private String method; // CASH/CARD/TRANSFER
  private BigDecimal paidAmount;
  private Instant paidAt;
  private String status; // SUCCESS/FAILED
  // getters/setters
}

// Repository (DAO) – giả lập interface
public interface DishRepository {
  List<Dish> findByNameContains(String keyword);
  Optional<Dish> findById(Long id);
}

public interface OrderRepository {
  Optional<Order> findOpenOrderByTableKeyword(String keyword);
  void updateStatus(Long orderId, String status);
}

public interface PaymentRepository {
  Payment save(Payment p);
}

// Service
public interface DishService {
  List<Dish> search(String keyword);
  Dish getDetail(Long id);
}

public interface OrderService {
  Optional<Order> findOpenOrder(String tableKeyword);
  void markPaid(Long orderId);
}

public interface PaymentService {
  Payment pay(Long orderId, String method, BigDecimal amount);
}

// Giải thích ngắn gọn phương thức:
// - DishService.search: kiểm tra keyword rỗng → trả về danh sách rỗng; ngược lại gọi Repo để tìm.
// - DishService.getDetail: kiểm tra id hợp lệ → lấy món ăn; nếu không tồn tại → ném NotFound.
// - OrderService.findOpenOrder: tìm order ở trạng thái OPEN/PENDING_PAYMENT theo bàn.
// - OrderService.markPaid: cập nhật trạng thái order và bàn về TRỐNG.
// - PaymentService.pay: tạo Payment, lưu Repo, gọi OrderService.markPaid, sinh Invoice (qua InvoiceService nếu có).
```

---

## Câu 5. Biểu đồ gói và triển khai

### 5.a) Package diagram (Mermaid)
[Chèn hình PlantUML: vp_import/package_diagram.puml]

Khuyến nghị cấu trúc gói:
- `com.restman.controller`
- `com.restman.service`
- `com.restman.repository`
- `com.restman.model` (domain)
- `com.restman.dto`
- `com.restman.config`

### 5.b) Deployment diagram – kiến trúc 3 tầng J2EE
[Chèn hình PlantUML: vp_import/deployment_diagram.puml]

---

## Phụ lục – Quy tắc tính tiền cơ bản
- Thành tiền dòng = quantity × unit_price.
- Tổng tiền = sum(thành tiền) – chiết khấu + thuế.
- Cho phép tách/ghép hóa đơn bằng cách tạo nhiều `Payment` gắn cùng `order_id` và khóa cứng một `Invoice` duy nhất khi hoàn tất.

---

Tài liệu kết thúc. Bạn có thể mở trực tiếp file này để xem sơ đồ Mermaid; nếu IDE không render, hãy dùng các công cụ hỗ trợ Mermaid để xuất hình ảnh khi cần.
