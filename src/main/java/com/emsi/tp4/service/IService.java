package com.emsi.tp4.service;

import java.util.List;
import com.emsi.tp4.domaine.EmpVo;

public interface IService
{
	List<EmpVo> getEmployees(); 
	void save(EmpVo emp);
	EmpVo getEmpById(Long id);
	void delete(Long id);
	List<EmpVo> findBySalary(Double salary);
	List<EmpVo> findByFonction(String designation);
	List<EmpVo> findBySalaryAndFonction(Double salary, String fonction);
	EmpVo getEmpHavaingMaxSalary();
	//Pour la pagination
	List<EmpVo> findAll(int pageId, int size);
	//pour le tri
	List<EmpVo> sortBy(String fieldName);
} 


