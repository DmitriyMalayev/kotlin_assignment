import kotlinx.browser.document
import react.*
import emotion.react.css
import react.dom.render
import csstype.Position
import csstype.px
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img
import kotlinx.serialization.Serializable
import react.dom.client.createRoot

@Serializable
data class Video(
    val id: Int,
    val title: String,
    val speaker: String,
    val videoUrl: String
)

@Serializable
data class Audio(
    val id: Int,
    val title: String
)


fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(container).render(App.create())

}

//val unwatchedVideos = listOf(
//    Video(1, "Opening Keynote", "Andrey Breslav", "https://youtu.be/PsaFVLr8t4E"),
//    Video(2, "Dissecting the stdlib", "Huyen Tue Dao", "https://youtu.be/Fzt_9I733Yg"),
//    Video(3, "Kotlin and Spring Boot", "Nicolas Frankel", "https://youtu.be/pSiZVAeReeg")
//)
//
//val watchedVideos = listOf(
//    Video(4, "Creating Internal DSLs in Kotlin", "Venkat Subramaniam", "https://youtu.be/JzTeAM8N1-o")
//)





/*
The render() function instructs kotlin-react-dom to render the first HTML element inside a
fragment to the root element. This element is a container defined in src/main/resources/index
.html, which was included in the template.

The content is an <h1> header and uses a typesafe DSL to render HTML.

h1 is a function that takes a lambda parameter. When you add the + sign in front of a string
literal, the unaryPlus() function is actually invoked  using operator overloading. It appends the
 string to the enclosed HTML element.
*/