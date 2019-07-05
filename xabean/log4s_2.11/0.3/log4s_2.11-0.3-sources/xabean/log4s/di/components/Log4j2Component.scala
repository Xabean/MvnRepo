package xabean.log4s.di.components

import org.slf4j.Logger
import xabean.log4s.Log4sLogger

/** 硬绑定Log4j2，如需强制绑定可依赖注入此组件。
  * @deprecated 不建议硬绑定，这将失去SLF4J的灵活性，并造成一定程度的性能损失。
  */
trait Log4j2Component extends LoggerComponent {
  @deprecated("请直接使用混入得到的方法执行！")
  override protected val mLogger: Logger =Log4sLogger.mLog4jLoggerFactory
    .getLogger(getClass.getName)
  bindLog4j2Warn()
}
