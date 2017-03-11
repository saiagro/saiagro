package com.erudex.akshara.dao;

import java.util.List;

import com.erudex.akshara.model.TechnicalName;

public interface TechnicalNameDao {
	public void addTechnicalName(TechnicalName technicalName);
	public List<TechnicalName> listTechnicalName();
	public TechnicalName getTechnicalName(int technical_id);
	public void delteTechnical(int technical_id);
}
