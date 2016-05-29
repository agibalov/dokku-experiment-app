# dokku-experiment-app

### Set up

1. Install Dokku as described in [official docs](http://dokku.viewdocs.io/dokku/installation/).
2. Create an application `dokku-app1` [see here](http://dokku.viewdocs.io/dokku/application-deployment/#create-the-app).
3. Create a Postgres database `testdb1` [see here](http://dokku.viewdocs.io/dokku/application-deployment/#create-the-backing-services).
4. Link `testdb1` to `dokku-app` [see here](http://dokku.viewdocs.io/dokku/application-deployment/#linking-backing-services-to-applications).
5. Do `git remote add dokku dokku@192.168.1.170:dokku-app1` (replace `192.168.1.170` with actual Dokku server address).
6. Do `git push dokku master`. Once deployment is complete, there will be a link to `http://192.168.1.170:port`.

### App

/ - the only meaningful endpoint
/admin - Spring Boot Admin

