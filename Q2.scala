object b{

    def main(args:Array[String]): Unit={
    println("Enter a list of words seperated by spaces: ")
    val input = scala.io.StdIn.readLine()
    val words = input.split(" ").map(_.toString).toList
    val totalLetterCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetterCount")
}

def countLetterOccurrences(words: List[String]) : Int = {
    val totalLetterCount = words.map(_.length).reduce(_+_)
    totalLetterCount
}}