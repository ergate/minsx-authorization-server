package com.minsx.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsx.authorization.entity.Role;

/**
 * RoleRepository
 * Created by Joker on 2017/8/30.
 */
public interface RoleRepository extends JpaRepository<Role,Integer>{

}