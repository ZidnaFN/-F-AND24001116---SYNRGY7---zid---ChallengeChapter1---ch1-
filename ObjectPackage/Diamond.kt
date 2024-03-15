package org.example.ObjectPackage

class Diamond {
    fun makeDiamond(x: Int, y: String) {
        var jml = 0
        var tinggi = x - (x/2)
        for (i in 1..x) {
            for (space in 1..x - i) {
                print("  ")
            }

            while (jml != 2 * i - 1) {
                print("$y ")
                ++jml
            }

            println()
            jml = 0
        }

        for (i in x - 1 downTo 1) {
            for (space in 1..x - i) {
                print("  ")
            }

            var jml = 0

            while (jml != 2 * i - 1) {
                print("$y ")
                ++jml
            }

            println()
            jml = 0
        }
    }
}