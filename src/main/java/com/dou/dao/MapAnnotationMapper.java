package com.dou.dao;

import java.util.List;

import com.dou.domain.MapAnnotation;

public interface MapAnnotationMapper {
	
	
	
	List<MapAnnotation> getAnnotations(String code);
	
	
}
