package view.style

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class MainMenuStyle : Stylesheet() {

    companion object {
        val mainWrapper by cssclass()
        val mainTitle by cssclass()
    }

    init {
        s(mainWrapper) {
            padding = box(25.px)

            s(mainTitle) {
                fontSize = 25.px
            }
        }

    }
}