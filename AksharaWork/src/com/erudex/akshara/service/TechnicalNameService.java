package com.erudex.akshara.service;

import java.util.List;

import com.erudex.akshara.model.TechnicalName;

public interface TechnicalNameService {
	public void addTechnicalName(TechnicalName technicalName);
	public List<TechnicalName> listTechnicalNames();
	public TechnicalName getTechnicalName(int technical_id);
	public void deleteTechnicalName(int technical_id);
}