package Activity_21;

import java.sql.Timestamp;

public class Student {
    private String name;
    private String mssv;
    private String password;
    private String phone;
    private String address;
    private int age;
    private String email;
    private Timestamp create_timestamp;
    private Timestamp last_update_timestamp;

    public Student(String name, String mssv, String password, String phone, String address, int age, String email, Timestamp create_timestamp, Timestamp last_update_timestamp) {
        this.name = name;
        this.mssv = mssv;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.email = email;
        this.create_timestamp = create_timestamp;
        this.last_update_timestamp = last_update_timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreate_timestamp() {
        return create_timestamp;
    }

    public void setCreate_timestamp(Timestamp create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public Timestamp getLast_update_timestamp() {
        return last_update_timestamp;
    }

    public void setLast_update_timestamp(Timestamp last_update_timestamp) {
        this.last_update_timestamp = last_update_timestamp;
    }
}
