package GenericStack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IntegerStackTest {

    @Test
    public void should_push_an_element() {
        IntegerStack integerStack = new IntegerStack();
        integerStack.push(4);
        assertThat(integerStack.pop(), is(4));
    }

    @Test(expected = NullPointerException.class)
    public void shoule_throw_exception_when_no_element_to_push() {
        IntegerStack integerStack = new IntegerStack();
        integerStack.pop();
    }

    @Test
    public void should_push_multiple_elements() {
        IntegerStack integerStack = new IntegerStack();
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        assertThat(integerStack.pop(), is(6));
        assertThat(integerStack.pop(), is(5));
        assertThat(integerStack.pop(), is(4));
        assertThat(integerStack.pop(), is(3));
    }
}
