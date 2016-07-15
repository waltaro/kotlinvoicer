package view.style

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class OptionStyle : Stylesheet() {

    companion object {
        val mainWrapper by cssclass()
    }

    init {
        s(mainWrapper) {
            padding = box(25.px)
        }
    }
}