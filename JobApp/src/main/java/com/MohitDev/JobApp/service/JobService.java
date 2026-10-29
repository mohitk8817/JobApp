package com.MohitDev.JobApp.service;

import com.MohitDev.JobApp.model.JobPost;
import com.MohitDev.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
   private JobRepo repo ;
    public void addJob(JobPost jobPost){

        repo.addJob(jobPost);///DTO

    }

    public List<JobPost> getAllJobs(){
        System.out.println("Service get the list");
        return repo.getAllJobs();
    }
}
