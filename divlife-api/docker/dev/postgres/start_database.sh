#!/bin/bash
docker run -d --name postgres_12.4 -e POSTGRES_PASSWORD=postgres -p 5432:5432 postgres:12.4
