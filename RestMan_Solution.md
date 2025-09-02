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

## MÔ TẢ HỆ THỐNG BẰNG NGÔN NGỮ TỰ NHIÊN (RestMan)

Tóm tắt các bước thực hiện:
- Bước 1: Giới thiệu mục đích hệ thống
- Bước 2: Phạm vi hệ thống (đối tượng sử dụng và chức năng theo vai trò)
- Bước 3: Mô tả chi tiết hoạt động nghiệp vụ cho từng chức năng chính (kèm ngoại lệ, tiêu chí chấp nhận)
- Bước 4: Các đối tượng được quản lý/xử lý và thuộc tính cốt lõi
- Bước 5: Quan hệ (số lượng) giữa các đối tượng, trạng thái, quy tắc toàn vẹn dữ liệu
- Bước 6: Ma trận phân quyền, yêu cầu phi chức năng (NFR), giả định & ràng buộc

Bước 1 – Mục đích của hệ thống:
- RestMan là ứng dụng web hỗ trợ vận hành nhà hàng theo mô hình phục vụ tại bàn và đặt chỗ/đặt món trực tuyến.
- Mục tiêu chính:
  - Tối ưu hóa quy trình phục vụ: tiếp nhận khách, ghi món nhanh, tính tiền chính xác, in hóa đơn chuyên nghiệp.
  - Quản trị dữ liệu tập trung: món ăn, nguyên liệu, nhà cung cấp, combo, tồn kho.
  - Cung cấp báo cáo/biểu đồ giúp quản lý ra quyết định: doanh thu theo món/khách hàng/NCC, chi phí nguyên liệu, hiệu quả combo.
  - Giảm sai sót tác nghiệp, rút ngắn thời gian chờ của khách, và hỗ trợ mở rộng đa chi nhánh trong tương lai.

Bước 2 – Phạm vi hệ thống (vai trò và chức năng):
- Nhân viên (Staff – mọi vai trò): Đăng nhập/Đăng xuất; đổi mật khẩu; xem thông báo.
- Nhân viên quản lý (Manager):
  - Quản lý danh mục: Món ăn (CRUD, gán hình, gợi ý nguyên liệu), Nguyên liệu (CRUD, đơn vị), Nhà cung cấp (CRUD), Combo (CRUD, gợi ý món bán kèm).
  - Xem thống kê/báo cáo: theo thời gian (ngày/tuần/tháng), theo món, theo khách, theo NCC; lọc xuất CSV/PDF.
  - Thiết lập quy tắc: thuế/chiết khấu mặc định, định dạng số hóa đơn, giới hạn công nợ NCC (nếu bật).
- Nhân viên kho (Warehouse Staff):
  - Tạo phiếu nhập nguyên liệu từ NCC: nhập dòng hàng, SL, đơn giá; đính kèm chứng từ.
  - Duyệt phiếu nhập (nếu phân tách vai trò tạo/duyệt); cập nhật tồn kho theo trạng thái phiếu.
  - Tra cứu lịch sử nhập; xem tồn kho hiện tại; xuất báo cáo nhập theo kỳ.
- Nhân viên bán hàng (Sales Staff):
  - Nhận khách: gán bàn trống phù hợp sức chứa; ghi chú yêu cầu đặc biệt (dị ứng, trẻ nhỏ, sinh nhật...).
  - Ghi order tại bàn: thêm/sửa/xóa dòng món; chọn combo; ghi chú chế biến; tách/gộp món theo khách.
  - Chuyển bàn/gộp bàn: chuyển order giữa bàn; gộp nhiều order trước khi thanh toán.
  - Nhận thanh toán: chọn phương thức (tiền mặt/thẻ/chuyển khoản), tách/ghép hóa đơn, in hóa đơn/biên lai.
- Khách hàng (Customer):
  - Tìm kiếm món: theo từ khóa, loại món, giá; xem chi tiết và gợi ý combo.
  - Đặt bàn/đặt món trực tuyến: chọn thời gian, số khách, ghi chú; (tùy chọn) chọn món trước; nhận xác nhận qua SMS/Email.

Bước 3 – Hoạt động nghiệp vụ chi tiết theo chức năng:

