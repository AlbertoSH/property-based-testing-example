package com.adidas.sanzalb.testingday

import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class ClassToBeTestedSpec: StringSpec() {

    init { ClassToBeTested().run {

        "Sum is commutative" {
            forAll { x: Int, y: Int ->
                sum(x, y) == sum(y, x)
            }
        }

        "Sum is associative" {
            forAll { x: Int, y: Int, z: Int ->
                sum(sum(x, y), z) == sum(x, sum(y, z))
            }
        }

        "Sum's neutral element is 0" {
            forAll { x: Int ->
                sum(x, 0) == x
            }
        }

        "Adding 1 two times is the same as adding 2 once" {
            forAll { x: Int ->
                sum(sum(x, 1), 1) == sum(x, 2)
            }
        }

    } }
}