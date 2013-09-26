/**
 * 
 */
package com.fmall.springmvc.dao.savings;

import java.util.List;

import com.fmall.springmvc.generate.pojo.SavingsProduct;
import com.fmall.springmvc.javabean.savings.SavingsFetchCondition;

/**
 * @author WHL
 *
 */
public interface SavingsDao {

    public int insert(SavingsProduct sp);
    
    public int update(SavingsProduct sp);
   
    public int delete(int id);
   
    public List selectAll();
   
    public int countAll();
   
    public SavingsProduct findById(int id);
    
    public List findByUserCondition(SavingsFetchCondition sfc);

}
