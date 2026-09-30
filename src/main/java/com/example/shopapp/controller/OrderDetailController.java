package com.example.shopapp.controller;

import com.example.shopapp.dtos.OrderDTO;
import com.example.shopapp.dtos.OrderDetailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/order_detail")
public class OrderDetailController {
    @PostMapping("")
    public ResponseEntity<?> createOrderDetail(@Valid @RequestBody OrderDetailDTO newOrderDetail) {
        return ResponseEntity.ok("create orderDetail");

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderDetail(@Valid @PathVariable("id") Long id) {
        return ResponseEntity.ok("get OrderDetail by Id: " + id);

    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<?> getOrderDetailByID(@Valid @PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok("get Order by Order Id: " + orderId);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrderDetail(
            @Valid @PathVariable long id,
            @Valid @RequestBody OrderDetailDTO newOrderDetailData) {
        return ResponseEntity.ok("update order detail with id" + id + " = " + newOrderDetailData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrderDetail(@Valid @PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
