# Hệ thống Quản lý Nhà hàng RestMan

## Mô tả dự án
Hệ thống quản lý nhà hàng RestMan được thiết kế để phục vụ các nhu cầu quản lý của nhà hàng, bao gồm quản lý món ăn, nguyên liệu, khách hàng, nhà cung cấp, đặt bàn và thanh toán.

## Các actor chính
- **Manager (Nhân viên quản lý)**: Xem thống kê, quản lý món ăn, tạo combo menu
- **Warehouse staff (Nhân viên kho)**: Nhập nguyên liệu từ nhà cung cấp, quản lý thông tin nhà cung cấp
- **Sales staff (Nhân viên bán hàng)**: Tiếp nhận khách hàng, nhận đơn hàng, xử lý thanh toán, tạo thẻ thành viên
- **Customer (Khách hàng)**: Tìm kiếm món ăn, đặt bàn, đặt hàng online

## Chức năng chính
1. **Tìm kiếm thông tin món ăn** (Customer)
2. **Xử lý thanh toán** (Sales staff)

## Cấu trúc dự án
- `diagrams/` - Chứa các biểu đồ UML
- `src/` - Mã nguồn Java
- `docs/` - Tài liệu thiết kế

## Yêu cầu hệ thống
- Java 8+
- PlantUML (để xem biểu đồ)
- IDE hỗ trợ Java (Eclipse, IntelliJ IDEA, VS Code)
