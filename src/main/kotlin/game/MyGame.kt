package game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.FPSLogger
import game.screen.MainMenu
import game.screen.MyGameScreen

class MyGame: Game() {

    lateinit var fpsLogger: FPSLogger

    override fun getScreen(): MyGameScreen {
        return super.getScreen() as MyGameScreen
    }

    override fun create() {
        setScreen(MainMenu())
        fpsLogger = FPSLogger()
    }

    override fun render() {
        val currentScreen: MyGameScreen = getScreen()
        currentScreen.render(Gdx.graphics.deltaTime)

        if (currentScreen.isDone()) {
//            currentScreen.dispose()

            if (currentScreen is MainMenu) {
                //setScreen(GameLoop())
            }
//          else if (currentScreen is GameOver) {
//              setScreen(MainMenu())
//        }
        }
    }
}