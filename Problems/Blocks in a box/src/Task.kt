class Block(val color: String) {

    object DimProperties {
        var length: Int = 1
        var width: Int = 1

        fun blocksInBox(lengthBox: Int, widthBox: Int) =
                lengthBox / length * (widthBox / width)


    }
}