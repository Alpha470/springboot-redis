package com.alpha.myredis;

import com.alpha.myredis.bean.Employee;
import com.alpha.myredis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class MyredisApplicationTests {
@Autowired
StringRedisTemplate stringRedisTemplate;
@Autowired
	RedisTemplate redisTemplate;
	RedisTemplate<Object, Employee> empRedisTemplate;

	@Autowired
	EmployeeMapper employeeMapper;


@Test
void test(){
	//stringRedisTemplate.opsForValue().append("msg2","我就是我");
	Employee emp = employeeMapper.getEmpById(1);
	Employee employee = empRedisTemplate.opsForValue().get("emp-02");
	System.out.println(employee.toString());
}



	@Test
	void contextLoads() {
		Employee emp = employeeMapper.getEmpById(1);
		System.out.println(emp);
	}

}
