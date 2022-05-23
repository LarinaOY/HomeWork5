data class Post(
    val id: Int,
    private val date: Int = (System.currentTimeMillis() / 1000).toInt(),
    val ownerId: Int = 5,
    val fromId: Int = 5,
    val createdBy: Int = 5,
    val text: String,
    val replyOwnerId: Int = 5,
    val replyPostId: Int = 5,
    val friendOnly: Boolean = true,
    val postType: Int = 5,
    val singerId: Int = 5,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val comments: Comments = Comments(5, true, true),
    val likes: Like = Like(count = 0, userLikes = true, canLike = false, canPublish = true),
    val reports: Repost = Repost(5, true)
) {

    data class Comments(
        val count: Int,
        val canPost: Boolean,
        val groupCanPost: Boolean,
    )

    data class Like(
        val count: Int,
        val userLikes: Boolean,
        val canLike: Boolean,
        val canPublish: Boolean,
    )

    class Repost(
        val count: Int,
        val userReposted: Boolean,
    )

}




