
/**
 * Acts as a simple factory for 
 * creation of different posts.
 * 
 *
 */
public class PostFactory {

	public static Post createPost(String type) {
		switch(type) {
		case "B":
			return new BlogPost();
		case "N":
			return new NewsPost();
		case "P":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type is unknown");
		}
	}
}
