package pl.sdaacademy.covidacademyapi.states_stats.repository;

public class StateStats2 {

    private String state;
    private String name;
    private String covid19SiteOld;
    private String twitter;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCovid19SiteOld() {
        return covid19SiteOld;
    }

    public void setCovid19SiteOld(String covid19SiteOld) {
        this.covid19SiteOld = covid19SiteOld;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
