package springbook.user.dao;

import java.sql.SQLException;
import springbook.user.domain.User;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // UserDao가 사용할 ConnectionMaker 구현 클래스를 결정하고 생성한다
        ConnectionMaker connectionMaker = new DConnectionMaker();
        // UserDao의 생성자에 ConnectionMaker(=DConnectionMaker())를 전달한다
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("lyon");
        user.setName("라이언");
        user.setPassword("12345");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");

    }

}
