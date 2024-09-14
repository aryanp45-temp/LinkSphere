package com.aryan.linksphere.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomURLRepository extends JpaRepository<CustomURL,Long> {
}
