package com.cambista.dao;

import com.cambista.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatesDao extends JpaRepository<Response, Long> {
}
