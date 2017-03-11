package com.erudex.akshara.service;

import java.util.List;

import com.erudex.akshara.model.Catagory;

public interface CatagoryService {
	public void addCatagory(Catagory catagory);
	public List<Catagory> listCatagory();
	public Catagory getCatagory(int catagory_id);
	public void deleteCatagory(int catagory_id);
}
