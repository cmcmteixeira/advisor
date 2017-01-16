#!/usr/bin/env sh
set -x
mysqld&
MYSQL=$!
until ( mysqladmin -h 127.0.0.1 status ) do
  echo "waiting..."
  sleep 1
done

for f in /tmp/*.sql
do
	echo "Loading File: - $f"
    mysql -h 127.0.0.1 < $f
done
kill -15 $MYSQL

