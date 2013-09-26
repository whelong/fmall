/**
 * 
 */
package com.fmall.springmvc.service.savings;

import java.util.List;

import com.fmall.springmvc.generate.pojo.SavingsProduct;
import com.fmall.springmvc.javabean.savings.SavingsFetchCondition;

/**
 * @author WHL
 *
 */
public interface SavingsService {

    public int insert(SavingsProduct sp);
    
    public int update(SavingsProduct sp);
   
    public int delete(int id);
   
    public List<SavingsProduct> selectAll();
   
    public int countAll();
   
    public SavingsProduct findById(int id);
    
    
    public List<SavingsProduct> findByUserCondition(SavingsFetchCondition sfc);

}
