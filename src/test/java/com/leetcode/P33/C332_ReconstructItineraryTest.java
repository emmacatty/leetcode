package com.leetcode.P33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-20
 */
public class C332_ReconstructItineraryTest {

    @Test
    public void testFindItinerary() throws Exception {
        String[][] tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        String[][] tickets1 = {{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}};
        C332_ReconstructItinerary example = new C332_ReconstructItinerary();
        List<String> itinerary = example.findItinerary(tickets1);
        String[] iti = (String[]) itinerary.toArray(new String[itinerary.size()]);
        String[] expect = {"JFK", "NRT", "JFK", "KUL"};
        assertArrayEquals(expect, iti);

    }
}