package com.JobPortalProject.JobPortal.repo;

import com.JobPortalProject.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {


    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);


    }

    public JobPost getJob(int postID) {

        for(JobPost job : jobs){
            if(job.getPostID()==postID)
                return job;
        }

    return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobpost1 : jobs){
            if(jobpost1.getPostID()==jobPost.getPostID()) {
                jobpost1.setPostProfile(jobPost.getPostProfile());
                jobpost1.setPostDescription(jobPost.getPostDescription());
                jobpost1.setReqExperience(jobPost.getReqExperience());
                jobpost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postID) {
        for(JobPost jobPost:jobs){
            if(jobPost.getPostID()==postID){
                jobs.remove(jobPost);
            }
        }
    }
}