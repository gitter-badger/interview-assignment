package com.eyeview.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: israel
 * Date: 6/2/14
 * Time: 11:54 AM
 */
public class FileProcessor {

    /**
     * Called with a batch of lines (between 1-1000 lines in each batch)
     *
     * @param  lines a {@link java.util.List} of lines from the file
     *
     */

    public void readLines(List<String> lines){
        // **** IMPLEMENT THIS METHOD ***/
        System.out.printf("Got %d lines\n", lines.size());
    }

    /**
     * Returns a map of top x hashtags
     *
     * @param  numOfTop   the number of top hashtags to find
     *
     * @return a {@link java.util.Map} of top x hashtags, each key is an hashtag and its value is the number of occurrences
     */
    public Map<String, Integer> topHashtags(int numOfTop){
        // **** IMPLEMENT THIS METHOD ***/
        return new HashMap<String, Integer>();
    }

}
