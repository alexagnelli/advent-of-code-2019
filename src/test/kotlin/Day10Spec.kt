import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Day10Spec : StringSpec({
    "part1" {
        Day10.part1(
            """.#..#
              |.....
              |#####
              |....#
              |...##""".trimMargin()
        ) shouldBe Pair(Pair(3, -4), 8)
        Day10.part1(
            """......#.#.
              |#..#.#....
              |..#######.
              |.#.#.###..
              |.#..#.....
              |..#....#.#
              |#..#....#.
              |.##.#..###
              |##...#..#.
              |.#....####""".trimMargin()
        ) shouldBe Pair(Pair(5, -8), 33)
        Day10.part1(
            """#.#...#.#.
              |.###....#.
              |.#....#...
              |##.#.#.#.#
              |....#.#.#.
              |.##..###.#
              |..#...##..
              |..##....##
              |......#...
              |.####.###.""".trimMargin()
        ) shouldBe Pair(Pair(1, -2), 35)
        Day10.part1(
            """.#..#..###
              |####.###.#
              |....###.#.
              |..###.##.#
              |##.##.#.#.
              |....###..#
              |..#.#..#.#
              |#..#.#.###
              |.##...##.#
              |.....#.#..""".trimMargin()
        ) shouldBe Pair(Pair(6, -3), 41)
        Day10.part1(
            """.#..##.###...#######
              |##.############..##.
              |.#.######.########.#
              |.###.#######.####.#.
              |#####.##.#.##.###.##
              |..#####..#.#########
              |####################
              |#.####....###.#.#.##
              |##.#################
              |#####.##.###..####..
              |..######..##.#######
              |####.##.####...##..#
              |.#####..#.######.###
              |##...#.##########...
              |#.##########.#######
              |.####.#.###.###.#.##
              |....##.##.###..#####
              |.#.#.###########.###
              |#.#.#.#####.####.###
              |###.##.####.##.#..##""".trimMargin()
        ) shouldBe Pair(Pair(11, -13), 210)
    }

    "part2" {
        Day10.part2(
            """.#..##.###...#######
              |##.############..##.
              |.#.######.########.#
              |.###.#######.####.#.
              |#####.##.#.##.###.##
              |..#####..#.#########
              |####################
              |#.####....###.#.#.##
              |##.#################
              |#####.##.###..####..
              |..######..##.#######
              |####.##.####...##..#
              |.#####..#.######.###
              |##...#.##########...
              |#.##########.#######
              |.####.#.###.###.#.##
              |....##.##.###..#####
              |.#.#.###########.###
              |#.#.#.#####.####.###
              |###.##.####.##.#..##""".trimMargin(),
            Pair(11, -13)
        ) shouldBe 802
    }

    "answer" {
        val program = Resources.read(10)

        val answer = Day10.part1(program)
        answer shouldBe Pair(Pair(20, -18), 280)
        val answer2 = Day10.part2(program, Pair(20, -18))
        answer2 shouldBe 706

        AnswerPrinter.print(this, answer, answer2)
    }

})