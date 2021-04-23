
public class Client {
	public static void main(String[] args) {
		Post post = PostFactory.createPost("B");
		System.out.println(post);
	}
}
