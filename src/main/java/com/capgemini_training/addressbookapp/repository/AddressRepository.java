package com.capgemini_training.addressbookapp.repository;

import com.capgemini_training.addressbookapp.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer>{
}
