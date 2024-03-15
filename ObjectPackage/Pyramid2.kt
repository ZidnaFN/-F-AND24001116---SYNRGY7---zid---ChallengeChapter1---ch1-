package org.example.ObjectPackage

class Pyramid2 {
    fun makePyramid2(x: Int, y: String) {
        var jml2 = 0

        for (i in x downTo 1) { // perulangan untuk mencetak spasi disetiap baris
            for (space in 1..x - i) {
                print("  ")
            }

            while (jml2 != 2 * i - 1) { // perulangan untuk mencetak karakter piramida
                print("$y ")
                ++jml2
            }

            println() // untuk mencetak baris setelahnya
            jml2 = 0 // untuk mereset variabel jml2
        }
    }
}