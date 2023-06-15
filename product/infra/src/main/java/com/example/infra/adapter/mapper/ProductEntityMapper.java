package com.example.infra.adapter.mapper;

import com.example.infra.adapter.outbound.integration.repository.jpa.entities.ProductEntity;
import com.example.product.domain.aggregateroots.ReturnProductDomainEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {
	ProductEntity toEntity(ReturnProductDomainEntity productDomainEntity);
	ReturnProductDomainEntity toAggregateRoot(ProductEntity productEntity);
}
