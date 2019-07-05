package xabean.log4s

/** 要统一采集的各项指标枚举。
  * @note 使用时导入该枚举类的所有成员！
  * @author Xabean
  * @version 0.0
  */
@deprecated("后续不在维护，统一使用Java枚举类Target。")
private object TargetEnumeration extends Enumeration {
  type Target = Value
  val 批次大小,处理时长=Value
}
