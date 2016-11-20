FROM mysql:8
COPY evolutions /tmp
RUN for f in /tmp/*.sql ; do mysql < ; done

