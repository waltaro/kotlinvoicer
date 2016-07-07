package view

import javafx.scene.layout.VBox
import tornadofx.*
import view.style.MainMenuStyle.Companion.mainButton
import view.style.MainMenuStyle.Companion.mainTitle
import view.style.MainMenuStyle.Companion.mainWrapper

class MainMenu : View() {
    override val root = VBox()

    val optionView: OptionView by inject()
    val invoiceView: NewInvoiceView by inject()

    init {
        title = "Kotlinvoicer"

        with(root)
        {
            addClass(mainWrapper)

            borderpane {

                center {

                    // Main title
                    hbox {
                        addClass(mainTitle)
                        text("Kotlinvoicer")
                    }

                    // Buttons
                    hbox {
                        addClass(mainButton)
                        button("New") {
                            setOnAction { replaceWith(invoiceView) }
                        }

                        button("Load") {
                            setOnAction { root }
                        }

                        button("Option") {
                            setOnAction { replaceWith(optionView) }
                        }
                    }
                }
            }

        }
    }
}

