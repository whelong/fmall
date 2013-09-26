/**
 * 
 */
package com.fmall.springmvc.service.impl.savings;

import java.util.List;

import com.fmall.springmvc.dao.savings.SavingsBankDao;
import com.fmall.springmvc.generate.pojo.SavingsBank;
import com.fmall.springmvc.service.savings.SavingsBankService;

/**
 * @author WHL
 *
 */
public class SavingsBankServiceImpl implements SavingsBankService {

	SavingsBankDao sbd;
	
	public void setSavingsBankDao(SavingsBankDao sbd){
		this.sbd = sbd;
	}
	
	public SavingsBankDao getSavingsBankDao(){
		return this.sbd;
	}
	
	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#insert(java.lang.String)
	 */
	@Override
	public int insert(String bankName) {
		return this.sbd.insert(bankName);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#update(com.fmall.springmvc.generate.pojo.SavingsBank)
	 */
	@Override
	public int update(SavingsBank sb) {
		return this.sbd.update(sb);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#deleteById(int)
	 */
	@Override
	public int deleteById(int bankId) {
		return this.sbd.deleteById(bankId);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#deleteByName(java.lang.String)
	 */
	@Override
	public int deleteByName(String bankName) {
		return this.sbd.deleteByName(bankName);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#selectAll()
	 */
	@Override
	public List<SavingsBank> selectAll() {
		return this.sbd.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#countAll()
	 */
	@Override
	public int countAll() {
		return this.sbd.countAll();
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#findById(int)
	 */
	@Override
	public SavingsBank findById(int bankId) {
		return this.sbd.findById(bankId);
	}

	/* (non-Javadoc)
	 * @see com.fmall.springmvc.daoexample.service.SavingsBankService#findByName(java.lang.String)
	 */
	@Override
	public SavingsBank findByName(String bankName) {
		return this.sbd.findByName(bankName);
	}

}
