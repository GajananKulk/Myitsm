package com.chatbox.model;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
	 private String region;

	    private String fullparttime;

	    private String jobtype;

	    private State state;

	    private String jobcategory;

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

	    public String getJobtype ()
	    {
	        return jobtype;
	    }

	    public void setJobtype (String jobtype)
	    {
	        this.jobtype = jobtype;
	    }

	    public State getState ()
	    {
	        return state;
	    }

	    public void setState (State state)
	    {
	        this.state = state;
	    }

	    public String getJobcategory ()
	    {
	        return jobcategory;
	    }

	    public void setJobcategory (String jobcategory)
	    {
	        this.jobcategory = jobcategory;
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
	        return "ClassPojo [region = "+region+", fullparttime = "+fullparttime+", jobtype = "+jobtype+", state = "+state+", jobcategory = "+jobcategory+", country = "+country+"]";
	    }
}
