package project.generator;

public class Versions {

	public static final String DOCKER_JHIPSTER_REGISTRY = "jhipster/jhipster-registry:v4.1.1";
	public static final String DOCKER_JAVA_JRE = "openjdk:11-jre-slim-stretch";
	public static final String DOCKER_MYSQL = "mysql:8.0.15";
	public static final String DOCKER_MARIADB = "mariadb:10.4.3";
	public static final String DOCKER_POSTGRESQL = "postgres:11.2";
	public static final String DOCKER_MONGODB = "mongo:4.0.8";
	public static final String DOCKER_COUCHBASE = "couchbase/server:6.0.1";
	public static final String DOCKER_CASSANDRA = "cassandra:3.11.4";
	public static final String DOCKER_MSSQL = "microsoft/mssql-server-linux:latest";
	public static final String DOCKER_HAZELCAST_MANAGEMENT_CENTER = "hazelcast/management-center:3.11.3";
	public static final String DOCKER_MEMCACHED = "memcached:1.5.12-alpine";
	public static final String DOCKER_KEYCLOAK = "jboss/keycloak:5.0.0";
	public static final String DOCKER_ELASTICSEARCH = "docker.elastic.co/elasticsearch/elasticsearch:6.4.3"; // The version should be coherent with the one from spring-data-elasticsearch project
	public static final String DOCKER_KAFKA = "wurstmeister/kafka:2.11-2.0.1";
	public static final String DOCKER_ZOOKEEPER = "wurstmeister/zookeeper:3.4.6";
	public static final String DOCKER_SONAR = "sonarqube:7.7-community";
	public static final String DOCKER_TRAEFIK = "traefik:1.7.10";
	public static final String DOCKER_CONSUL = "consul:1.4.4";
	public static final String DOCKER_CONSUL_CONFIG_LOADER = "jhipster/consul-config-loader:v0.3.0";
	public static final String DOCKER_PROMETHEUS = "prom/prometheus:v2.8.1";
	public static final String DOCKER_PROMETHEUS_ALERTMANAGER = "prom/alertmanager:v0.16.1";
	public static final String DOCKER_GRAFANA = "grafana/grafana:6.1.0";
	public static final String DOCKER_JENKINS = "jenkins:latest";
	public static final String DOCKER_SWAGGER_EDITOR = "swaggerapi/swagger-editor:latest";
	public static final String DOCKER_COMPOSE_FORMAT_VERSION = "2";
	public static final String DOCKER_PROMETHEUS_OPERATOR = "quay.io/coreos/prometheus-operator:v0.29.0";
	public static final String DOCKER_GRAFANA_WATCHER = "quay.io/coreos/grafana-watcher:v0.0.8";
	
}
