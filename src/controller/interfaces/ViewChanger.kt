package controller.interfaces

import tornadofx.FX
import tornadofx.View

interface ViewChanger {

    fun changeView(view : View) {
        if (FX.primaryStage.scene.root != view.root) {
            FX.primaryStage.scene.root = view.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

}