package com.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ovs.bean.Elections;

public interface ElectionsRepo extends JpaRepository<Elections,Long> {

}
