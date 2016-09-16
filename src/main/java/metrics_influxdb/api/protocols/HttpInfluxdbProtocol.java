package metrics_influxdb.api.protocols;


public class HttpInfluxdbProtocol implements InfluxdbProtocol {
	public final static String DEFAULT_HOST = "127.0.0.1";
	public final static int DEFAULT_PORT = 8086;
	public final static String DEFAULT_DATABASE = "metrics";
    public final static String DEFAULT_PROTOCOL = "http";

	public final String user;
	public final String password;
	public final String host; 
	public final int port;
	public final boolean secured;
	public final String database;
    public final String protocol;

    public HttpInfluxdbProtocol(String protocol, String host, int port, String user, String password, String db) {
        super();
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
		this.database = db;
		this.secured = (user != null) && (password != null);
        this.protocol = protocol;
    }

	public HttpInfluxdbProtocol(String host) {
		this(host, DEFAULT_PORT);
	}

	public HttpInfluxdbProtocol(String host, int port) {
		this(host, port, null, null);
	}

	public HttpInfluxdbProtocol(String host, int port, String database) {
        this(DEFAULT_PROTOCOL, host, port, null, null, database);
    }

	public HttpInfluxdbProtocol() {
		this(DEFAULT_HOST, DEFAULT_PORT);
	}

	public HttpInfluxdbProtocol(String host, int port, String user, String password) {
        this(DEFAULT_PROTOCOL, host, port, user, password, DEFAULT_DATABASE);
    }
}
