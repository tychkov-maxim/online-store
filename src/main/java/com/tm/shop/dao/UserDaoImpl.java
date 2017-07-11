package com.tm.shop.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public String getUser(){
        NativeQuery nativeQuery = sessionFactory.getCurrentSession().createNativeQuery("select * from USERS");
        return nativeQuery.list().toString();
    }
}
