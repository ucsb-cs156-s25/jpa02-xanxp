package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Xin W.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "xanxp";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-03");
        team.addMember("Karena L.");
        team.addMember("Daisy Z.");
        team.addMember("Kade W.");
        team.addMember("Xin W.");
        team.addMember("Isaac L.");
        team.addMember("Saahas B.");
        return team;
    }
}
