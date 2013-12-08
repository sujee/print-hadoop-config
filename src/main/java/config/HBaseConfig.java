// cc ConfigurationPrinter An example Tool implementation for printing the properties in a Configuration

package config;

import java.util.Map.Entry;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.util.*;

public class HBaseConfig extends Configured implements Tool {

  static {
    Configuration.addDefaultResource("hbase-default.xml");
    Configuration.addDefaultResource("hbase-site.xml");
  }

  @Override
  public int run(String[] args) throws Exception {
    Configuration conf = HBaseConfiguration.create();
    for (Entry<String, String> entry: conf) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
    return 0;
  }

  public static void main(String[] args) throws Exception {
    int exitCode = ToolRunner.run(new HBaseConfig(), args);
    System.exit(exitCode);
  }
}
