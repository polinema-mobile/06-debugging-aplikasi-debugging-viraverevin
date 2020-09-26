package id.putraprima.mobile06siplecalcsolution;

import android.app.Activity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity AcMainActivity = new MainActivity();
    @Test
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
    public void testOperation(){
        assertEquals(10, AcMainActivity.operation("add",5,5));
        assertEquals(0, AcMainActivity.operation("substract",5,5));
        assertEquals(25, AcMainActivity.operation("multiply",5,5));
        assertEquals(1, AcMainActivity.operation("division",5,5));
    }
}