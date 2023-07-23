package com.Sarvesh.HibernateSB.Service;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Sarvesh.HibernateSB.Models.CreateEmployeeRequest;
import com.Sarvesh.HibernateSB.Models.CreateEmployeeResponse;
import com.Sarvesh.HibernateSB.Models.DeleteEmployeeResponse;
import com.Sarvesh.HibernateSB.entity.Address;
import com.Sarvesh.HibernateSB.entity.Employee;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service

public class EmployeeService {
	Configuration cfg;
	SessionFactory sf;
	
	public EmployeeService() {
		cfg = new Configuration();
		sf = cfg.configure("hbm-annotation.cfg.xml").buildSessionFactory();
	}
	
	public CreateEmployeeResponse createEmployee(CreateEmployeeRequest employee) {
		Session session = sf.openSession();
		CreateEmployeeResponse empRes = null;
		Transaction tx;
		if(employee.getFirstName()==null ||employee.getFirstName().equals("null") ) {
			empRes = new CreateEmployeeResponse(0, employee.getFirstName(), employee.getLastName(), employee.getAddress(), 301,"First Name cannot be Null");
			return empRes;
		}
		try {
			tx= session.beginTransaction();
			Address address = new Address(employee.getAddress());
	        session.save(address);
			Employee e = new Employee(0,employee.getFirstName(), employee.getLastName(),employee.getAddress());
			session.save(e);
			session.flush();
			tx.commit();
			empRes = new CreateEmployeeResponse(e.getId(), e.getFirstName(), e.getLastName(), e.getAddress(), 200, "Employee Created Successfully");
			
		}
		catch(Exception e){
			e.printStackTrace();
			empRes = new CreateEmployeeResponse(0, employee.getFirstName(), employee.getLastName(), employee.getAddress(), 300, e.getMessage());

		}
		finally {
			session.close();
		}
		
		return empRes;
	}
	
	public DeleteEmployeeResponse delete(int id) {
		Session session = sf.openSession();
		DeleteEmployeeResponse emp = null;
		Transaction tx;
		try {
			tx= session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			session.delete(employee);
			emp = new DeleteEmployeeResponse(id, null, null, null, 100, "Deleted succesfully");
			session.flush();
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			emp = new DeleteEmployeeResponse(id, null, null, null, 303, "Error,Deletion failed");
		}
		finally {
			session.close();
		}
		return emp;
	}
	
	public List<Employee> getAllEmployees(){
		Session session = sf.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cqEmp = cb.createQuery(Employee.class);
		Root<Employee> rootEntry = cqEmp.from(Employee.class);
		CriteriaQuery<Employee> all = cqEmp.select(rootEntry);
		TypedQuery<Employee> getAllEmployeeQuery = session.createQuery(all);
		List<Employee> allEmployees = getAllEmployeeQuery.getResultList();
		session.close();
		return allEmployees;
			
	}
	
	
	public Employee getEmployeeById(int employeeId) {
		Session session = sf.openSession();
		Transaction tx= null;
		Employee emp = null;
		try {
			tx = session.beginTransaction();
			emp= session.get(Employee.class, employeeId);
			emp = new Employee(emp.getId(), emp.getFirstName(),emp.getLastName(), emp.getAddress());
			tx.commit();
			return emp;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			session.close();
		}
		
		return emp;
	}

}
