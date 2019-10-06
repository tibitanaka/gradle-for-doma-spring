package jp.co.tibilabo.demo.hello;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface UserDao {

	/**
	 * @param id
	 * @return
	 */
	@Select
	public User selectById(int id);
}
