package view.style

import javafx.scene.text.FontPosture
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class OptionStyle : Stylesheet() {

    companion object {
        val mainWrapper by cssclass()
        val optionTitle by cssclass()
    }

    init {
        s(mainWrapper) {
            padding = box(25.px)

            s(optionTitle) {
                fontSize = 25.px
                fontStyle = FontPosture.REGULAR
            }
        }
    }
}