data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
    val author: String,
)
