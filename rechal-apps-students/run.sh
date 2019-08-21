#!/bin/bash
# 主目录
export IDCS_HOME=/Data/apps/idcs

case "$1" in
 start)
      echo ""
		# 设置启动变量并指定日志输出目标
      set JAVA_OPTS=%JAVA_OPTS% 
      java -Dfile.encoding=UTF-8 -jar $IDCS_HOME/bin/StuManager.jar & echo $! > $IDCS_HOME/server.pid
      ;;

 stop)
      kill `cat $IDCS_HOME/server.pid`
      rm -rf $IDCS_HOME/server.pid
      ;;

 restart)
      $0 stop
      sleep 1
      $0 start
      ;;

 *)   
      echo "error parameter --> "$1
      echo "Usage: run.sh {start|stop|restart}"
      ;;

esac

exit 0
