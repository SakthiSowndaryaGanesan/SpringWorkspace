package com.JobPortalProject.JobPortal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private int postID;
    private String postProfile;
    private String postDescription;
    private int reqExperience;
    private List<String> postTechStack;


}

