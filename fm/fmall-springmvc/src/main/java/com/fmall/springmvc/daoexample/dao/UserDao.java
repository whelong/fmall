package com.fmall.springmvc.daoexample.dao;



import java.util.List;

import com.fmall.springmvc.daoexample.pojo.User;



/**
 * 
 *
 *  @version ： 1.0
 *  
 *  @author  ： 苏若年            
 *    
 *  @since   ： 1.0        创建时间:    2013-4-9    上午11:36:34
 *     
 *  @function： TODO        
 *
 */
public interface UserDao {

    public int insert(User user);
     
    public int update(User user);
   
    public int delete(String userName);
   
    public List selectAll();
   
    public int countAll();
   
    public User findByUserName(String userName);

}

 

