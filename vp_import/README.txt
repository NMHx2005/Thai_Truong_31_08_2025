Visual Paradigm Import Pack for RestMan (Đề số 20)

Hướng dẫn nhanh:
1) Tạo project mới trong VP.
2) Với CSV: File -> Import -> CSV... -> Chọn file tương ứng -> Map cột theo gợi ý trong dòng đầu.
3) Với DDL: Tools -> Database -> Reverse DDL -> chọn file .sql -> Finish.
4) Kéo các element từ Model Explorer vào diagram, dùng Arrange -> Layout để tự căn chỉnh.

Danh sách file:
- usecase_overview.csv
- usecase_search_dish_detail.csv
- usecase_receive_payment_detail.csv
- class_analysis.csv
- class_design.csv
- package_diagram.csv
- deployment_diagram.csv
- erd_schema_full.sql

Ghi chú:
- Mỗi CSV có cột ModelType + các cột phụ thuộc loại. VP sẽ nhận dạng dựa vào ModelType.
- Sau khi import use case, mở Use Case Diagram mới rồi kéo Actor/UseCase/Association từ Model Explorer.
- Sequence/Communication nên sinh tự động từ Scenario hoặc dựng bằng PlantUML/hand nếu cần tinh chỉnh.
