package com.edison.Springbootlibrary.dao;


import com.edison.Springbootlibrary.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long>{
    Payment findByUserEmail(String userEmail);
}
