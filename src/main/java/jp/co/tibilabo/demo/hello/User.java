package jp.co.tibilabo.demo.hello;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class User {
	@Id
	private Integer id;
	private String name;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