A) Khách hàng tìm kiếm món ăn (Search Dishes)
- Luồng chuẩn (Happy path):
  1) Khách mở trang tìm món → nhập từ khóa → nhấn Tìm.
  2) Hệ thống chuẩn hóa từ khóa (trim, bỏ dấu, lower-case) → truy vấn theo tên/bí danh/từ khóa mô tả.
  3) Kết quả trả về danh sách: ảnh, tên, giá, mô tả ngắn, nhãn (mới/đề xuất/hết hàng).
  4) Khách bấm vào một món → trang chi tiết: mô tả đầy đủ, nguyên liệu chính, giá, hình ảnh, món liên quan, combo gợi ý.
  5) (Nếu đăng nhập) Khách có thể thêm vào danh sách ưa thích hoặc thêm vào giỏ đặt món trước.
- Ngoại lệ/nhánh:
  - Không có kết quả → hiển thị gợi ý từ khóa gần đúng; hiển thị top món bán chạy.
  - Món tạm ngưng bán → hiển thị nhãn và ẩn nút đặt trước.
- Tiêu chí chấp nhận (Acceptance Criteria):
  - Tìm theo không phân biệt hoa/thường có dấu/không dấu; thời gian phản hồi < 1s với 10k món.
  - Trang chi tiết hiển thị đủ 6 trường: tên, mô tả, giá, hình, thành phần chính, trạng thái.

B) Đặt bàn trực tuyến (Reserve Table Online)
- Luồng chuẩn:
  1) Khách mở form đặt bàn → nhập thời gian đến, số người, thông tin liên hệ (tên, điện thoại, email tùy chọn), ghi chú.
  2) Hệ thống kiểm tra slot còn trống (so với số bàn, ca làm) → đề xuất loại bàn phù hợp.
  3) Khách xác nhận → hệ thống tạo `Reservation` trạng thái "PENDING" và gửi mã xác nhận.
  4) Nhân viên/auto rule duyệt → trạng thái "CONFIRMED"; đến giờ, khi khách check-in, chuyển thành mở `Order` tại bàn được gán.
- Ngoại lệ:
  - Trùng giờ vượt sức chứa → đề xuất thời gian khác hoặc ghi vào waitlist.
  - Liên hệ không hợp lệ → báo lỗi, không tạo đặt bàn.
- Tiêu chí chấp nhận:
  - Có mã đặt bàn duy nhất; gửi thông báo SMS/Email (nếu cấu hình).
  - Có thể hủy/sửa trước giờ đến theo chính sách (cập nhật audit log).

C) Ghi order tại bàn (Take Order at Table)
- Luồng chuẩn:
  1) Nhân viên mở order của bàn → tìm món theo từ khóa/danh mục.
  2) Thêm dòng món: số lượng, ghi chú (ít cay, không hành…); nếu chọn combo → tự bung các món con (tuỳ chính sách giá).
  3) Hệ thống tính tiền dòng = SL × đơn giá; tính tổng tạm tính; lưu nháp tức thời (autosave).
  4) Có thể tách món theo khách A/B, chuyển bàn hoặc gộp order khác.
- Ngoại lệ:
  - Món hết hàng (hết nguyên liệu) → cảnh báo trước khi thêm; cho phép thay thế món gợi ý.
  - Đơn giá thay đổi (khuyến mãi/giờ vàng) → hiển thị xác nhận giá mới.

D) Nhận thanh toán tại bàn (Receive Payment)
- Luồng chuẩn:
  1) Mở menu Thanh toán → nhập mã/tên bàn → chọn bàn từ kết quả.
  2) Hệ thống tổng hợp hóa đơn: tất cả dòng món chưa thanh toán, thuế/chiết khấu (nếu có), phụ thu (dịch vụ… nếu cấu hình).
  3) Tùy chọn tách hóa đơn theo khách hoặc theo mục; ghép nhiều order nếu gộp bàn.
  4) Chọn phương thức thanh toán: Tiền mặt/Thẻ/Chuyển khoản (có thể đa phương thức: nhiều payment cho một order).
  5) Xác nhận → sinh `Invoice` (số hóa đơn theo pattern), tạo `Payment`(s), in hóa đơn; cập nhật trạng thái `Order=PAID`, `Table=FREE`.
- Ngoại lệ:
  - Chênh lệch tiền khách đưa/tiền thừa → hiển thị tính toán và yêu cầu xác nhận.
  - Lỗi in hóa đơn → lưu PDF và cho phép in lại, không tạo trùng số hóa đơn.
  - Hủy thanh toán trong ca → rollback payment và invoice nếu chưa khóa ca.
- Tiêu chí chấp nhận:
  - Hóa đơn rõ ràng: số, ngày giờ, bàn, nhân viên, danh sách món, đơn giá, thành tiền, tổng cộng, phương thức.
  - Không cho thanh toán nếu còn dòng món "nháp" chưa chốt.

