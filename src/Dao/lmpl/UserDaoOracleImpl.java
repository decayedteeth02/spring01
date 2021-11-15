package Dao.lmpl;

import Dao.IUserDao;

public class UserDaoOracleImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("查询Oracle");
    }
}
