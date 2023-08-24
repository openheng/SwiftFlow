import com.openheng.Application;
import com.openheng.dao.TaskFlow;
import com.openheng.dao.TaskFlowMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by openheng on 2023-08-03.
 */
@SpringBootTest(classes = Application.class)
public class DataBaseTest {

    @Autowired
    private TaskFlowMapper taskFlowMapper;

    @Test
    public void testInsert() {
        TaskFlow mockTaskFlow = new TaskFlow();
        mockTaskFlow.setId(System.currentTimeMillis());
        mockTaskFlow.setBizCode((byte) 0);
        mockTaskFlow.setName("mock");
        int insertNum = taskFlowMapper.insertSelective(mockTaskFlow);
        Assertions.assertNotEquals(insertNum, 0);
    }
}
