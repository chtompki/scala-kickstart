/*
 * Copyright 2017 Scala User Group Düsseldorf
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scaladus.funsets

import org.scalatest.{Matchers, WordSpec}
import org.scaladus.funsets.FunSets._

class FunSetsSpec extends WordSpec with Matchers {

  "A functional Set" when {

    "empty" should {
      "not contain elements" in {
        contains(emptySet, 19) shouldBe false
      }
    }

  }

}
