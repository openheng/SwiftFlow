import com.openheng.Application;
import com.openheng.utils.SnowFlakeIdGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by openheng on 2023-08-04.
 */
@SpringBootTest(classes = Application.class)
public class SnowFlakeIdGeneratorTest {

    @Autowired
    private SnowFlakeIdGenerator snowFlakeIdGenerator;

    @Test
    void testId() {

        long id = snowFlakeIdGenerator.nextId();
        System.out.println("id : " + Long.toBinaryString(id));
        Assertions.assertNotEquals(id , 0);

    }

}
