# -Dspring.jpa.hibernate.ddl-auto=create-drop \

web: java $JAVA_OPTS \
  -Dserver.port=$PORT \
  -Dsomething=$DATABASE_URL \
  -Dspring.datasource.url=jdbc:postgresql://$DOKKU_POSTGRES_TESTDB1_PORT_5432_TCP_ADDR:$DOKKU_POSTGRES_TESTDB1_PORT_5432_TCP_PORT/testdb1 \
  -Dspring.datasource.username=postgres \
  -Dspring.datasource.password=$DOKKU_POSTGRES_TESTDB1_ENV_POSTGRES_PASSWORD \
  -jar build/libs/dokku-experiment-app-1.0-SNAPSHOT.jar
