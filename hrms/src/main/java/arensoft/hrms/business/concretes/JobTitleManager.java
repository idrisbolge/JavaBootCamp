package arensoft.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import arensoft.hrms.business.abstracts.JobTitleService;
import arensoft.hrms.dataAccess.abstracts.JobTitleDao;
import arensoft.hrms.entities.concretes.JobTitle;

public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll();
	}

}
