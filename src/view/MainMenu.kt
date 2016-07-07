package view

import javafx.scene.layout.VBox
import tornadofx.*

class MainMenu : View() {
    override val root = VBox()

    val optionView: OptionView by inject()
    val invoiceView: NewInvoiceView by inject()

    init {
        title = "Kotlinvoicer"

        with(root)
        {
            hbox {
                text("Kotlinvoicer")
            }

            hbox {
                button("New").setOnAction { replaceWith(invoiceView) }
                button("Load")
                button("Option").setOnAction { replaceWith(optionView) }
            }
        }
    }
}
