package service.lmpl;

import Dao.IUserDao;
import Dao.lmpl.UserDaoOracleImpl;
import Dao.lmpl.UserDaolmpl;
import service.IUserSrevice;

public class UserServicelmpl implements IUserSrevice {

    IUserDao dao=new UserDaoOracleImpl();
    @Override
    public void getUser() {
        dao.getUser();
    }
}
