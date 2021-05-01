package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depdao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ====");
		Department dep = depdao.findById(2);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2: department findAll ====");
		List<Department> deps = depdao.findAll();
		for (Department dp : deps) {
			System.out.println(dp);
		}
		
		
		System.out.println();
		System.out.println("=== TEST 3: department insert====");
		Department newdep = new Department(null, "Cosmetics");
		depdao.insert(newdep);
		System.out.println("Inserted! new id = " + newdep.getId());
		
		
		System.out.println();
		System.out.println("=== TEST 4: department update====");
		Department updep = depdao.findById(4);
		updep.setName("Books");
		depdao.update(updep);
		System.out.println("Update complete!");
		
		
		System.out.println();
		System.out.println("=== TEST 5: department delete====");
		depdao.deleteById(7);
		System.out.println("Delete completed!");
		
	}
}