E) Kho nhập nguyên liệu (Receive Inventory)
- Luồng chuẩn:
  1) Tạo phiếu nhập: chọn NCC → thêm dòng: nguyên liệu, SL, đơn giá.
  2) Lưu nháp → kiểm tra hợp lệ (đơn vị, số âm, tồn kho) → Duyệt → cập nhật tồn kho tức thì.
  3) In phiếu/Export CSV; tra cứu lịch sử nhập theo kỳ và NCC.
- Ngoại lệ:
  - Trùng hóa đơn NCC → cảnh báo/khóa theo số chứng từ.
  - Duyệt không thành công vì chênh lệch kiểm đếm → yêu cầu điều chỉnh/ghi chú.

F) Thống kê/Báo cáo
- Các báo cáo mặc định: Doanh thu theo ngày/tuần/tháng; Top 10 món bán chạy; Top khách hàng; Giá trị nhập theo NCC; Tồn kho dưới ngưỡng.
- Bộ lọc: khoảng thời gian, chi nhánh (nếu đa chi nhánh), nhóm món, kênh bán.
- Xuất CSV/PDF; lưu bộ lọc ưa thích cho người dùng.

Bước 4 – Đối tượng và thuộc tính lõi (bản mở rộng):
- Đã liệt kê trong Bảng từ khóa. Bổ sung một số trường gợi ý triển khai:
  - Dish: category, tags, display_order.
  - Ingredient: reorder_level, barcode.
  - Order: subtotal, discount_amount, tax_amount, service_fee, grand_total.
  - Payment: reference_no (mã giao dịch thẻ/CK), note.
  - Invoice: template_code, qr_text.
  - Reservation: channel (web/app/phone), confirm_code.

Bước 5 – Quan hệ & Trạng thái đối tượng:
- Cardinality (tóm tắt):
  - Customer 1—n Reservation; Table 1—n Reservation; Table 1—n Order; Order 1—n OrderItem; Order 1—0..n Payment; Order 1—0..1 Invoice; Dish n—m Ingredient; Combo n—m Dish; Supplier 1—n InventoryReceipt; InventoryReceipt 1—n InventoryReceiptItem.
- Trạng thái chính:
  - Table: FREE → OCCUPIED → CLEANING → FREE.
  - Order: OPEN → SERVING → PENDING_PAYMENT → PAID → (CANCELED).
  - Reservation: PENDING → CONFIRMED → CHECKED_IN → CANCELED/NO_SHOW.
  - Inventory Receipt: DRAFT → APPROVED → CANCELED.
- Toàn vẹn dữ liệu & quy tắc:
  - Không xóa cứng đối tượng tham chiếu bởi giao dịch; dùng trạng thái/soft-delete.
  - Tổng tiền order = Σ(amount dòng) ± discount + tax + service_fee.
  - Invoice duy nhất cho mỗi order đã thanh toán; Payment có thể nhiều.

Bước 6 – Ma trận phân quyền & NFR:
- Phân quyền (tóm tắt):
  - Manager: full CRUD danh mục; xem mọi báo cáo; duyệt phiếu kho; cấu hình hệ thống.
  - Warehouse: tạo/duyệt phiếu nhập (theo phân công); xem tồn kho; không truy cập thanh toán.
  - Sales: mở/ghi order; chuyển/gộp bàn; tạo payment/invoice; không sửa danh mục.
  - Customer: tìm món; đặt bàn/đặt món; xem lịch sử đặt bàn của chính họ.
- NFR:
  - Hiệu năng: tìm món < 1s (10k món); tạo hóa đơn < 2s.
  - Bảo mật: bắt buộc đăng nhập cho tác vụ nội bộ; phân quyền theo vai trò; log truy cập/ thay đổi quan trọng.
  - Khả dụng: backup hằng ngày; khôi phục dữ liệu ≤ 1 giờ cho sự cố thường gặp.
  - Khả mở rộng: sẵn sàng tách kho dữ liệu/ đa chi nhánh.

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

## VẼ BIỂU ĐỒ USE CASE TỔNG QUAN + MÔ TẢ USE CASE

[Chèn hình PlantUML: vp_import/usecase_overview.puml]

