package Test;

import service.IUserSrevice;
import service.lmpl.UserServicelmpl;

public class mytest {
    public static void main(String[] args) {
        IUserSrevice service = new UserServicelmpl();
        service.getUser();
    }
}
