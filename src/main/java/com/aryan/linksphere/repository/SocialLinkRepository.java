package com.aryan.linksphere.repository;

import com.aryan.linksphere.models.SocialLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialLinkRepository extends JpaRepository<SocialLink,Long> {
}
