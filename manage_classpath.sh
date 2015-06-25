# These guys must be present in my classpath...
export CLASSPATH=/home/maez/Development/javasrc/classes/darwinsys-api.jar

# Now a for loop, testing for .jar/.zip or [ -d ... ]
OPT_JARS="$HOME/Development/javasrc/lib $HOME/Development/javasrc/lib/*.jar
		${JAVAHOME}/jre/lib/ext/*.jar
		/usr/local/jars/antlr-3.2.0"

for thing in $OPT_JARS
do
	if [ -f $thing ]; then	# must be either a file
		CLASSPATH="$CLASSPATH:$thing"
	else if [ -d $thing ]; then # or a directory
		CLASSPATH="$CLASSPATH:$thing"
	fi
done
CLASSPATH="$CLASSPATH:."