Mô tả các use case (RestMan):
- Đăng nhập: Cho phép mọi tác nhân (Manager, Sales Staff, Warehouse Staff) truy cập hệ thống bằng tài khoản được cấp. Xác thực username/password; khóa tài khoản sau N lần sai; ghi nhật ký đăng nhập.
- Đăng xuất: Cho phép mọi tác nhân thoát khỏi hệ thống an toàn, hủy phiên và cookie, giải phóng khóa ca làm việc (nếu có).
- Quản lý thông tin món ăn: Cho phép nhân viên quản lý thêm/sửa/xóa/ẩn-hiện món; nhập tên, mô tả, giá, hình ảnh, phân loại; gợi ý combo liên quan; kiểm tra trùng mã.
- Quản lý thông tin nguyên liệu: Cho phép nhân viên quản lý thêm/sửa/xóa nguyên liệu; thiết lập đơn vị tính, giá nhập chuẩn, ngưỡng cảnh báo tồn kho; liên kết định mức với món.
- Quản lý thông tin nhà cung cấp: Cho phép nhân viên kho thêm/sửa/xóa nhà cung cấp; lưu thông tin liên hệ, ghi chú chất lượng, xếp hạng NCC; kiểm tra trùng tên/mã số thuế.
- Xem thống kê món ăn: Cho phép quản lý xem báo cáo doanh thu/số lượng theo món, theo thời gian; lọc theo danh mục; xuất CSV/PDF.
- Xem thống kê nguyên liệu: Cho phép quản lý xem lượng nhập/tiêu thụ theo kỳ; cảnh báo tồn kho dưới ngưỡng; chi phí nguyên liệu theo NCC.
- Xem thống kê khách hàng: Cho phép quản lý xem số lượt đến, mức chi tiêu, nhóm khách hàng; top khách theo doanh thu; hành vi đặt bàn.
- Xem thống kê nhà cung cấp: Cho phép quản lý xem giá trị nhập theo NCC, tỷ lệ đúng hạn, đánh giá chất lượng; so sánh NCC theo mặt hàng.
- Tìm kiếm thông tin món ăn: Cho phép khách hàng tra cứu món theo từ khóa/loại/giá; xem chi tiết món, gợi ý combo; hỗ trợ không dấu/viết hoa-thường.
- Đặt bàn trực tuyến: Cho phép khách hàng đặt chỗ theo thời gian và số người; nhận mã xác nhận; cho phép hủy/sửa theo chính sách.
- Đặt món trực tuyến: Cho phép khách hàng chọn món trước khi đến (nếu bật); lưu kèm đặt bàn; hiển thị giá dự kiến.
- Nhận khách tại bàn: Cho phép nhân viên bán hàng tiếp đón, gán bàn trống phù hợp, mở order mới và ghi chú yêu cầu đặc biệt.
- Ghi order tại bàn: Cho phép nhân viên bán hàng thêm/sửa/xóa dòng món, chọn combo, ghi chú chế biến; tách món theo khách; chuyển/gộp bàn.
- Nhận thanh toán: Cho phép nhân viên bán hàng tính tiền hóa đơn, áp dụng thuế/chiết khấu, chọn phương thức thanh toán (tiền mặt/thẻ/chuyển khoản), in hóa đơn; cập nhật Order=PAID, Table=FREE.
- Nhập nguyên liệu từ nhà cung cấp: Cho phép nhân viên kho tạo và duyệt phiếu nhập; thêm dòng nguyên liệu, SL, đơn giá; cập nhật tồn kho khi duyệt; in phiếu.
- Xem thống kê khách hàng theo doanh thu: Cho phép quản lý chọn khoảng thời gian để xem danh sách khách hàng và tổng doanh thu; xem drill-down các hóa đơn theo từng khách.

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

### 1.c) Use Case chi tiết + Mô tả UC cho module “Tìm kiếm thông tin món ăn”

[Chèn hình PlantUML: vp_import/usecase_search_dish_detail.puml]

Phạm vi và mục tiêu
- Phạm vi: Khách hàng (không cần đăng nhập) hoặc đã đăng nhập đều có thể tra cứu.
- Mục tiêu: Tìm và xem chi tiết món phù hợp từ khóa trong thời gian ngắn, không phân biệt hoa/thường/có dấu.

Các Use Case thành phần (đều bị chứa trong UC Search Dishes)
- Search Dishes: Cho phép nhập từ khóa, chọn bộ lọc (loại món, tầm giá), sắp xếp kết quả.
- View Dish List: Hiển thị danh sách món khớp; phân trang; hiển thị ảnh/giá/mô tả ngắn/trạng thái.
- View Dish Detail: Hiển thị chi tiết món; nguyên liệu chính; hình ảnh; gợi ý combo/món liên quan.

