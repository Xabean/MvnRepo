package xabean.log4s

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.apache.logging.slf4j.Log4jLoggerFactory
import org.slf4j.{Logger, Marker}

import scala.collection.mutable

/** @author Xabean
  * @version 0.2
  * @see 项目地址：[[https://gitee.com/Bingeneral/MvnRepo]]
  */
private[log4s] trait Log4sLogger {
  protected val mLogger: Logger
  //  =getLogger(getClass)
  private val mMapper=new ObjectMapper
  mMapper.registerModule(DefaultScalaModule)
  protected def bindLog4j2Warn() { warn("已强制绑定Log4j 2！") }
  private def writeValueIfEnabled(enable: Boolean,map: mutable.Map[Target,_])=if (enable) mMapper.writeValueAsString(map) else null
  /** @see [[org.slf4j.Logger#isTraceEnabled]] */
  private def isTraceEnabled: Boolean=mLogger.isTraceEnabled
  /** @see [[org.slf4j.Logger#trace]] */
  def trace(msg: String): Unit=mLogger.trace(msg)
  /** 供后台进行指标采集，监控应用运行状态。
    * @param map 指标映射集合，将需要采集的指标放入此映射中供后台监控，为兼容Java映射采用可变集合，该映射最终会转换为JSON字符串。
    * @see [[xabean.log4s.Log4sLogger#trace(String)]]
    */
  protected def trace(map: mutable.Map[Target,_]): Unit = trace(writeValueIfEnabled(isTraceEnabled,map))
  /** @see [[org.slf4j.Logger#trace(String,Object)]] */
  def trace(format: String, arg: Any): Unit=mLogger.trace(format,arg)
  /** @see [[org.slf4j.Logger#trace(String,Object,Object)]] */
  def trace(format: String, arg1: Any, arg2: Any) { mLogger.trace(format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#trace(String,Object...)]] */
  def trace(format: String, arguments: Any*) { mLogger.trace(format,arguments) }
  /** @see [[org.slf4j.Logger#trace(String,Throwable)]] */
  def trace(msg: String, t: Throwable): Unit=mLogger.trace(msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(String,Throwable)]]
    */
  protected def trace(map: mutable.Map[Target,_], t: Throwable): Unit=trace(writeValueIfEnabled(isTraceEnabled,map),t)
  /** @see [[org.slf4j.Logger#isTraceEnabled(org.slf4j.Marker)]] */
  private def isTraceEnabled(marker: Marker): Boolean=mLogger.isTraceEnabled(marker)
  /** @see [[org.slf4j.Logger#trace(org.slf4j.Marker,String)]] */
  def trace(marker: Marker, msg: String): Unit=mLogger.trace(marker,msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(org.slf4j.Marker,String)]]
    */
  protected def trace(marker: Marker, map: mutable.Map[Target,_]): Unit=trace(marker,writeValueIfEnabled(isTraceEnabled(marker),map))
  /** @see [[org.slf4j.Logger#trace(org.slf4j.Marker,String,Object)]] */
  def trace(marker: Marker, format: String, arg: Any): Unit=mLogger.trace(marker,format,arg)
  /** @see [[org.slf4j.Logger#trace(org.slf4j.Marker,String,Object,Object)]] */
  def trace(marker: Marker, format: String, arg1: Any, arg2: Any) { mLogger.trace(marker,format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#trace(org.slf4j.Marker,String,Object...)]] */
  def trace(marker: Marker, format: String, argArray: Any*) { mLogger.trace(marker,format,argArray) }
  /** @see [[org.slf4j.Logger#trace(org.slf4j.Marker,String,Throwable)]] */
  def trace(marker: Marker, msg: String, t: Throwable): Unit=mLogger.trace(marker,msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(org.slf4j.Marker,String,Throwable)]]
    */
  protected def trace(marker: Marker, map: mutable.Map[Target,_], t: Throwable): Unit=trace(marker,writeValueIfEnabled(isTraceEnabled(marker),map),t)
  /** @see [[org.slf4j.Logger#isDebugEnabled]] */
  private def isDebugEnabled: Boolean=mLogger.isDebugEnabled
  /** @see [[org.slf4j.Logger#debug]] */
  def debug(msg: String): Unit=mLogger.debug(msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(String)]]
    */
  protected def debug(map: mutable.Map[Target,_]): Unit = debug(writeValueIfEnabled(isDebugEnabled,map))
  /** @see [[org.slf4j.Logger#debug(String,Object)]] */
  def debug(format: String, arg: Any): Unit=mLogger.debug(format,arg)
  /** @see [[org.slf4j.Logger#debug(String,Object,Object)]] */
  def debug(format: String, arg1: Any, arg2: Any) { mLogger.debug(format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#debug(String,Object...)]] */
  def debug(format: String, arguments: Any*) { mLogger.debug(format,arguments) }
  /** @see [[org.slf4j.Logger#debug(String,Throwable)]] */
  def debug(msg: String, t: Throwable): Unit=mLogger.debug(msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(String,Throwable)]]
    */
  protected def debug(map: mutable.Map[Target,_], t: Throwable): Unit=debug(writeValueIfEnabled(isDebugEnabled,map),t)
  /** @see [[org.slf4j.Logger#isDebugEnabled(org.slf4j.Marker)]] */
  private def isDebugEnabled(marker: Marker): Boolean=mLogger.isDebugEnabled(marker)
  /** @see [[org.slf4j.Logger#debug(org.slf4j.Marker,String)]] */
  def debug(marker: Marker, msg: String): Unit=mLogger.debug(marker,msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(org.slf4j.Marker,String)]]
    */
  protected def debug(marker: Marker, map: mutable.Map[Target,_]): Unit=debug(marker,writeValueIfEnabled(isDebugEnabled(marker),map))
  /** @see [[org.slf4j.Logger#debug(org.slf4j.Marker,String,Object)]] */
  def debug(marker: Marker, format: String, arg: Any): Unit=mLogger.debug(marker,format,arg)
  /** @see [[org.slf4j.Logger#debug(org.slf4j.Marker,String,Object,Object)]] */
  def debug(marker: Marker, format: String, arg1: Any, arg2: Any) { mLogger.debug(marker,format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#debug(org.slf4j.Marker,String,Object...)]] */
  def debug(marker: Marker, format: String, arguments: Any*) { mLogger.debug(marker,format,arguments) }
  /** @see [[org.slf4j.Logger#debug(org.slf4j.Marker,String,Throwable)]] */
  def debug(marker: Marker, msg: String, t: Throwable): Unit=mLogger.debug(marker,msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(org.slf4j.Marker,String,Throwable)]]
    */
  protected def debug(marker: Marker, map: mutable.Map[Target,_], t: Throwable): Unit=debug(marker,writeValueIfEnabled(isDebugEnabled(marker),map),t)
  /** @see [[org.slf4j.Logger#isInfoEnabled]] */
  private def isInfoEnabled: Boolean=mLogger.isInfoEnabled
  /** @see [[org.slf4j.Logger#info]] */
  def info(msg: String): Unit=mLogger.info(msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(String)]]
    */
  protected def info(map: mutable.Map[Target,_]): Unit = info(writeValueIfEnabled(isInfoEnabled,map))
  /** @see [[org.slf4j.Logger#info(String,Object)]] */
  def info(format: String, arg: Any): Unit=mLogger.info(format,arg)
  /** @see [[org.slf4j.Logger#info(String,Object,Object)]] */
  def info(format: String, arg1: Any, arg2: Any) { mLogger.info(format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#info(String,Object...)]] */
  def info(format: String, arguments: Any*) { mLogger.info(format,arguments) }
  /** @see [[org.slf4j.Logger#info(String,Throwable)]] */
  def info(msg: String, t: Throwable): Unit=mLogger.info(msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(String,Throwable)]]
    */
  protected def info(map: mutable.Map[Target,_], t: Throwable): Unit=info(writeValueIfEnabled(isInfoEnabled,map),t)
  /** @see [[org.slf4j.Logger#isInfoEnabled(org.slf4j.Marker)]] */
  private def isInfoEnabled(marker: Marker): Boolean=mLogger.isInfoEnabled(marker)
  /** @see [[org.slf4j.Logger#info(org.slf4j.Marker,String)]] */
  def info(marker: Marker, msg: String): Unit=mLogger.info(marker,msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(org.slf4j.Marker,String)]]
    */
  protected def info(marker: Marker, map: mutable.Map[Target,_]): Unit=info(marker,writeValueIfEnabled(isInfoEnabled(marker),map))
  /** @see [[org.slf4j.Logger#info(org.slf4j.Marker,String,Object)]] */
  def info(marker: Marker, format: String, arg: Any): Unit=mLogger.info(marker,format,arg)
  /** @see [[org.slf4j.Logger#info(org.slf4j.Marker,String,Object,Object)]] */
  def info(marker: Marker, format: String, arg1: Any, arg2: Any) { mLogger.info(marker,format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#info(org.slf4j.Marker,String,Object...)]] */
  def info(marker: Marker, format: String, arguments: Any*) { mLogger.info(marker,format,arguments) }
  /** @see [[org.slf4j.Logger#info(org.slf4j.Marker,String,Throwable)]] */
  def info(marker: Marker, msg: String, t: Throwable): Unit=mLogger.info(marker,msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(org.slf4j.Marker,String,Throwable)]]
    */
  protected def info(marker: Marker, map: mutable.Map[Target,_], t: Throwable): Unit=info(marker,writeValueIfEnabled(isInfoEnabled(marker),map),t)
  /** @see [[org.slf4j.Logger#isWarnEnabled]] */
  private def isWarnEnabled: Boolean=mLogger.isWarnEnabled
  /** @see [[org.slf4j.Logger#warn]] */
  def warn(msg: String): Unit=mLogger.warn(msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(String)]]
    */
  protected def warn(map: mutable.Map[Target,_]): Unit = warn(writeValueIfEnabled(isWarnEnabled,map))
  /** @see [[org.slf4j.Logger#warn(String,Object)]] */
  def warn(format: String, arg: Any): Unit=mLogger.warn(format,arg)
  /** @see [[org.slf4j.Logger#warn(String,Object,Object)]] */
  def warn(format: String, arg1: Any, arg2: Any) { mLogger.warn(format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#warn(String,Object...)]] */
  def warn(format: String, arguments: Any*) { mLogger.warn(format,arguments) }
  /** @see [[org.slf4j.Logger#warn(String,Throwable)]] */
  def warn(msg: String, t: Throwable): Unit=mLogger.warn(msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(String,Throwable)]]
    */
  protected def warn(map: mutable.Map[Target,_], t: Throwable): Unit=warn(writeValueIfEnabled(isWarnEnabled,map),t)
  /** @see [[org.slf4j.Logger#isWarnEnabled(org.slf4j.Marker)]] */
  private def isWarnEnabled(marker: Marker): Boolean=mLogger.isWarnEnabled(marker)
  /** @see [[org.slf4j.Logger#warn(org.slf4j.Marker,String)]] */
  def warn(marker: Marker, msg: String): Unit=mLogger.warn(marker,msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(org.slf4j.Marker,String)]]
    */
  protected def warn(marker: Marker, map: mutable.Map[Target,_]): Unit=warn(marker,writeValueIfEnabled(isWarnEnabled(marker),map))
  /** @see [[org.slf4j.Logger#warn(org.slf4j.Marker,String,Object)]] */
  def warn(marker: Marker, format: String, arg: Any): Unit=mLogger.warn(marker,format,arg)
  /** @see [[org.slf4j.Logger#warn(org.slf4j.Marker,String,Object,Object)]] */
  def warn(marker: Marker, format: String, arg1: Any, arg2: Any) { mLogger.warn(marker,format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#warn(org.slf4j.Marker,String,Object...)]] */
  def warn(marker: Marker, format: String, arguments: Any*) { mLogger.warn(marker,format,arguments) }
  /** @see [[org.slf4j.Logger#warn(org.slf4j.Marker,String,Throwable)]] */
  def warn(marker: Marker, msg: String, t: Throwable): Unit=mLogger.warn(marker,msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(org.slf4j.Marker,String,Throwable)]]
    */
  protected def warn(marker: Marker, map: mutable.Map[Target,_], t: Throwable): Unit=warn(marker,writeValueIfEnabled(isWarnEnabled(marker),map),t)
  /** @see [[org.slf4j.Logger#isErrorEnabled]] */
  private def isErrorEnabled: Boolean=mLogger.isErrorEnabled
  /** @see [[org.slf4j.Logger#error]] */
  def error(msg: String): Unit=mLogger.error(msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(String)]]
    */
  protected def error(map: mutable.Map[Target,_]): Unit = error(writeValueIfEnabled(isErrorEnabled,map))
  /** @see [[org.slf4j.Logger#error(String,Object)]] */
  def error(format: String, arg: Any): Unit=mLogger.error(format,arg)
  /** @see [[org.slf4j.Logger#error(String,Object,Object)]] */
  def error(format: String, arg1: Any, arg2: Any) { mLogger.error(format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#error(String,Object...)]] */
  def error(format: String, arguments: Any*) { mLogger.error(format,arguments) }
  /** @see [[org.slf4j.Logger#error(String,Throwable)]] */
  def error(msg: String, t: Throwable): Unit=mLogger.error(msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(String,Throwable)]]
    */
  protected def error(map: mutable.Map[Target,_], t: Throwable): Unit=error(writeValueIfEnabled(isErrorEnabled,map),t)
  /** @see [[org.slf4j.Logger#isErrorEnabled(org.slf4j.Marker)]] */
  private def isErrorEnabled(marker: Marker): Boolean=mLogger.isErrorEnabled(marker)
  /** @see [[org.slf4j.Logger#error(org.slf4j.Marker,String)]] */
  def error(marker: Marker, msg: String): Unit=mLogger.error(marker,msg)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(org.slf4j.Marker,String)]]
    */
  protected def error(marker: Marker, map: mutable.Map[Target,_]): Unit=error(marker,writeValueIfEnabled(isErrorEnabled(marker),map))
  /** @see [[org.slf4j.Logger#error(org.slf4j.Marker,String,Object)]] */
  def error(marker: Marker, format: String, arg: Any): Unit=mLogger.error(marker,format,arg)
  /** @see [[org.slf4j.Logger#error(org.slf4j.Marker,String,Object,Object)]] */
  def error(marker: Marker, format: String, arg1: Any, arg2: Any) { mLogger.error(marker,format,arg1,arg2) }
  /** @see [[org.slf4j.Logger#error(org.slf4j.Marker,String,Object...)]] */
  def error(marker: Marker, format: String, arguments: Any*) { mLogger.error(marker,format,arguments) }
  /** @see [[org.slf4j.Logger#error(org.slf4j.Marker,String,Throwable)]] */
  def error(marker: Marker, msg: String, t: Throwable): Unit=mLogger.error(marker,msg,t)
  /** @see [[xabean.log4s.Log4sLogger#trace(scala.collection.mutable.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(org.slf4j.Marker,String,Throwable)]]
    */
  protected def error(marker: Marker, map: mutable.Map[Target,_], t: Throwable): Unit=error(marker,writeValueIfEnabled(isErrorEnabled(marker),map),t)
}
private[log4s] object Log4sLogger { final val mLog4jLoggerFactory=new Log4jLoggerFactory }