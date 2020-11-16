package com.example.ConsumeNYT_TopStories;
import java.util.ArrayList;

public class TopStories {
    private String status;
    private String copyright;
    private String section;
    private String last_updated;
    private int num_results;
    private ArrayList<Results> results = new ArrayList<>();

    public TopStories(){
        this.status = null;
        this.copyright = null;
        this.section = null;
        this.last_updated = null;
        this.num_results = 0;
        setResults();
    }

    public TopStories(String status, String copyright, String section, String last_updated, int num_results, ArrayList<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults() {
        Results results1 = new Results();
        results.add(results1);
        //this.results = results;
    }
}
