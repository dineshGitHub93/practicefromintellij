package com.stream_api_examples;


public class MoonMission {

    String country;
    String spaceAgency;
    boolean successful;
    Integer firstLandingYear;

    public MoonMission(String country, String spaceAgency, boolean successful, Integer firstLandingYear) {
        this.country = country;
        this.spaceAgency = spaceAgency;
        this.successful = successful;
        this.firstLandingYear = firstLandingYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpaceAgency() {
        return spaceAgency;
    }

    public void setSpaceAgency(String spaceAgency) {
        this.spaceAgency = spaceAgency;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public Integer getFirstLandingYear() {
        return firstLandingYear;
    }

    public void setFirstLandingYear(Integer firstLandingYear) {
        this.firstLandingYear = firstLandingYear;
    }

    @Override
    public String toString() {
        return "MoonMission{" +
                "country='" + country + '\'' +
                ", spaceAgency='" + spaceAgency + '\'' +
                ", successful=" + successful +
                ", firstLandingYear=" + firstLandingYear +
                '}';
    }
}
