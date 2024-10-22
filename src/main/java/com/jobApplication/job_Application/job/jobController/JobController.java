package com.jobApplication.job_Application.job.jobController;

import com.jobApplication.job_Application.model.Job;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class JobController {
    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }

}