Tiền điều kiện
- CSDL có dữ liệu món; kết nối hệ thống hoạt động bình thường.

Hậu điều kiện
- Không bắt buộc thay đổi dữ liệu. Hệ thống ghi log từ khóa tìm kiếm phục vụ gợi ý.

Luồng chính (Happy path)
1) Người dùng mở menu “Tìm món”.
2) Nhập từ khóa vào ô tìm kiếm; có thể chọn thêm bộ lọc: danh mục, tầm giá, trạng thái bán; nhấn Tìm.
3) Hệ thống chuẩn hóa từ khóa (trim/bỏ dấu/lowercase), dựng truy vấn tìm theo tên/bí danh/từ khóa mô tả.
4) Hệ thống trả về danh sách kết quả theo trang (mặc định 20 mục), sắp xếp theo mức độ phù hợp → hiển thị ảnh, tên, giá, mô tả ngắn, nhãn (Mới/Đề xuất/Hết hàng).
5) Người dùng bấm vào một món bất kỳ.
6) Hệ thống hiển thị trang chi tiết món: tên đầy đủ, mô tả, giá bán hiện hành, hình ảnh, nguyên liệu chính, món liên quan, combo gợi ý (nếu có), trạng thái có thể đặt trước hay không.

Ngoại lệ/nhánh
- 3a) Từ khóa rỗng: hệ thống không truy vấn, hiển thị gợi ý từ khóa phổ biến hoặc top món bán chạy.
- 4a) Không có kết quả: hiển thị thông báo “Không tìm thấy” và đề xuất từ khóa gần đúng; nút “Xóa bộ lọc”.
- 6a) Món tạm ngừng bán: hiển thị nhãn “Ngừng bán/Hết” và ẩn nút đặt trước.
- 6b) Giá món đang trong chương trình khuyến mãi: hiển thị giá gạch bỏ + giá khuyến mãi; ghi chú thời gian áp dụng.

Quy tắc nghiệp vụ và kiểm tra hợp lệ
- Bỏ dấu và không phân biệt hoa/thường khi so khớp từ khóa.
- Hỗ trợ tìm gần đúng (LIKE) và gợi ý gần đúng (Levenshtein/Soundex nếu bật).
- Bộ lọc tầm giá phải có min ≤ max; nếu không, hệ thống tự hoán đổi.
- Phân trang: size ∈ [10, 100]; mặc định 20; tối đa 100 để bảo đảm hiệu năng.

Trường dữ liệu và giao diện
- Ô từ khóa: text (1–100 ký tự).
- Bộ lọc: danh mục (dropdown), tầm giá (min/max), trạng thái (đang bán/tạm ngưng), sắp xếp (phù hợp/giá tăng/giá giảm/mới nhất).
- Danh sách: card món gồm ảnh 1:1, tên (tối đa 2 dòng), giá, mô tả ngắn (1 dòng), nhãn trạng thái.
- Trang chi tiết: ảnh lớn, thông tin cơ bản, thành phần chính, gợi ý combo, nút “Thêm vào đặt trước” (nếu bật).

Tiêu chí chấp nhận (Acceptance Criteria)
- Tìm kiếm với 10k món: phản hồi < 1 giây cho câu truy vấn đơn giản (keyword + phân trang mặc định).
- Kết quả hiển thị đúng bộ lọc và thứ tự sắp xếp đã chọn.
- Trang chi tiết luôn hiển thị đủ: tên, mô tả, giá hiện hành, hình, thành phần chính, trạng thái bán.
- Không có lỗi JS/HTTP trong nhật ký trình duyệt cho các thao tác thông thường.

Theo dõi & phân tích (tùy chọn)
- Ghi lại top từ khóa theo ngày; tỷ lệ không có kết quả; CTR từ danh sách sang chi tiết; tỷ lệ chuyển đổi đặt trước.

Bảo mật & quyền
- Mọi người đều có thể tìm và xem chi tiết. Chỉ người có quyền mới đặt trước/giỏ hàng (nếu bật tính năng này).

[Hết mục Use Case chi tiết “Tìm kiếm thông tin món ăn”]

---

### 1.d) Use Case chi tiết + Mô tả UC cho module “Thống kê khách hàng theo doanh thu”

[Chèn hình PlantUML: vp_import/usecase_customer_revenue_stats.puml]

