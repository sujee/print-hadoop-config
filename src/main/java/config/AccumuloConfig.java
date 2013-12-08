// cc ConfigurationPrinter An example Tool implementation for printing the properties in a Configuration

package config;

import java.util.Map.Entry;

import org.apache.accumulo.core.conf.AccumuloConfiguration;
import org.apache.accumulo.server.conf.ServerConfiguration;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class AccumuloConfig extends Configured implements Tool {

  static {
    Configuration.addDefaultResource("accumulo-default.xml");
    Configuration.addDefaultResource("accumulo-site.xml");
  }

  @Override
  public int run(String[] args) throws Exception {

    AccumuloConfiguration conf = ServerConfiguration.getSiteConfiguration();
    for (Entry<String, String> entry: conf) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
    return 0;
  }

  public static void main(String[] args) throws Exception {
    int exitCode = ToolRunner.run(new AccumuloConfig(), args);
    System.exit(exitCode);
  }
}
