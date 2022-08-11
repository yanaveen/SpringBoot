package com.naveen.Department.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naveen.Department.entity.Department;
import com.naveen.Department.vo.RequestTemplate;

@Service
public interface DepartmentService {
	Department add(Department dept);
	List<Department> list();
	Department update(long id,String name);
	Department searchById(long id);
	List<RequestTemplate> listWithEmp();
	RequestTemplate specificDeptEmployee(long dept_id);

}
