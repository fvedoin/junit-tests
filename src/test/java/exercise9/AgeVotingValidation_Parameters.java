package exercise9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import voting.Voting;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AgeVotingValidation_Parameters {

    @Parameter(0) public String name;
    @Parameter(1) public int birthYear;
    @Parameter(2) public String result;

    @Test
    public void validateMandatoryVoting() {
        assertEquals(result, Voting.canVote(name, birthYear));
    }

    @Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Fernando", 2007, "Fernando, you cant vote"},
                {"Fernando", 2006, "Fernando, you cant vote"},
                {"Fernando", 2005, "Fernando, your vote is optional"},
                {"Fernando", 2004, "Fernando, your vote is optional"},
                {"Fernando", 2003, "Fernando, your vote is mandatory"},
                {"Fernando", 1996, "Fernando, your vote is mandatory"},
                {"Fernando", 1951, "Fernando, your vote is mandatory"},
                {"Fernando", 1950, "Fernando, your vote is optional"}
        });
    }
}
