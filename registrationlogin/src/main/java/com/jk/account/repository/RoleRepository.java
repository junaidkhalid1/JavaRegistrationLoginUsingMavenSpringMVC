package com.jk.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jk.account.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
