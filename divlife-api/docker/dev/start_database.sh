#!/bin/bash
# docker run -d --name postgres_12.4 -e POSTGRES_PASSWORD=postgres -p 5432:5432 postgres:12.4
export POSTGRES_USER=postgres
export POSTGRES_PASSWORD=postgres
docker-compose up -d --build

# # build docker image
# docker-compose build --no-cache

# # build docker image and run docker container
# docker-compose up -d --build

# # stop container
# docker-compose stop

# # stop and remove container
# docker-compose down

# # see container logs with timestamp.
# docker-compose logs -f --tail-"S" -t
