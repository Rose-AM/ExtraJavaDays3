package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

public class Q1Test {

        List<String> listOfWords = new ArrayList<>();

        @BeforeEach
        void setUp() {
            listOfWords.addAll(Arrays.asList("one","one","one","two","Three","three"));
        }

        @Test
        void wordsCount() {
            Map<String, Integer> actual = Question1.wordsCount(listOfWords);
            assertThat(actual).containsKey("one");
            assertThat(actual.get("one")).isEqualTo(3);
            assertThat(actual).containsKey("two");
            assertThat(actual.get("two")).isEqualTo(1);
            assertThat(actual).containsKey("three");
            assertThat(actual.get("three")).isEqualTo(2);
            assertThat(actual).hasSize(3);

        }

        @Test
        void mostCommon() {
            Map<String, Integer> actual = Question1.mostCommon(listOfWords, 2);
            assertThat(actual).containsKey("one");
            assertThat(actual.get("one")).isEqualTo(3);

            assertThat(actual).containsKey("three");
            assertThat(actual.get("three")).isEqualTo(2);
            assertThat(actual).hasSize(2);

        }

        @Test
        void leastCommon() {
            Map<String, Integer> actual = Question1.leastCommon(listOfWords, 2);
            assertThat(actual).containsKey("two");
            assertThat(actual.get("two")).isEqualTo(1);

            assertThat(actual).containsKey("three");
            assertThat(actual.get("three")).isEqualTo(2);
        }
}
