import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class GroupSumTest extends junit.framework.TestCase
{

    public static void main(String args[]) {
        GroupSumTest test = new GroupSumTest();
        test.test_groupSum();

    }

  
    @Test
    public void test_groupSum()
    {
        int[] array = {2, 3, 4, 8};
        assertTrue(GroupSum.groupSum(0, array, 17));
        assertTrue(GroupSum.groupSum(0, array, 15));
        assertFalse(GroupSum.groupSum(0, array, 10));
        assertTrue(GroupSum.groupSum(0, array, 5));
        assertFalse(GroupSum.groupSum(0, array, 1));
        assertFalse(GroupSum.groupSum(0, array, 18));
    }

}
