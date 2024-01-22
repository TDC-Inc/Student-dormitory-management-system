package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "repair_requests")
public class RepairRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "issue_description")
    private String issueDescription;

    private String status;

    @Column(name = "approved_by")
    private String approvedBy;

    private Integer rating;

    private String comment;

    public RepairRequest() {
        // 默认构造方法
    }

    public RepairRequest(String studentId, String issueDescription, String status, String approvedBy, Integer rating, String comment) {
        this.studentId = studentId;
        this.issueDescription = issueDescription;
        this.status = status;
        this.approvedBy = approvedBy;
        this.rating = rating;
        this.comment = comment;
    }

    // Getter和Setter方法（根据需要添加）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
