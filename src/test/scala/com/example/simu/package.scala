package com.example

import simulacrum.{ op, typeclass }

package object simu {

  @typeclass
  trait Semigroup[A] {
    @op("|+|") def append(x: A, y: A): A
  }

}
