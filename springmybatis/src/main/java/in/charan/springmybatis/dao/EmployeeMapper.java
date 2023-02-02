package in.charan.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import in.charan.springmybatis.entity.Employee;
import in.charan.springmybatis.util.MyBatisUtil;

@Repository
public class EmployeeMapper {
	
	public List<Employee> getAllEmployees(){
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Employee> employeeList = session.selectList("getAllEmployees");
		session.commit();
		session.close();
		return employeeList;
	}
	
	public void saveEmployee(Employee employee) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertEmployee", employee);
		session.commit();
		session.close();
	}
	
	public void deleteEmployee(int employeeId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteEmployee", employeeId);
		session.commit();
		session.close();
	}
}
