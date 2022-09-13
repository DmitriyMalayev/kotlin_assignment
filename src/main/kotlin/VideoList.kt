import kotlinx.browser.window
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p


external interface VideoListProps : Props {  //Configured to received selectedVideo as prop
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit  //Passing handler to lift state
 }

val VideoList = FC<VideoListProps> {props ->
    for (video in props.videos){
        p {
            key = video.id.toString()
            onClick = {
                props.onSelectVideo(video)
            }
            if (video == props.selectedVideo) {   //Using prop instead of state
                +"▶ "
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}
