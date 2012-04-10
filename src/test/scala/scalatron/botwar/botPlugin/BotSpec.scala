package scalatron.botwar.botPlugin

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.ShouldMatchers

class BotSpec extends FunSpec with BeforeAndAfter with ShouldMatchers {

  val welcome = "Welcome(name=player1,path=.,apocalypse=500,round=0)"
  val react = "React(entity=Master,time=10,view=___ss___,energy=1000)"
  var bot: Bot = _

  before {
    bot = new Bot
  }

  describe("A Bot") {

    it("should respond with an empty String when recieving Welcome command") {
      bot.respond(welcome) should be('empty)
    }

    it("should respond with a Opcode when recieving React command") {
      bot.respond(react) should not be ('empty)
    }

  }
}