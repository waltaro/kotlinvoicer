import tornadofx.App
import tornadofx.importStylesheet
import view.MainMenu
import view.style.MainMenuStyle
import view.style.OptionStyle

class Kotlinvoicer : App() {
    override val primaryView = MainMenu::class

    init {
        importStylesheet(MainMenuStyle::class)
        importStylesheet(OptionStyle::class)
    }
}