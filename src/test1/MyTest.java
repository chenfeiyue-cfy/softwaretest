package test1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyTest {
	
	@Mock
	private List list;
	
    @Test
    public void myTest() {
        /* 创建Mock对象 */
        
        /* 设置预期，当调用 get(0) 方法时返回 "111" */
        when(list.get(0)).thenReturn("111");

        Assert.assertEquals("asd", 1, 1);
        /* 设置后返回期望的结果 */
        System.out.println(list.get(0));
        /* 没有设置则返回 null */
        System.out.println(list.get(1));

        /* 对 Mock 对象设置无效 */
        list.add("12");
        list.add("123");
        /* 返回之前设置的结果 */
        System.out.println(list.get(0));
        /* 返回 null */
        System.out.println(list.get(1));
     
        System.out.println(list.size());

        verify(list, times(2)).get(1);

        /*验证*/
        String ret = (String)list.get(0);
        Assert.assertEquals(ret, "111");
    }
}

