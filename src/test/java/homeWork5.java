import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("simple")
public class homeWork5 {

    ClassLoader cl = homeWork5.class.getClassLoader();

    @Test
    void zipFileTest() throws Exception {
        try(
                InputStream resource = cl.getResourceAsStream("priv.txt.zip");
                ZipInputStream zip = new ZipInputStream(resource);
                ) {
            ZipEntry entry;
            while((entry = zip.getNextEntry()) != null) {
                assertThat(entry.getName()).contains("priv.txt");

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                zip.transferTo(baos);
                String textContent = baos.toString(StandardCharsets.UTF_8);
                assertThat(textContent).contains("hello my dear baby");
            }
        }
    }
}
