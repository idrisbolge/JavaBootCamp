package arensoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import arensoft.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{

}
