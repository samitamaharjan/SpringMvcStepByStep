package com.in28minutes.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FileManager<T> {
	public List<T> findAll();
	public T findByPrimaryKey(String id);
	public void insert(T t);
	public void clean();
	public void delete(String id);
	public void edit(T t);
	public boolean exists(String id);
	public void print();
}