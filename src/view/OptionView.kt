package view

import controller.OptionsController
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import tornadofx.*
import view.style.OptionStyle.Companion.optionTitle
import view.style.OptionStyle.Companion.mainWrapper

class OptionView : View() {

    override val root = GridPane()
    val mainMenuView: MainMenu by inject()

    var businessNameField: TextField by singleAssign()
    var abnNumField: TextField by singleAssign()

    val optionController: OptionsController by inject()

    init {

        with(root) {

            addClass(mainWrapper)

            // Main title
            text("Option") {
                addClass(optionTitle)

                gridpaneConstraints {
                    columnRowIndex(0,0)
                    marginBottom = 10.0
                    columnSpan = 2
                }
            }

            // Name field
            label("Name :") {

                gridpaneConstraints {
                    columnRowIndex(0,1)
                    marginBottom = 10.0
                }
            }

            // Text field for entering in user business name
            businessNameField = textfield() {

                // Set text to the configure business name
                text = optionController.getBusinessName()

                gridpaneConstraints {
                    columnRowIndex(1,1)
                    marginBottom = 10.0
                }
            }

            // ABN # field
            label("ABN # :") {

                gridpaneConstraints {
                    columnRowIndex(0,2)
                    marginBottom = 10.0
                }
            }

            // Text field for entering in user ABN
            abnNumField = textfield() {

                // Set text to the configured abn
                text = optionController.getAbn()

                gridpaneConstraints {
                    columnRowIndex(1,2)
                    marginBottom = 10.0
                }
            }

            // Buttons
            button("Save") {

                // TODO: Save to properties file, disable if fields are blank
                setOnAction { println("Name: ${businessNameField.text}\nABN: ${abnNumField.text}") }

                gridpaneConstraints {
                    columnRowIndex(0,3)
                    marginRight = 10.0
                }
            }

            // Returns user back to the main menu
            button("Back") {
                setOnAction { optionController.changeView(mainMenuView) }

                gridpaneConstraints {
                    columnRowIndex(1,3)
                }
            }
        }
    }
}