package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BynderSpec extends AnyFlatSpec with Matchers:
  "The Bynder library" should "say hello" in {
    Bynder.message shouldEqual "hello"
  }
