#export lib_path=/home/hanko/workspace/deegreebase/lib


#/usr/local/java/j2sdk1.5-sun/bin/java -Xms100m -Xmx300m -cp .:/home/hanko/workspace/deegreebase/classes:/home/hanko/workspace/deegreebase/lib/jts/jts-1.8.jar:/home/hanko/workspace/deegreebase/lib/xml/jaxen-1.1-beta-8.jar:/home/hanko/workspace/deegreebase/lib/log4j/log4j-1.2.9.jar:hsqldb.jar org.deegree.tools.shape.GenericSQLShapeImporter -driver org.hsqldb.jdbcDriver -url jdbc:hsqldb:administration -user sa -password "" -indexName SGID024_MUNICIPALITIES2004_EDITED_IDX -table SGID024_MUNICIPALITIES2004_EDITED -shapeFile ../SGID024_Municipalities2004_edited -maxTreeDepth 3 -idType INTEGER
/usr/local/java/j2sdk1.5-sun/bin/java -Xms100m -Xmx300m -cp .:/home/hanko/workspace/deegreebase/classes:/home/hanko/workspace/deegreebase/lib/jts/jts-1.8.jar:/home/hanko/workspace/deegreebase/lib/xml/jaxen-1.1-beta-8.jar:/home/hanko/workspace/deegreebase/lib/log4j/log4j-1.2.9.jar:hsqldb.jar org.deegree.tools.shape.GenericSQLShapeImporter -driver org.hsqldb.jdbcDriver -url jdbc:hsqldb:administration -user sa -password "" -indexName SGID100_COUNTYBOUNDARIES_EDITED_IDX -table SGID100_COUNTYBOUNDARIES_EDITED -shapeFile ../SGID100_CountyBoundaries_edited -maxTreeDepth 3 -idType INTEGER
/usr/local/java/j2sdk1.5-sun/bin/java -Xms100m -Xmx300m -cp .:/home/hanko/workspace/deegreebase/classes:/home/hanko/workspace/deegreebase/lib/jts/jts-1.8.jar:/home/hanko/workspace/deegreebase/lib/xml/jaxen-1.1-beta-8.jar:/home/hanko/workspace/deegreebase/lib/log4j/log4j-1.2.9.jar:hsqldb.jar org.deegree.tools.shape.GenericSQLShapeImporter -driver org.hsqldb.jdbcDriver -url jdbc:hsqldb:administration -user sa -password "" -indexName SGID500_ZIPCODES_IDX -table SGID500_ZIPCODES -shapeFile ../SGID500_ZipCodes -maxTreeDepth 3 -idType INTEGER
/usr/local/java/j2sdk1.5-sun/bin/java -Xms100m -Xmx300m -cp .:/home/hanko/workspace/deegreebase/classes:/home/hanko/workspace/deegreebase/lib/jts/jts-1.8.jar:/home/hanko/workspace/deegreebase/lib/xml/jaxen-1.1-beta-8.jar:/home/hanko/workspace/deegreebase/lib/log4j/log4j-1.2.9.jar:hsqldb.jar org.deegree.tools.shape.GenericSQLShapeImporter -driver org.hsqldb.jdbcDriver -url jdbc:hsqldb:administration -user sa -password "" -indexName SGID024_STATEBOUNDARY_IDX -table SGID024_STATEBOUNDARY -shapeFile ../SGID024_StateBoundary -maxTreeDepth 3 -idType INTEGER
#pause