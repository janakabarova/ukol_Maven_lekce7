import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MavenTest {

    @Test
    public void testSum(){
        MavenMain maven = new MavenMain();

        assertEquals(14, maven.sum(1, 5, 2));
    }


}
