data class PostWithCommentsAndAuthor(
    val post: Post,
    val comments: List<Comment>,
    val author: Author,
)
