# kindlenews
A website that downloads news and sends it to your kindle 
currently running on: http://www.mykindlenews.com

Templates and currently other web things are found in /src/main/resources
code is in src/main/java/com/davidm/mykindlenews

the transformation from webpage to kindle format is done by calibre (an open source program) using a combination of custom and public recipes.
Spark (backed by jetty) is used as the webserver
Guice for dependency injection
Lombok to remove boilerplate
JOOQ for typesafe database interaction
