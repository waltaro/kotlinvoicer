package view

import controller.InvoiceController
import javafx.scene.layout.BorderPane
import tornadofx.View
import tornadofx.button
import tornadofx.center
import tornadofx.label

class NewInvoiceView : View() {
    override val root = BorderPane()
    val mainMenu : MainMenu by inject()
    val invoiceController : InvoiceController by inject()

    init {
        with(root) {
            center {
                button("Back") {
                    setOnAction {invoiceController.changeView(mainMenu) }
                }
            }
        }
    }
}
