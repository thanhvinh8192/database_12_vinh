package Activity_21;

import java.sql.Timestamp;

public class Classroom {
    private String name;
    private String major;
    private int total_student;
    private String teacher_name;
    private String teacher_phone;
    private Timestamp create_timestamp;
    private Timestamp last_update_timestamp;

    public Classroom(String name, String major, int total_student, String teacher_name, String teacher_phone, Timestamp create_timestamp, Timestamp last_update_timestamp) {
        this.name = name;
        this.major = major;
        this.total_student = total_student;
        this.teacher_name = teacher_name;
        this.teacher_phone = teacher_phone;
        this.create_timestamp = create_timestamp;
        this.last_update_timestamp = last_update_timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTotal_student() {
        return total_student;
    }

    public void setTotal_student(int total_student) {
        this.total_student = total_student;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_phone() {
        return teacher_phone;
    }

    public void setTeacher_phone(String teacher_phone) {
        this.teacher_phone = teacher_phone;
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
