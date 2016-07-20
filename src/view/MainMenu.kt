package view

import controller.MainMenuController
import javafx.scene.layout.GridPane
import tornadofx.*
import view.style.MainMenuStyle.Companion.mainTitle
import view.style.MainMenuStyle.Companion.mainWrapper

class MainMenu : View() {
    override val root = GridPane()

    // Views
    val optionView: OptionView by inject()
    val invoiceView: NewInvoiceView by inject()

    // Controller
    val menuController: MainMenuController by inject()

    init {

        // Disable resizing of application
        FX.primaryStage.resizableProperty().set(false)

        with(root)
        {
            addClass(mainWrapper)

            text("Kotlinvoicer") {
                addClass(mainTitle)

                gridpaneConstraints {
                    columnRowIndex(0,0)
                    marginBottom = 10.0
                    columnSpan = 3
                }
            }

            // Change view to new invoice view
            button("New") {
                setOnAction { menuController.changeView(invoiceView) }

                gridpaneConstraints {
                    columnRowIndex(0,1)
                    marginRight = 10.0
                }
            }

            // TODO: implement loading of invoice
            button("Load") {
                setOnAction { menuController.loadInvoice() }

                gridpaneConstraints {
                    columnRowIndex(1,1)
                    marginRight = 10.0
                }
            }

            // Change view to option view
            button("Option") {
                setOnAction { menuController.changeView(optionView) }

                gridpaneConstraints {
                    columnRowIndex(2,1)
                }
            }
        }

    }
}

