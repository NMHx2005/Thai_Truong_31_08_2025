package com.restman.model;

import java.util.Date;

/**
 * Class Member - Lớp cơ sở cho tất cả thành viên trong hệ thống
 * 
 * @author RestMan Team
 * @version 1.0
 */
public abstract class Member {
    // Private attributes
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private Date birthDate;
    private String email;
    private String phone;

    // Constructors
    public Member() {
        // Default constructor
    }

    public Member(int id, String username, String password, String fullName,
            String address, Date birthDate, String email, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
    }

    // Public methods
    /**
     * Đăng nhập vào hệ thống
     * 
     * @param username Tên đăng nhập
     * @param password Mật khẩu
     * @return true nếu đăng nhập thành công, false nếu thất bại
     */
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Đăng nhập thành công cho thành viên: " + this.fullName);
            return true;
        }
        System.out.println("Đăng nhập thất bại: Sai tên đăng nhập hoặc mật khẩu");
        return false;
    }

    /**
     * Đăng xuất khỏi hệ thống
     */
    public void logout() {
        System.out.println("Thành viên " + this.fullName + " đã đăng xuất");
    }

    /**
     * Thay đổi mật khẩu
     * 
     * @param oldPassword Mật khẩu cũ
     * @param newPassword Mật khẩu mới
     * @return true nếu thay đổi thành công, false nếu thất bại
     */
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Đổi mật khẩu thành công cho thành viên: " + this.fullName);
            return true;
        }
        System.out.println("Đổi mật khẩu thất bại: Sai mật khẩu cũ");
        return false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
