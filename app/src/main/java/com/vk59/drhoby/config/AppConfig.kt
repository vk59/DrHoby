package com.vk59.drhoby.config

import com.vk59.drhoby.model.Hobby

class AppConfig {
    companion object {
        val hobbiesList: ArrayList<Hobby> = arrayListOf(
            Hobby("Плавание", "Плавать круто"),
            Hobby("Сноуборд", "Кататься на сноуборде круто"),
            Hobby("Играть на гитаре", "Играть на гитаре круто")
        )
    }
}