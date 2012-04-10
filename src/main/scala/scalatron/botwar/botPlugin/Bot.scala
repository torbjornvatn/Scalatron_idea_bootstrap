package scalatron.botwar.botPlugin

class ControlFunctionFactory {
	def create = new Bot().respond _
}

class Bot {
	var n = 0

	def respond(input: String) = {
		val tokens = input.split('(') // split at '(', returns Array[String]
		tokens(0) match {
//			case "React" => "Move(dx=1,dy=0)"
			case "React" => "Say(text=hooooi)"
			case _ => ""
		}
	}
}