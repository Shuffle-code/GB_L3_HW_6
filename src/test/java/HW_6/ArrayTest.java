package HW_6;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.gb.MathOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayTest {
    int[] arr = Array.array();

    @ParameterizedTest
    @MethodSource("arrayTestValues")
    void shouldNewArrayGreat_whenValue4inEnd(int[] expected, int[] real) {
        Assertions.assertArrayEquals(expected, real);;
    }

    @ParameterizedTest
    @MethodSource("arrayTestValuesAuto")
    void shouldNewArrayGreat_whenValueRandom(int[] expected, int[] real) {
        Assertions.assertArrayEquals(expected, real);;
    }

    @ParameterizedTest
    @MethodSource("arrayTestValuesForTwoInARowValue4")
    void shouldNewArrayGreat_whenTwoInARowValue4(int[] expected, int[] real){
        Assertions.assertArrayEquals(expected, real);
    }

    @ParameterizedTest
    @MethodSource("arrayTestValuesForException")
    void testException(int[] real){
        Assertions.assertThrows(RuntimeException.class, () -> Array.newArray(real));
    }

    @ParameterizedTest
    @MethodSource("arrayTestValuesForCheck")
    public void testFalseCheckMethod(int [] arr) {
        Assertions.assertFalse(Array.check(arr), "if not 1 or 4 is false");
    }
    @ParameterizedTest
    @MethodSource("arrayTestValuesForCheck")
    public void testTruthCheckMethod(int [] arr) {
        Assertions.assertTrue(Array.check(arr), "if not 1 or 4 is false");
    }




    private static Stream<Arguments> arrayTestValuesForException() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 1, 3, 7, 2, 1}),
                Arguments.of(new int[]{9, 2, 5, 3, 3, 7, 2, 2}),
                Arguments.of(new int[]{4, 4, 4, 4, 4, 7, 2, 5})
        );
    }

    private static Stream<Arguments> arrayTestValuesForCheck() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1, 1, 1}),
                Arguments.of(new int[]{4, 4, 4, 4, 4, 4, 4, 4}),
                Arguments.of(new int[]{4, 4, 1, 4, 4, 1, 1, 1})
        );
    }





    private static Stream<Arguments> arrayTestValuesForTwoInARowValue4() {
        return Stream.of(
                Arguments.of(new int[]{3}, Array.newArray(new int[]{1, 2, 4, 4, 3, 7, 2, 4})),
                Arguments.of(new int[]{}, Array.newArray(new int[]{9,2,5,3,3,7,4,4})),
                Arguments.of(new int[]{7}, Array.newArray(new int[]{4,4,4,4,4,7,2,4}))
        );
    }

    private static Stream<Arguments> arrayTestValues() {
        return Stream.of(
                Arguments.of(new int[]{3}, Array.newArray(new int[]{1, 2, 3, 4, 3, 7, 2, 4})),
                Arguments.of(new int[]{}, Array.newArray(new int[]{9,2,5,3,3,7,6,4})),
                Arguments.of(new int[]{5,7}, Array.newArray(new int[]{4,4,5,1,4,7,2,4}))
        );
    }


    public static Stream<Arguments> arrayTestValuesAuto() {
        List<Arguments> out = new ArrayList<>();
        for (int j = 0; j < 16; j++){
            List<Integer> list = new ArrayList<>();
            int[] intArray = new int[10];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = (int) (Math.random() * 10);
            }
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] == 4) {
                    if (intArray[i + 1] != 4) {
                        list.add(intArray[i + 1]);
                    }
                }
            }
            int[] newArray = new int[list.size()];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = list.get(i);
            }
            int [] expected = newArray;
            out.add(Arguments.arguments(expected, Array.newArray(intArray)));
        }

        return out.stream();
    }

}
