package view

import javafx.geometry.Pos
import javafx.scene.layout.BorderPane
import tornadofx.*
import view.style.MainMenuStyle.Companion.mainButton
import view.style.MainMenuStyle.Companion.mainSeparator
import view.style.MainMenuStyle.Companion.mainTitle
import view.style.MainMenuStyle.Companion.mainWrapper

class MainMenu : View() {
    override val root = BorderPane()

    val optionView: OptionView by inject()
    val invoiceView: NewInvoiceView by inject()

    init {
        title = "Kotlinvoicer"

        with(root)
        {
            addClass(mainWrapper)

            center {

                // Main title
                hbox {
                    addClass(mainTitle)
                    text("Kotlinvoicer")
                }

                // Separator
                hbox {
                    addClass(mainSeparator)
                    separator().setMinSize(200.0,0.0)
                }

                // Buttons
                hbox {
                    addClass(mainButton)

                    // Change view to new invoice view
                    button("New") {
                        setOnAction { replaceWith(invoiceView) }
                    }

                    // TODO: implement loading of invoice
                    button("Load") {
                        setOnAction { root }
                    }

                    // Change view to option view
                    button("Option") {
                        setOnAction { replaceWith(optionView) }
                    }
                }
            }
        }
    }
}

