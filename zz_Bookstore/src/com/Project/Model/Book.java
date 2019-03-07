package com.Project.Model;

public class Book 
{
	private int id;
	private String title, author;
	private float price;
	
	public Book() {
		super();
	}
 
    public Book(int id) {
        this.id = id;
    }
    
    public Book(int id, String title, String author, float price) {
        this(title, author, price);
        this.id = id;
    }
	
	public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	
}
