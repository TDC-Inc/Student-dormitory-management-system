package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.RepairRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @version: java version 21
 * @Author: BingBingBao
 * @description:
 * @date: 2024-01-10 18:06
 */
// StudentController.java
@RestController
@RequestMapping("/api/student")
public class StudentController {

    private List<RepairRequest> repairRequests = new ArrayList<>();

    @PostMapping("/submit-request")
    public ResponseEntity<RepairRequest> submitRepairRequest(@RequestBody RepairRequest request) {
        // 学生提交报修请求逻辑
        request.setId((long) (repairRequests.size() + 1));
        request.setStatus("Pending");
        repairRequests.add(request);
        return new ResponseEntity<>(request, HttpStatus.CREATED);
    }

    @GetMapping("/get-requests")
    public ResponseEntity<List<RepairRequest>> getRepairRequests() {
        // 学生获取报修请求列表逻辑
        return new ResponseEntity<>(repairRequests, HttpStatus.OK);
    }
}
