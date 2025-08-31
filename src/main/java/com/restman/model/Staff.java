package com.restman.model;

import java.util.Date;

/**
 * Class Staff - Lớp nhân viên cơ sở kế thừa từ Member
 * 
 * @author RestMan Team
 * @version 1.0
 */
public abstract class Staff extends Member {
    // Private attributes
    private String position;
    private Date hireDate;
    private double salary;

    // Constructors
    public Staff() {
        super();
    }

    public Staff(int id, String username, String password, String fullName,
            String address, Date birthDate, String email, String phone,
            String position, Date hireDate, double salary) {
        super(id, username, password, fullName, address, birthDate, email, phone);
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    // Public methods
    /**
     * Xem thông tin cá nhân
     */
    public void viewProfile() {
        System.out.println("=== THÔNG TIN NHÂN VIÊN ===");
        System.out.println("Họ tên: " + getFullName());
        System.out.println("Vị trí: " + position);
        System.out.println("Ngày vào làm: " + hireDate);
        System.out.println("Lương: " + salary + " VND");
        System.out.println("Email: " + getEmail());
        System.out.println("Số điện thoại: " + getPhone());
    }

    /**
     * Cập nhật thông tin cá nhân
     * 
     * @param newAddress Địa chỉ mới
     * @param newEmail   Email mới
     * @param newPhone   Số điện thoại mới
     */
    public void updateProfile(String newAddress, String newEmail, String newPhone) {
        setAddress(newAddress);
        setEmail(newEmail);
        setPhone(newPhone);
        System.out.println("Cập nhật thông tin cá nhân thành công!");
    }

    /**
     * Xem lịch làm việc
     * 
     * @param date Ngày cần xem
     */
    public void viewSchedule(Date date) {
        System.out.println("Lịch làm việc ngày " + date + " của " + getFullName());
        System.out.println("Vị trí: " + position);
        System.out.println("Giờ làm việc: 8:00 - 17:00");
        System.out.println("Nghỉ trưa: 12:00 - 13:00");
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "position='" + position + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", " + super.toString() +
                '}';
    }
}
