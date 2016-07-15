package view.style

import javafx.geometry.Pos
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class MainMenuStyle : Stylesheet() {

    companion object {
        val mainWrapper by cssclass()
        val mainTitle by cssclass()
        val mainSeparator by cssclass()
    }

    init {
        s(mainWrapper) {
            padding = box(25.px)

            s(mainTitle) {
                fontSize = 25.px
            }

            s(mainSeparator) {
                padding = box(5.px, 0.px, 15.px, 0.px)
            }
        }

    }
}