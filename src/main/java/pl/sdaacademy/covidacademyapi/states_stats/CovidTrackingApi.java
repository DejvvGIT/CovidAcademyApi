package pl.sdaacademy.covidacademyapi.states_stats;

import pl.sdaacademy.covidacademyapi.states_stats.repository.StateStats;
import pl.sdaacademy.covidacademyapi.states_stats.repository.StateStats2;

public interface CovidTrackingApi {

    StateStats[] getAllStatesCurrentStats();

    StateStats getStatsForState(String state, String date);

    StateStats2 getStatsForStateWithTwitter(String name, String state, String covid19SiteOld, String twitter);
}
