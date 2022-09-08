package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class $name;format="Camel"$Spec extends AnyFlatSpec with Matchers {
  "$name$" should "say hello" in {
    $name;format="Camel"$.message shouldEqual "hello"
  }
}
