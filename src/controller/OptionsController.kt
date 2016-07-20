package controller

import com.natpryce.konfig.*
import controller.interfaces.AbnVerifier
import controller.interfaces.ViewChanger
import tornadofx.Controller

// TODO: implement saving to properties file
class OptionsController : ViewChanger, AbnVerifier, Controller() {

    // Property keys
    object business : PropertyGroup() {
        val name by stringType
        val abn by stringType
    }

    // Load config.properties file from resources
    val option = ConfigurationProperties.fromResource("config.properties")

    // Get business name from configuration
    fun getBusinessName() = option[business.name]

    // Get business number from configuration
    fun getAbn() = option[business.abn]
}