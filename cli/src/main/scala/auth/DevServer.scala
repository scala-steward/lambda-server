package funstack.local.auth

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.JSConverters._

@js.native
@JSImport("./oidc-server", JSImport.Namespace)
private object OidcServer extends js.Object {
  def start(port: Int): Unit = js.native
}

object AuthMock {
  def getEmailForUser(sub: String): String = s"$sub@localhost" // same as email in oidc-server/index.js
}

object DevServer {
  import js.Dynamic.{global => g}

  def start(port: Int): Unit = OidcServer.start(port)
}
