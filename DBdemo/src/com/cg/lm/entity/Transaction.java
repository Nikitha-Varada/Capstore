package com.cg.lm.entity;
import java.sql.*;
public class Transaction
{
	int tid;
	Book book;
	Student student;
	Date issuedate;
	Date duedate;
	Date returndate;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public Transaction() {
	}
	public Transaction(int tid, Book book, Student student, Date issuedate, Date duedate, Date returndate) {
		super();
		this.tid = tid;
		this.book = book;
		this.student = student;
		this.issuedate = issuedate;
		this.duedate = duedate;
		this.returndate = returndate;
	}
	
	

}
