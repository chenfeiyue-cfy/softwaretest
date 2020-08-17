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
        /* ����Mock���� */
        
        /* ����Ԥ�ڣ������� get(0) ����ʱ���� "111" */
        when(list.get(0)).thenReturn("111");

        Assert.assertEquals("asd", 1, 1);
        /* ���ú󷵻������Ľ�� */
        System.out.println(list.get(0));
        /* û�������򷵻� null */
        System.out.println(list.get(1));

        /* �� Mock ����������Ч */
        list.add("12");
        list.add("123");
        /* ����֮ǰ���õĽ�� */
        System.out.println(list.get(0));
        /* ���� null */
        System.out.println(list.get(1));
     
        System.out.println(list.size());

        verify(list, times(2)).get(1);

        /*��֤*/
        String ret = (String)list.get(0);
        Assert.assertEquals(ret, "111");
    }
}

