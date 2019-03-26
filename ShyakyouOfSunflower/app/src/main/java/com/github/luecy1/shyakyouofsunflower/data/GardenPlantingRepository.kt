package com.github.luecy1.shyakyouofsunflower.data

class GardenPlantingRepository private constructor(
// DAOを受け取る
) {

    // fun getGardenPlantings() =

    companion object {

        @Volatile
        private var instance: GardenPlantingRepository? = null

        // TODO Daoを引数として受け取る
        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: GardenPlantingRepository().also { instance = it }
            }
    }
}
