# Tài liệu Thiết kế Hệ thống RestMan

## 1. Tổng quan hệ thống

### 1.1 Mô tả hệ thống
Hệ thống quản lý nhà hàng RestMan được thiết kế để phục vụ các nhu cầu quản lý của nhà hàng, bao gồm:
- Quản lý món ăn và nguyên liệu
- Quản lý khách hàng và đặt bàn
- Xử lý đơn hàng và thanh toán
- Quản lý nhân viên và thống kê

### 1.2 Kiến trúc hệ thống
Hệ thống được thiết kế theo kiến trúc 3 tầng J2EE:
- **Presentation Layer**: JSP/Servlet, REST API
- **Business Logic Layer**: EJB, Business Services
- **Data Access Layer**: JDBC, Repositories

## 2. Phân tích yêu cầu

### 2.1 Actors (Tác nhân)
- **Member (Thành viên)**: Lớp cơ sở cho tất cả người dùng
- **Customer (Khách hàng)**: Kế thừa từ Member
- **Staff (Nhân viên)**: Kế thừa từ Member
- **SalesStaff (Nhân viên bán hàng)**: Kế thừa từ Staff
- **WarehouseStaff (Nhân viên kho)**: Kế thừa từ Staff
- **Manager (Nhân viên quản lý)**: Kế thừa từ Staff

### 2.2 Use Cases chính
1. **Tìm kiếm thông tin món ăn** (Customer)
2. **Xử lý thanh toán** (Sales Staff)
3. **Quản lý món ăn** (Manager)
4. **Quản lý nguyên liệu** (Warehouse Staff)
5. **Đặt bàn và đặt hàng online** (Customer)

## 3. Thiết kế hệ thống

### 3.1 Class Diagram
Hệ thống bao gồm các class chính:
- **Member**: Lớp cơ sở với các thuộc tính cơ bản
- **Customer**: Quản lý thông tin khách hàng
- **Staff**: Quản lý thông tin nhân viên
- **SalesStaff**: Xử lý đơn hàng và thanh toán
- **Dish**: Quản lý thông tin món ăn
- **Order**: Quản lý đơn hàng
- **Invoice**: Quản lý hóa đơn thanh toán

### 3.2 Communication Diagram
Mô tả luồng tương tác giữa các thành phần:
1. **Tìm kiếm món ăn**: Customer → DishSearchSystem → Dish
2. **Xử lý thanh toán**: SalesStaff → PaymentSystem → Order → Invoice

### 3.3 Package Diagram
Cấu trúc package theo kiến trúc 3 tầng:
- **Presentation Layer**: Controllers, DTOs
- **Business Logic Layer**: Services, Business Logic
- **Data Access Layer**: Repositories, Domain Models

### 3.4 Deployment Diagram
Kiến trúc triển khai:
- **Client Tier**: Web Browser, Mobile App
- **Web Tier**: Apache Tomcat, JSP/Servlet
- **Business Tier**: EJB Container, Session Beans
- **Data Tier**: Database Server, JDBC

## 4. Mã nguồn Java

### 4.1 Cấu trúc package
```
com.restman.model/
├── Member.java          # Lớp cơ sở
├── Customer.java        # Lớp khách hàng
├── Staff.java          # Lớp nhân viên cơ sở
└── SalesStaff.java     # Lớp nhân viên bán hàng
```

### 4.2 Các phương thức chính
- **Member**: login(), logout(), changePassword()
- **Customer**: searchDish(), reserveTable(), orderOnline()
- **SalesStaff**: receiveCustomer(), takeOrder(), processPayment()

### 4.3 Demo và Testing
File `RestManDemo.java` chứa các ví dụ demo cho:
- Chức năng tìm kiếm món ăn
- Chức năng xử lý thanh toán
- Các chức năng quản lý khác

## 5. Biểu đồ UML

### 5.1 Use Case Diagrams
- **Tổng quan**: Mô tả tất cả actors và use cases
- **Chi tiết tìm kiếm món ăn**: Luồng tìm kiếm của khách hàng
- **Chi tiết xử lý thanh toán**: Luồng thanh toán của nhân viên

### 5.2 Class Diagrams
- **Phân tích**: Các entity classes và relationships
- **Thiết kế**: Design classes với DTOs và Services

### 5.3 Communication Diagrams
Mô tả tương tác giữa các objects trong 2 use cases chính

### 5.4 Package Diagrams
Cấu trúc package theo kiến trúc 3 tầng

### 5.5 Deployment Diagrams
Kiến trúc triển khai J2EE

## 6. Hướng dẫn sử dụng

### 6.1 Chạy demo
```bash
cd src/test
javac RestManDemo.java
java RestManDemo
```

### 6.2 Xem biểu đồ UML
Sử dụng PlantUML để xem các file .puml trong thư mục `diagrams/`

### 6.3 Yêu cầu hệ thống
- Java 8+
- PlantUML (để xem biểu đồ)
- IDE hỗ trợ Java

## 7. Kết luận

Hệ thống RestMan đã được thiết kế đầy đủ theo yêu cầu đề bài với:
- Biểu đồ use case tổng quan và chi tiết
- Biểu đồ class phân tích và thiết kế
- Biểu đồ communication cho 2 use cases chính
- Biểu đồ package và deployment
- Mã Java hoàn chỉnh với các class chính
- Demo và testing

Hệ thống tuân thủ các nguyên tắc thiết kế OOP và kiến trúc 3 tầng J2EE, đáp ứng đầy đủ yêu cầu của đề bài số 20 về hệ thống quản lý nhà hàng.
