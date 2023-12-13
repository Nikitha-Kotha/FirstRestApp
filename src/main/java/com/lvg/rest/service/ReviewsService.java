package com.lvg.rest.service;
 
import jakarta.persistence.Column;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import com.lvg.rest.dto.Product;
@Entity
public class ReviewsService {
	@Id
	@Column(name="rev_id")
	private int reviewId;
    @Column(name="prod_id")
	private int productId;
	@Column(name="rating")
	private int productRating;
	@Column(name="rev_desc")
	private String reviewDescription;
	@Transient
	Product product;
	public Product getProduct() {
		return product;
	}
 
	public void setProduct(Product product) {
		this.product = product;
	}
 
	public ReviewsService(int reviewId, int productId, int productRating, String reviewDescription) {
		super();
		this.reviewId = reviewId;
		this.productId = productId;
		this.productRating = productRating;
		this.reviewDescription = reviewDescription;
	}
	public ReviewsService()
	{
	}
	public int getReviewId() {
		return reviewId;
	}
 
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
 
	public int getProductId() {
		return productId;
	}
 
	public void setProductId(int productId) {
		this.productId = productId;
	}
 
	public int getProductRating() {
		return productRating;
	}
 
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
 
	public String getReviewDescription() {
		return reviewDescription;
	}
 
	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}
 
 
}
