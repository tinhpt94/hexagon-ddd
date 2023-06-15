package com.example.infra.adapter.inbound.restful.controller;

import com.example.application.ports.inbound.commandservices.ReturnProductCommandInboundPort;
import com.example.application.ports.outbound.repository.persistence.ReturnProductRepositoryOutboundPort;
import com.example.product.domain.aggregateroots.ReturnProductDomainEntity;
import com.example.product.domain.commands.CreateProductCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	@Autowired
	private ReturnProductRepositoryOutboundPort returnProductRepositoryOutboundPort;

	@PostMapping
	public ResponseEntity<ReturnProductDomainEntity> createProduct(@RequestBody CreateProductCommand createProductCommand) {
		ReturnProductCommandInboundPort returnProductCommandInboundPort = new ReturnProductCommandInboundPort(returnProductRepositoryOutboundPort);
		return new ResponseEntity<>(returnProductCommandInboundPort.createAndReturnProduct(createProductCommand), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<ReturnProductDomainEntity>> getProducts(@RequestParam("catalogId") String catalogId) {
		ReturnProductCommandInboundPort returnProductCommandInboundPort = new ReturnProductCommandInboundPort(returnProductRepositoryOutboundPort);
		return ResponseEntity.ok(returnProductCommandInboundPort.getProducts(catalogId));
	}
}
