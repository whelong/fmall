/**
 * 
 */
package com.fmall.springmvc.service.impl.savings;

import java.util.List;

import com.fmall.springmvc.dao.savings.SavingsDao;
import com.fmall.springmvc.generate.pojo.SavingsProduct;
import com.fmall.springmvc.generate.pojo.SavingsProductExample;
import com.fmall.springmvc.generate.pojo.SavingsProductExample.Criteria;
import com.fmall.springmvc.javabean.savings.SavingsFetchCondition;
import com.fmall.springmvc.service.savings.SavingsService;

/**
 * @author WHL
 *
 */
public class SavingsServiceImpl implements SavingsService {

	private SavingsDao sd;
	
	public SavingsDao getSavingsDao(){
		return sd;
	}
	
	public void setSavingsDao(SavingsDao sd){
		this.sd = sd;
	}
	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#insert(com.fmall.springmvc.generate.pojo.SavingsProduct)
	 */
	@Override
	public int insert(SavingsProduct sp) {
		return this.sd.insert(sp);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#update(com.fmall.springmvc.generate.pojo.SavingsProduct)
	 */
	@Override
	public int update(SavingsProduct sp) {
		return this.sd.update(sp);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#delete(int)
	 */
	@Override
	public int delete(int id) {
		return this.sd.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#selectAll()
	 */
	@Override
	public List<SavingsProduct> selectAll() {
		return this.sd.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#countAll()
	 */
	@Override
	public int countAll() {
		return this.sd.countAll();
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#findById(int)
	 */
	@Override
	public SavingsProduct findById(int id) {
		return this.sd.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsProductService#findBySelections(java.lang.String)
	 * selections where clause, to select products by the conditions selected by front end users.
	 */
	@Override
	public List<SavingsProduct> findByUserCondition(SavingsFetchCondition sfc) {
		return this.sd.findByUserCondition(sfc);
	}

}
