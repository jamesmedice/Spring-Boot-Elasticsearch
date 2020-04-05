package com.medici.app.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.app.model.StackOverFlow;

@RepositoryRestResource
public interface StackOverFlowRepository extends ElasticsearchRepository<StackOverFlow, String> {

}
