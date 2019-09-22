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
/**
 * This class connect to S3.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@RestController
public class AwsSignatureController {

	@Autowired
	private S3FileUtil s3Util;
	/**
	 * we would probably want a service layer where would go provide additional
	 * logic to restrict who can get signed urls based off the filename
	 * @param fileName
	 * @return String
	 */
	@CrossOrigin
	@PutMapping("/s3/{fileName}")
	public String createSignedPutUrl(@PathVariable String fileName) {
		return s3Util.createSignedUrl(fileName, HttpMethod.PUT);
	}
	/**
	 * we would probably want a service layer where would go provide additional
	 * logic to restrict who can get signed urls based off the filename
	 * @param fileName
	 * @return string
	 */
	@CrossOrigin
	@GetMapping("/s3/{fileName}")
	public String createSignedGetUrl(@PathVariable String fileName) {
		// we would probably want a service layer where would go provide additional
		// logic to restrict who can get signed urls based off the filename
		return s3Util.createSignedUrl(fileName, HttpMethod.GET);
	}
	/**
	 * we would probably want a service layer where would go provide additional
	 * logic to restrict who can get signed urls based off the filename
	 * @param fileName
	 * @return String
	 */
	@CrossOrigin
	@PostMapping("/s3/{fileName}")
	public String createSignedPostUrl(@PathVariable String fileName) {
		// we would probably want a service layer where would go provide additional
		// logic to restrict who can get signed urls based off the filename
		return s3Util.createSignedUrl(fileName, HttpMethod.GET);
	}

}
