package it_academy;

import _5_annotation_test.MyTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.*;

@MyTest("a stack test")
public class StackTestCase {

    @Test
    public void shouldAddToStack() {
        Deque<Integer> dequeue2 = new ArrayDeque<>(2);
        dequeue2.offer(1);
        dequeue2.offer(2);
        Assert.assertFalse(dequeue2.isEmpty());
        Assert.assertEquals(2, dequeue2.size());
        Assert.assertThat(dequeue2, is(not(empty())));
        Assert.assertThat(dequeue2, hasSize(2));
        Assert.assertThat(dequeue2, hasItems(1,2));
        dequeue2.poll();
        dequeue2.poll();
        Assert.assertTrue(dequeue2.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    @Deprecated
    public void shouldThrowAnErrorOnRemove() {
        Deque<Integer> dequeue2 = new ArrayDeque<>(2);
        dequeue2.poll();
    }
}
