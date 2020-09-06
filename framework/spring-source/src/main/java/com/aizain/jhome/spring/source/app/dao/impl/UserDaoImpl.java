package com.aizain.jhome.spring.source.app.dao.impl;

import com.aizain.jhome.spring.source.app.dao.UserDao;
import com.aizain.jhome.spring.source.app.po.User;

import static com.aizain.jhome.spring.source.app.common.SpringContext.NEW_USER;

/**
 * UserDaoImpl
 *
 * @author Zain
 * @date 2019-05-24
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return NEW_USER;
    }

}
