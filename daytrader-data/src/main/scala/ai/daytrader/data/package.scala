package ai.daytrader

package object data {

  sealed trait Model{}

  final case class Tick(time: Long, price: Double, volume: Double) extends Model
  final case class SymTick(sym: String, time: Long, price: Double, volume: Double) extends Model

}
