package xabean.log4s.di

import java.util

import javax.inject.Inject
import org.slf4j.LoggerFactory.getLogger
import org.slf4j.{Logger, Marker}
import xabean.log4s.{Log4sLogger, Target}

import scala.collection.JavaConverters.mapAsScalaMapConverter
/** 日志桥，桥接Java和Scala的API。Java开发请使用此类，Scala开发请移步至[[xabean.log4s.di.components.LoggerComponent]]。
  * @param bindLog4j2 功能与[[xabean.log4s.di.components.Log4j2Component]]一致。
  * @see [[org.slf4j.LoggerFactory#getLogger(Class)]]
  */
final class LoggerBridge(clazz: Class[_], bindLog4j2: Boolean) extends Log4sLogger {
  override protected val mLogger: Logger = if (bindLog4j2) Log4sLogger.mLog4jLoggerFactory
    .getLogger(clazz.getName) else getLogger(clazz)
  if (bindLog4j2) bindLog4j2Warn()
  /** @constructor 可使用Dagger2进行依赖注入。*/
  @Inject def this(clazz: Class[_]) { this(clazz,false) }
  private def javaMap2MutableMap(targetMap: util.Map[Target,_])=mapAsScalaMapConverter(targetMap).asScala
  /** 供后台进行指标采集，监控应用运行状态。
    * @param map Java指标映射集合，将需要采集的指标放入此映射中供后台监控，该映射最终会转换为JSON字符串。
    * @see [[xabean.log4s.Log4sLogger#trace(String)]]
    */
  def trace(map: util.Map[Target,_]) { super.trace(javaMap2MutableMap(map)) }
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(String,Throwable)]]
    */
  def trace(map: util.Map[Target, _], t: Throwable): Unit = super.trace(javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(org.slf4j.Marker,String)]]
    */
  def trace(marker: Marker, map: util.Map[Target, _]): Unit = super.trace(marker, javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#trace(org.slf4j.Marker,String,Throwable)]]
    */
  def trace(marker: Marker, map: util.Map[Target, _], t: Throwable): Unit = super.trace(marker, javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(String)]]
    */
  def debug(map: util.Map[Target, _]): Unit = super.debug(javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(String,Throwable)]]
    */
  def debug(map: util.Map[Target, _], t: Throwable): Unit = super.debug(javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(org.slf4j.Marker,String)]]
    */
  def debug(marker: Marker, map: util.Map[Target, _]): Unit = super.debug(marker, javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#debug(org.slf4j.Marker,String,Throwable)]]
    */
  def debug(marker: Marker, map: util.Map[Target, _], t: Throwable): Unit = super.debug(marker, javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(String)]]
    */
  def info(map: util.Map[Target, _]): Unit = super.info(javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(String,Throwable)]]
    */
  def info(map: util.Map[Target, _], t: Throwable): Unit = super.info(javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(org.slf4j.Marker,String)]]
    */
  def info(marker: Marker, map: util.Map[Target, _]): Unit = super.info(marker, javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#info(org.slf4j.Marker,String,Throwable)]]
    */
  def info(marker: Marker, map: util.Map[Target, _], t: Throwable): Unit = super.info(marker, javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(String)]]
    */
  def warn(map: util.Map[Target, _]): Unit = super.warn(javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(String,Throwable)]]
    */
  def warn(map: util.Map[Target, _], t: Throwable): Unit = super.warn(javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(org.slf4j.Marker,String)]]
    */
  def warn(marker: Marker, map: util.Map[Target, _]): Unit = super.warn(marker, javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#warn(org.slf4j.Marker,String,Throwable)]]
    */
  def warn(marker: Marker, map: util.Map[Target, _], t: Throwable): Unit = super.warn(marker, javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(String)]]
    */
  def error(map: util.Map[Target, _]): Unit = super.error(javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(String,Throwable)]]
    */
  def error(map: util.Map[Target, _], t: Throwable): Unit = super.error(javaMap2MutableMap(map), t)
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(org.slf4j.Marker,String)]]
    */
  def error(marker: Marker, map: util.Map[Target, _]): Unit = super.error(marker, javaMap2MutableMap(map))
  /** @see [[LoggerBridge#trace(java.util.Map)]]
    * @see [[xabean.log4s.Log4sLogger#error(org.slf4j.Marker,String,Throwable)]]
    */
  def error(marker: Marker, map: util.Map[Target, _], t: Throwable): Unit = super.error(marker, javaMap2MutableMap(map), t)
}
