@file:JsModule("react-player")
@file:JsNonModule

import react.*

@JsName("default")
external val ReactPlayer: ComponentClass<ReactPlayerProps>


//Using an external interface to specify what kinds of props belong to the props for this external component.
external interface ReactPlayerProps : Props {
    var url: String
    var controls: Boolean
}

