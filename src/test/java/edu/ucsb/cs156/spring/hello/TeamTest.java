package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_obj_returns_true() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_not_InstanceOf_returns_false() {
        assertEquals(false, team.equals("stringObj"));
    }

    @Test
    public void equal_same_name_and_members_returns_true() {
        Team team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));
    }

    @Test
    public void equal_same_name_diff_members_returns_false() {
        Team team2 = new Team("test-team");
        team2.addMember("Ada");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void equal_diff_name_same_members_returns_false() {
        Team team2 = new Team("not-test-team");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void hashCode_same_objects_return_same_hashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_returns_0() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
        

}
