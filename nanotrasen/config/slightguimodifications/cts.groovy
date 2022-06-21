// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true

    splashText {
        enabled = true
        splashesEnabled = false
    }

    background {
        clearBackgrounds()
        backgroundStayLength = 50000 // 50 seconds
        backgroundFadeLength = 2000 // 2 seconds fade
        renderGradientShade = false
        image { texture = file("config/slightguimodifications/background.png") }
    }

    removeMinecraftLogo()
    removeEditionBadge()
    clearAllButtons()

    label {
        position {
            x = 2
            y {
                it - 10
            }
        }

        text = literal("SS220 Nanotrasen [https://games.ss220.space]")
    }

    button {
        position {
            x {it / 10 + 105}
            y { it / 2 + 15}
        }
        width = 100
        height = 20

        text = literal("Моды")
        onClicked = modMenu()
    }
    button {
        position {
            x {it / 10}
            y { it / 2 + 15}
        }
        width = 100
        height = 20

        text = literal("Языки")
        onClicked = language()
    }
    button {
        position {
            x {it / 10}
            y {it / 2 - 60}
        }
        width = 204
        height = 20
		align = "left"
        text = translatable("menu.singleplayer")
        onClicked = singleplayer()
    }
    button {
        position {
            x {it / 10}
            y {it / 2 - 35}
        }
        width = 204
        height = 20

        text = translatable("menu.multiplayer")
        onClicked = multiplayer()
    }
    
    button {
        position {
            x {it / 10 + 105}
            y { it / 2 + 40}
        }
        width = 100
        height = 20

        text = translatable("menu.quit")
        onClicked = exit()
    }
    button {
        position {
            x {it / 10}
            y { it / 2 + 40}
        }
        width = 100
        height = 20

        text = translatable("menu.options")
        onClicked = options()
    }
    button {
        position {
            x {it / 10}
            y { it / 2 - 10}
        }
        width = 204
        height = 20

        text = literal("SS220 Games Discord")
        onClicked = url("https://games.ss220.space")
    }
}