package com.JobPortalProject.JobPortal;

import com.JobPortalProject.JobPortal.model.JobPost;
import com.JobPortalProject.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    //@ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPosts/{postID}")
    public JobPost getJob(@PathVariable("postID") int postID){
        return service.getJob(postID);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost)  ;
        return service.getJob(jobPost.getPostID());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostID());
    }

    @DeleteMapping("jobPost/{postID}")
    public String deleteJob( @PathVariable ("postID") int postID){
        service.deleteJob(postID);

        return "Deleted";
    }
}
