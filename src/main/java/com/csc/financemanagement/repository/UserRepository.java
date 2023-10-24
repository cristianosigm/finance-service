package com.csc.financemanagement.repository;

import com.csc.financemanagement.entity.CmsUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CmsUser, Long> {

    Optional<CmsUser> findByUsername(String username);

}
