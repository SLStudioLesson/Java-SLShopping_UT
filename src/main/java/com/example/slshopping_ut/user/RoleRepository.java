package com.example.slshopping_ut.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.slshopping_ut.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
