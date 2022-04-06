
    fun weightCapacity(weights: Array<Int>, maxCapacity: Int): Int {
        val array = Array(weights.size) { IntArray(maxCapacity + 1) }

        //initialize the first line
        for (i in 0..maxCapacity) {
            if (i < weights[0]) array[0][i] = 0 else array[0][i] = weights[0]
        }

        for (i in 1 until weights.size) {
            for (j in 0..maxCapacity) {
                if (j < weights[i]) array[i][j] = array[i - 1][j] else {
                    array[i][j] = (array[i - 1][j - weights[i]] + weights[i]).coerceAtLeast(array[i - 1][j])
                }
            }
        }
        return array[weights.size - 1][maxCapacity]
    }
