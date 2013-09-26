/**
 * 
 */
package com.fmall.springmvc.service.savings;

import java.util.List;

import com.fmall.springmvc.generate.pojo.SavingsBank;

/**
 * @author WHL
 *
 */
public interface SavingsBankService {

    public int insert(String bankName);
    
    public int update(SavingsBank sb);
   
    public int deleteById(int bankId);
    
    public int deleteByName(String bankName);
   
    public List selectAll();
   
    public int countAll();
   
    public SavingsBank findById(int bankId);
    
    public SavingsBank findByName(String bankName);

}