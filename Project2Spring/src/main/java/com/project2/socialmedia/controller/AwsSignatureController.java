package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.HttpMethod;
import com.project2.socialmedia.utiles.S3FileUtil;

@RestController
public class AwsSignatureController {

	@Autowired
	private S3FileUtil s3Util;

	@CrossOrigin
	@PutMapping("/s3/{fileName}")
	public String createSignedPutUrl(@PathVariable String fileName) {
		// we would probably want a service layer where would go provide additional
		// logic to restrict who can get signed urls based off the filename
		return s3Util.createSignedUrl(fileName, HttpMethod.PUT);
	}

	@CrossOrigin
	@GetMapping("/s3/{fileName}")
	public String createSignedGetUrl(@PathVariable String fileName) {
		// we would probably want a service layer where would go provide additional
		// logic to restrict who can get signed urls based off the filename
		return s3Util.createSignedUrl(fileName, HttpMethod.GET);
	}
	
	@CrossOrigin
	@PostMapping("/s3/{fileName}")
	public String createSignedPostUrl(@PathVariable String fileName) {
		// we would probably want a service layer where would go provide additional
		// logic to restrict who can get signed urls based off the filename
		return s3Util.createSignedUrl(fileName, HttpMethod.GET);
	}

}
