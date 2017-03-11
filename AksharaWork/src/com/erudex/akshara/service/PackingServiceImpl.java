package com.erudex.akshara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.erudex.akshara.dao.PackingDao;
import com.erudex.akshara.model.Packing;

@Service("packingService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class PackingServiceImpl implements PackingService {

	@Autowired
	private PackingDao packingDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addPacking(Packing packing) {
		packingDao.addPacking(packing);
	}

	@Override
	public List<Packing> listPacking() {
		return packingDao.listPacking();
	}

	@Override
	public Packing getPacking(int packing_id) {
		return packingDao.getPacking(packing_id);
	}

	@Override
	public void deletePacking(int packing_id) {
		packingDao.deletePacking(packing_id);
	}

}
