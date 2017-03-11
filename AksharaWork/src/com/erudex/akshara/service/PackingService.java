package com.erudex.akshara.service;

import java.util.List;

import com.erudex.akshara.model.Packing;

public interface PackingService {
	public void addPacking(Packing packing);
	public List<Packing> listPacking();
    public Packing getPacking(int packing_id);
    public void deletePacking(int packing_id);
}
