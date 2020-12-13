package pl.sdaacademy.covidacademyapi.states_stats;

import pl.sdaacademy.covidacademyapi.states_stats.repository.StateStats;

public interface CovidTrackingApi {

    StateStats[] getAllStatesCurrentStats();

    StateStats getStatsForState(String state, String date);
}
