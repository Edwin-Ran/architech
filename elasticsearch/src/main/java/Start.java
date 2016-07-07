import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * Created by haoranchen on 16-6-27.
 * haoranchen@sohu-inc.com
 */
public class Start {
    public static void main(String[] args) {
        ImmutableSettings.Builder builder = ImmutableSettings.settingsBuilder();
        builder.put("cluster.name", "mobile");
        builder.put("client.transport.sniff", true);
        long start = System.currentTimeMillis();
        TransportClient transportClient = new TransportClient(builder.build());
        start = System.currentTimeMillis();
        InetSocketTransportAddress inetSocketTransportAddress = new InetSocketTransportAddress("10.10.22.90", 9998);
        transportClient.addTransportAddresses(inetSocketTransportAddress);

        System.out.println(transportClient.listedNodes());
    }
}
