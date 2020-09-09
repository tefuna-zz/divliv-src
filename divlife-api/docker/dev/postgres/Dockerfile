FROM postgres:12.4

LABEL maintainer="tefuna@gmail.com"

# set encoding. specify in docker-compose.yml.
ARG DB_LANG=en_US
RUN localedef -i ${DB_LANG} -c -f UTF-8 -A /usr/share/locale/locale.alias ${DB_LANG}.UTF-8
ENV LANG ${DB_LANG}.utf8
ENV TZ='Asia/Tokyo'
