package view

import controller.OptionsController
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import tornadofx.*
import view.style.OptionStyle
import view.style.OptionStyle.Companion.mainWrapper

class OptionView : View() {

    override val root = BorderPane()
    val mainMenuView: MainMenu by inject()

    var businessNameField: TextField by singleAssign()
    var abnNumField: TextField by singleAssign()

    val optionController: OptionsController by inject()

    init {
        importStylesheet(OptionStyle::class)

        with(root) {

            addClass(mainWrapper)

            center {

                form {
                    // TODO: should set default text to values found in properties file
                    fieldset("Business Info") {

                        field("Name: ") {
                            businessNameField = textfield() {

                            }
                        }

                        field("ABN #: ") {
                            abnNumField = textfield() {

                            }
                        }
                    }

                    hbox {
                        // TODO: Save to properties file, disable if fields are blank
                        button("Save") {
                            setOnAction { println("Name: ${businessNameField.text}\nABN: ${abnNumField.text}")}
                        }

                        // Returns user back to the main menu
                        button("Back") {
                            setOnAction { optionController.changeView(mainMenuView)}
                        }
                    }
                }
            }
        }
    }
}