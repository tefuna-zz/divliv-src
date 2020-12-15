#!/bin/bash

###########################################################
SCRIPT_DIR=$(cd $(dirname $0); pwd)
cd ${SCRIPT_DIR}


###########################################################
PG_USER="postgres"
PG_DB="pfmdb"


###########################################################
# create table
#
for file in $(find create_table -type f | grep -v .git)
do
    echo "${file}"
    psql -U ${PG_USER} -d ${PG_DB} -f ${file} -v ON_ERROR_STOP=1
    if [ 0 -ne ${?} ]; then
        echo "failed in create table: ${file}"
        exit -1
    fi
done 

###########################################################
# create sequence
#
for file in $(find create_sequence -type f | grep -v .git)
do
    echo "${file}"
    psql -U ${PG_USER} -d ${PG_DB} -f ${file} -v ON_ERROR_STOP=1
    if [ 0 -ne ${?} ]; then
        echo "failed in create sequence: ${file}"
        exit -1
    fi
done 

echo "complete."
exit 0
