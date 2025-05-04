class `medium - MinStack`() {

    val mylist= mutableListOf<Int>()
    val minimum = mutableListOf<Int>()

    fun push(`val`: Int) {
        if (minimum.isEmpty() || minimum.last() >= `val`) minimum.add(`val`)
        mylist.add(`val`)
    }

    fun pop() {

        val popped = mylist.removeLast()
        if (popped == minimum.last()) minimum.removeLast()

    }

    fun top(): Int {
        return mylist.last()
    }

    fun getMin(): Int {
        return minimum.last()
    }

}