package com.example.AdminPage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AdminPage.model.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}
