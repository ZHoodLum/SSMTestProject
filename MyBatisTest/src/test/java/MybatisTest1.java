import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import com.neusoft.mapper.InsertUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.neusoft.entity.User;
import com.neusoft.mapper.SearchUserMapper;
import org.junit.Before;
import org.junit.Test;

public class MybatisTest1 {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void lianjie() {
//      1、因为 db.properties 已经放入SQLMapConfig.xml中，这个时候就需要查找Maven配置文件
        String source = "SqlMapConfig.xml";
        try {
//          2、使用getResourceAsStream()方法将查找到的文件放入内存中（外存放到内存中），读取文件
            InputStream in=  Resources.getResourceAsStream(source);
//            Reader ian=  Resources.getResourceAsReader(source);
//          3、将刚才读取的文件，放到SqlSessionFactoryBuilder()中 （.build()方法属于重载）
//            这里使用Reader读文件或者使用InputStream都可以
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build(ian);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    查询全部
    @Test
    public void test1() {
        SqlSession  sqlSession	=sqlSessionFactory.openSession();
        List<User> list=sqlSession.selectList("searchAllUser");
        for(User user:list) {
            System.out.println(user);
        }
    }
//    查询单个
@Test
    public void test2() {
        SqlSession  sqlSession = sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("searchUserById",222);
        System.out.println(user);
//        SearchUserMapper searchusermapper= sqlSession.getMapper(SearchUserMapper.class);
//        User user = new User();
//        user.setUserName("LPL");
//        user.setPassWord("123456");
//        searchusermapper.addUser1(user);
    }
//    使用动态代理
@Test
	public void test3() throws IOException {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		//动态代理----->将我们写的mapper.xml文件 动态的生成了 实现SearchUserMapper.class接口的一个实现类
        SearchUserMapper searchusermapper= sqlSession.getMapper(SearchUserMapper.class);
        List<User> list= searchusermapper.searchAllUser();
        for(User user:list) {
            System.out.println(user);
		}
	}

//	插入单个数据
//  使用的SearchUserMapper.xml文件
@Test
    public void test4(){
        User user1 = new User();
        user1.setId(555);
        user1.setUserName("IG");
        user1.setPassWord("555");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SearchUserMapper searchUserMapper = sqlSession.getMapper(SearchUserMapper.class);
        searchUserMapper.insertUser(user1);
        sqlSession.commit();
    }
//  插入练习
//  使用的insertUserMapper.xml文件
@Test
    public void test5(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        InsertUserMapper insertUserMapper = sqlSession.getMapper(InsertUserMapper.class);
        User user = new User();
        user.setId(2018);
        user.setPassWord("2018");
        user.setUserName("UTF8");
        insertUserMapper.insertUser(user);
        sqlSession.commit();
    }

}

