package com.cis.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import com.cis.dao.LockDAO;
import com.cis.dao.model.Lock1;
import com.cis.service.LockService;
import com.cis.service.beans.LockBean;


public class LockServiceImp implements LockService {
	private LockDAO lockDAO;
	
    public LockServiceImp(LockDAO lockDAO) {
    	this.lockDAO =lockDAO;
	}
 
	@Override
	public Integer saveLock(LockBean lockBean) {
		System.out.print("Control");
		Lock1 lock1= new Lock1();
		lock1.setLockID(lockBean.getLockID());
		lock1.setMachineNAME(lockBean.getMachineNAME());
		lock1.setMachineSIZE(lockBean.getMachineSIZE());
		lock1.setMachinePrice(lockBean.getMachinePrice());
		
		return lockDAO.saveLock(lock1);
	}

	@Override
	public List<LockBean> getAllLock() {
		
		List<LockBean> lockes=null;
		List<Lock1> llockes=lockDAO.getAllLock();
		if(llockes!=null)
		{
			lockes=new ArrayList<LockBean>();
			ListIterator<Lock1> li=llockes.listIterator();
			while(li.hasNext())
			{
				Lock1 lock1=li.next();
				LockBean lockBean=new LockBean();
				lockBean.setLockNo(lock1.getLockNo());
				lockBean.setLockID(lock1.getLockID());
				lockBean.setMachineNAME(lock1.getMachineNAME());
				lockBean.setMachineSIZE(lock1.getMachineSIZE());
				lockBean.setMachinePrice(lock1.getMachinePrice());
				System.out.println(lock1.getLockID()+"lock id is:");
				lockes.add(lockBean);
			}
		}
		return lockes;
	}

@Override
	public LockBean getLock(Integer lockNo) {
		Lock1 lock1 = lockDAO.getLock(lockNo);
		LockBean lockBean =null;
		if(lock1!=null)
		{
			lockBean = new LockBean();
			lockBean.setLockNo(lock1.getLockNo());
			lockBean.setLockID(lock1.getLockID());
			lockBean.setMachineNAME(lock1.getMachineNAME());
			lockBean.setMachineSIZE(lock1.getMachineSIZE());
			lockBean.setMachinePrice(lock1.getMachinePrice());
		}
		return lockBean;
	}

	@Override
	public void modifyLock(LockBean lockBean) {
		Lock1 lock1 =new Lock1();
		lock1.setLockNo(lockBean.getLockNo());
		lock1.setLockID(lockBean.getLockID());
		lock1.setMachineNAME(lockBean.getMachineNAME());
		lock1.setMachineSIZE(lockBean.getMachineSIZE());
		lock1.setMachinePrice(lockBean.getMachinePrice());
		lockDAO.updateLock(lock1);
		System.out.println("Service DAO");
	}
}
