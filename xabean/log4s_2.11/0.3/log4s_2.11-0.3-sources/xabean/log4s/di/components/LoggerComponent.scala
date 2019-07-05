package xabean.log4s.di.components

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import xabean.log4s.Log4sLogger

/** Scala开发请直接混入此日志组件实现依赖注入。 */
trait LoggerComponent extends Log4sLogger {
  @deprecated("请直接使用混入得到的方法执行！")
  override protected val mLogger: Logger =getLogger(getClass)
}
