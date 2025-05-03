class MyStack {

    private val list = mutableListOf<Int>()

    fun push(x:Int){
        list.add(x)
    }

    fun pop():Int? {
        if (list.isNotEmpty()){
            return list.removeAt(list.size-1)
        }
        return null
    }

    fun peek():Int?{
            return list.lastOrNull()
    }

    fun isEmpty(): Boolean{
        if (list.isEmpty()) return true
        return false
    }

    fun size():Int{
        return list.size
    }

}