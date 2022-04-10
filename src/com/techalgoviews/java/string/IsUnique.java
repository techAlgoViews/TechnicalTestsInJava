package com.techalgoviews.java.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Is Unique. Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * Hints:
 * - Try hash table
 * - Could a bit vector be useful
 * - Can you solve it in O(N log N) time? What might a solution like that look like?
 */
public class IsUnique {

    public boolean containUniqueCharacters(String word) {
        return false;
    }

    @Test
    public void test1() {
        // Given
        String word = "abcde";

        // When
        boolean result = containUniqueCharacters(word);

        // Then
        assertTrue(result);
    }

    @Test
    public void test2() {
        // Given
        String word = "abcdea";

        // When
        boolean result = containUniqueCharacters(word);

        // Then
        assertFalse(result);
    }

}
