package view

import controller.InvoiceController
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import tornadofx.View
import tornadofx.button
import tornadofx.center
import tornadofx.label

class NewInvoiceView : View() {
    override val root = GridPane()
    val mainMenu : MainMenu by inject()
    val invoiceController : InvoiceController by inject()

    init {
        with(root) {
            button("Back") {
                setOnAction {invoiceController.changeView(mainMenu) }
            }
        }
    }
}
