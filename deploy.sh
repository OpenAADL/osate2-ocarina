set -x

TODIR=/var/www/html/p2/ocarina
rm -fr ${TODIR}
mkdir -p ${TODIR}

cd org.osate.ocarina.repository/target
cp --recursive repository/* ${TODIR}/.
