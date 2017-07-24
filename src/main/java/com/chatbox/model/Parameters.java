package com.chatbox.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
	private String region;

    private String fullparttime;

    private String job_category;

    private String post;

    private String jobtype;

    private String degree;

    private String tool;

    private State state;

    private String experience;

    private Country country;

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public String getFullparttime ()
    {
        return fullparttime;
    }

    public void setFullparttime (String fullparttime)
    {
        this.fullparttime = fullparttime;
    }

    public String getJob_category ()
    {
        return job_category;
    }

    public void setJob_category (String job_category)
    {
        this.job_category = job_category;
    }

    public String getPost ()
    {
        return post;
    }

    public void setPost (String post)
    {
        this.post = post;
    }

    public String getJobtype ()
    {
        return jobtype;
    }

    public void setJobtype (String jobtype)
    {
        this.jobtype = jobtype;
    }

    public String getDegree ()
    {
        return degree;
    }

    public void setDegree (String degree)
    {
        this.degree = degree;
    }

    public String getTool ()
    {
        return tool;
    }

    public void setTool (String tool)
    {
        this.tool = tool;
    }

    public State getState ()
    {
        return state;
    }

    public void setState (State state)
    {
        this.state = state;
    }

    public String getExperience ()
    {
        return experience;
    }

    public void setExperience (String experience)
    {
        this.experience = experience;
    }

    public Country getCountry ()
    {
        return country;
    }

    public void setCountry (Country country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [region = "+region+", fullparttime = "+fullparttime+", job_category = "+job_category+", post = "+post+", jobtype = "+jobtype+", degree = "+degree+", tool = "+tool+", state = "+state+", experience = "+experience+", country = "+country+"]";
    }
}
