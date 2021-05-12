package arensoft.hrms.business.abstracts;

import java.util.List;

import arensoft.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
