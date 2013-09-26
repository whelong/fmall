/**
 * 
 */
package com.fmall.springmvc.dao.savings;

import java.util.List;

import com.fmall.springmvc.generate.pojo.SavingsType;

/**
 * @author WHL
 *
 */
public interface SavingsTypeDao {

    public int insert(SavingsType st);
    
    public int update(SavingsType sr);
   
    public int delete(int savingsTypeId);
   
    public List selectAll();
   
    public int countAll();
   
    public SavingsType findById(int savingsTypeId);
    
    public List findByCurrency(String currencyName);
    
    public List findByTypeName(String savingsTypeName);
    
    public List findByTerm(String savingsTerm);

}
