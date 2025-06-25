#!/bin/bash

docker run -d \
  -e MYSQL_ALLOW_EMPTY_PASSWORD=true \
  -e MYSQL_USER=grepp_app_1 \
  -e MYSQL_PASSWORD=grepp_app_1! \
  -e MYSQL_DATABASE=grepp_exp_db \
  --network net_1 \
  -p 3306:3306 \
  --name grepp-db \
  mysql
;