

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestAuthorRating()
    {
    }

    @Test
    public void author()
    {
        Comment comment1 = new Comment("bob", "no bob", 3);
    }

    @Test//Q18
    public void upvote()
    {
        Comment comment1 = new Comment("we", "lol", 2);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.downvote();
        comment1.downvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.downvote();
        comment1.upvote();
        comment1.downvote();
    }

    @Test//Q18
    public void Author()
    {
        Comment comment1 = new Comment("John", "story of joh", 1);
        assertEquals("John", comment1.getAuthor());
        assertEquals(1, comment1.getRating());
    }

    @Test//Q18
    public void rating()
    {
        Comment comment1 = new Comment("Vomi", "hi", 4);
        assertEquals(4, comment1.getRating());
    }
}