Phạm vi và mục tiêu
- Phạm vi: Dành cho vai trò Manager (hoặc nhân sự được ủy quyền xem báo cáo).
- Mục tiêu: Xem danh sách khách hàng theo tổng doanh thu trong một khoảng thời gian; cho phép drill-down đến lịch sử mua và hóa đơn chi tiết.

Các Use Case thành phần
- View Customer Revenue Statistics: hiển thị bảng xếp hạng khách hàng theo tổng chi tiêu.
- Select Statistic Period: chọn ngày bắt đầu/kết thúc; bộ lọc chi nhánh/nhóm món (nếu có).
- View Customer Purchase History: xem các lần đến/đơn hàng đã thanh toán của một khách trong giai đoạn.
- View Customer’s Detail Invoice: xem hóa đơn cụ thể, danh sách món/đơn giá/thành tiền, chiết khấu/thuế.

Tiền điều kiện
- Người dùng đã đăng nhập với quyền xem báo cáo; dữ liệu hóa đơn hợp lệ trong giai đoạn chọn.

Hậu điều kiện
- Không thay đổi dữ liệu nghiệp vụ; có thể ghi log truy cập báo cáo.

Luồng chính (Happy path)
1) Manager chọn menu “Xem báo cáo” → “Khách hàng theo doanh thu”.
2) Hệ thống hiển thị bộ lọc: thời gian từ/đến (date picker), chi nhánh (nếu có), kênh bán (tại bàn/online), nhóm khách (VIP/thường) – tùy cấu hình.
3) Manager nhấn “Xem thống kê”.
4) Hệ thống tổng hợp dữ liệu đã thanh toán trong giai đoạn → trả bảng danh sách khách hàng gồm: Họ tên, Số điện thoại, Tổng hóa đơn, Tổng doanh thu, Số lần đến; sắp xếp giảm dần theo doanh thu.
5) Manager bấm vào một khách bất kỳ để xem “Lịch sử mua”.
6) Hệ thống hiển thị danh sách các hóa đơn của khách trong giai đoạn: ngày/giờ, bàn, tổng tiền, phương thức; cho phép lọc/ sắp xếp.
7) Manager bấm vào một hóa đơn để xem “Hóa đơn chi tiết”.
8) Hệ thống hiển thị hóa đơn chi tiết: danh sách dòng (dish/combo, quantity, unit_price, amount), subtotal, discount, tax, grand_total.

Ngoại lệ/nhánh
- 2a) Thời gian không hợp lệ (từ > đến) → hệ thống yêu cầu nhập lại.
- 4a) Không có dữ liệu trong giai đoạn → hiển thị “Không có kết quả” và đề xuất giai đoạn khác.
- 8a) Hóa đơn bị khóa lưu trữ ngoại tuyến → chỉ hiển thị bản snapshot/PDF đã lưu.

Quy tắc nghiệp vụ và kiểm tra
- Chỉ tính hóa đơn ở trạng thái PAID; bỏ qua order chưa thanh toán/hủy.
- Đồng tiền hiển thị theo cấu hình cửa hàng; định dạng nghìn/chấm phẩy chuẩn.
- Phân quyền: chỉ người có vai trò Manager (hoặc quyền báo cáo) mới truy cập được màn hình này.

Trường dữ liệu và giao diện
- Bộ lọc: from_date, to_date, branch_id?, channel?, customer_group?.
- Bảng xếp hạng: rank, customer_name, phone, visit_count, revenue_total.
- Lịch sử mua: invoice_no, paid_at, table_code, payment_method, grand_total.
- Hóa đơn chi tiết: danh sách dòng (dish/combo, quantity, unit_price, amount), subtotal, discount, tax, grand_total.

Tiêu chí chấp nhận (Acceptance Criteria)
- Tổng hợp dữ liệu nhanh với 100k hóa đơn trong 30 ngày (< 3s trên môi trường chuẩn cửa hàng đơn).
- Số liệu giữa bảng xếp hạng và tổng chi tiết phải khớp (sai lệch ≤ 0,01 do làm tròn).
- Tất cả số tiền hiển thị đúng định dạng tiền tệ và có ký hiệu đơn vị.

Bảo mật & nhật ký
- Nhật ký truy cập báo cáo gồm: user, thời điểm, khoảng thời gian lọc, tổng bản ghi.
- Không cho tải về dữ liệu khách hàng khi người dùng không có quyền Export.

[Hết mục Use Case chi tiết “Thống kê khách hàng theo doanh thu”]

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