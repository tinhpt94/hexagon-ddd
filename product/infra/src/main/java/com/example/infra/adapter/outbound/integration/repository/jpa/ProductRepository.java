package com.example.infra.adapter.outbound.integration.repository.jpa;

import com.example.infra.adapter.outbound.integration.repository.jpa.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {
	List<ProductEntity> findByCatalogId(@Param("catalogId") String catalogId);
}
