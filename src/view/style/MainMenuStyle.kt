package view.style

import javafx.geometry.Pos
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class MainMenuStyle : Stylesheet() {

    companion object {
        val mainWrapper by cssclass()
        val mainButton by cssclass()
        val mainTitle by cssclass()
        val mainSeparator by cssclass()
    }

    init {
        s(mainWrapper) {
            padding = box(15.px, 20.px)

            s(mainButton) {
                spacing = 15.px
                alignment = Pos.CENTER
            }

            s(mainTitle) {
                fontSize = 25.px
                alignment = Pos.CENTER
            }

            s(mainSeparator) {
                alignment = Pos.CENTER
                padding = box(5.px, 0.px, 15.px, 0.px)
            }
        }

    }
}