package com.medici.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(indexName = "stackoverflow", type = "storepoint")
public class StackOverFlow {

	@Id
	private String id;

	private String message;

	private String level;

	private String user;

	private String job;

	private String tag;

	private String answer;

	private String question;

	private Integer reputation;

	private Integer badge;

	private Integer privilegde;
}
