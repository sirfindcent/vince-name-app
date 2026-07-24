package com.vince.backend.repository;

import com.vince.backend.model.NameEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<NameEntry, Long> { // Parameter is the name of the Entity and the exact data type of its primary key

}
