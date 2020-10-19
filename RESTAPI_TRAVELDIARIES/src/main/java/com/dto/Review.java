package com.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement

public class Review {
	
	
	@Id
	@GeneratedValue
	private int reviewId;
	
	private String reviewContent;
	private Date reviewDate;
	private String reviewerName;
	
	/*@OneToOne(mappedBy="travellerId")
	private Traveller traveller;
	*/
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getReviewId() {
		return reviewId;
	}


	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}


	public String getReviewerName() {
		return reviewerName;
	}


	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}


	/*public Traveller getTraveller() {
		return traveller;
	}


	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	*/


	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	

}
