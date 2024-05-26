import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Download {
    public StringBuilder downloadPage(StringBuilder url) {
        StringBuilder result = new StringBuilder();
        String line;
        try {
            URLConnection connection = new URL(url.toString()).openConnection();
            connection.addRequestProperty("User-Agent", "Mozilla");
            connection.setConnectTimeout(1000);

            try (InputStream is = connection.getInputStream();
                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                while ((line = br.readLine()) != null) {
                    result.append(line);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;

    }

}