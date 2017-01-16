FROM alpine:3.3
RUN apk add --no-cache mysql mysql-client
RUN /usr/bin/mysql_install_db && \
    mkdir /run/mysqld
COPY config/my.cnf etc/mysql/my.cnf
COPY evolutions /tmp
COPY config/loading.sh /tmp
RUN /bin/sh -c "/bin/chmod +x /tmp/loading.sh"
RUN /bin/sh -c "/tmp/loading.sh"
CMD mysqld