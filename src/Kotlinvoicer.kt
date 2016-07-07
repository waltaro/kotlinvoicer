import tornadofx.App
import tornadofx.importStylesheet
import tornadofx.reloadStylesheetsOnFocus
import view.MainMenu
import view.style.MainMenuStyle

class Kotlinvoicer : App() {
    override val primaryView = MainMenu::class

    init {
        importStylesheet(MainMenuStyle::class)
    }
}