package com.neusoft.test;

import com.neusoft.vo.Users;

import java.util.ArrayList;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class UsersTest {

    public static void main(String[] args) {
        ArrayList<Users> arrayList = new ArrayList<Users>();
        Users users = new Users();

        users.setId(1);
        users.setName("sss");
        users.setAge(11);

        arrayList.add(users);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("输出"+arrayList.get(i));
        }

    }
}
