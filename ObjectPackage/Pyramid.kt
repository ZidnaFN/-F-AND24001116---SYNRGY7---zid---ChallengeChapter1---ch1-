package org.example.ObjectPackage

class Pyramid {
    fun makePyramid(x: Int, y: String) {
        var jml = 0

        for (i in 1..x) { // perulangan untuk mencetak spasi disetiap baris
            for (space in 1..x - i) {
                print("  ")
            }

            while (jml != 2 * i - 1) { // perulangan untuk mencetak karakter piramida
                print("$y ")
                ++jml
            }

            println() // untuk mencetak baris setelahnya
            jml = 0 // untuk mereset variabel jml
        }
    }
}
