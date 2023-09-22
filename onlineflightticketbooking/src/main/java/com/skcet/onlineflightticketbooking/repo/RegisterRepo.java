package com.skcet.onlineflightticketbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.onlineflightticketbooking.model.Register;

public interface RegisterRepo extends JpaRepository<Register, String> {

}
