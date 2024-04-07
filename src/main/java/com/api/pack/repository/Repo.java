package com.api.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.pack.model.Model;

public interface Repo extends JpaRepository<Model,Integer> {

}
