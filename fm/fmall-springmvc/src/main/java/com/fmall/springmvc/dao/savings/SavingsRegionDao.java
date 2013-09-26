/**
 * 
 */
package com.fmall.springmvc.dao.savings;

import java.util.List;

import com.fmall.springmvc.generate.pojo.SavingsRegion;

/**
 * @author WHL
 *
 */
public interface SavingsRegionDao {

    public int insert(SavingsRegion sr);
    
    public int update(SavingsRegion sr);
   
    public int deleteById(int regionId);
    
    public int deleteByCity(String city);
   
    public List selectAll();
   
    public int countAll();
   
    public SavingsRegion findById(int regionId);
    
    public SavingsRegion findByCity(String city);
    
    public List findByProvince(String province);

}
