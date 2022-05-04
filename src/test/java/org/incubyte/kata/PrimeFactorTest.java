package org.incubyte.kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorTest {

    List<Integer> list = new ArrayList<>();

    @Test
    public void that_function_returns_empty_list_when_value_given_is_1() {
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(1));
    }

    @Test
    public void that_function_generate_will_return_number_itself_if_given_prime_number() {
        int numberToBeChecked = 2;
        list.add(2);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));

        list.removeAll(list);
        numberToBeChecked = 3;
        list.add(3);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void that_function_will_return_list_of_prime_factors_if_composite_1() {
        int numberToBeChecked = 6;
        list.add(2);
        list.add(3);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void that_function_will_return_list_of_prime_factors_if_composite_2() {
        list.removeAll(list);
        int numberToBeChecked = 12;
        list.add(2);
        list.add(2);
        list.add(3);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void that_function_will_return_list_of_prime_factors_if_composite_3() {
        list.removeAll(list);
        int numberToBeChecked = 100;
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void that_function_will_return_list_of_prime_factors_if_composite_4() {
        list.removeAll(list);
        int numberToBeChecked = 77;
        list.add(7);
        list.add(11);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void test_for_prime_factors_in_squares_1() {
        list.removeAll(list);
        int numberToBeChecked = 4;
        list.add(2);
        list.add(2);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void test_for_prime_factors_in_squares_2() {
        list.removeAll(list);
        int numberToBeChecked = 121;
        list.add(11);
        list.add(11);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }

    @Test
    public void test_for_prime_factors_of_cubes() {
        list.removeAll(list);
        int numberToBeChecked = 27;
        list.add(3);
        list.add(3);
        list.add(3);
        Assertions.assertThat(list).isEqualTo(PrimeFactor.generate(numberToBeChecked));
    }
}
