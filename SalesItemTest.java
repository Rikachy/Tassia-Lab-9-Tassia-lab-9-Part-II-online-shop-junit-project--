import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }



    @Test
    public void Testfindmosthelpful()
    {
        SalesItem salesIte1 = new SalesItem("Joe", 56);
        Comment comment1 = new Comment("joe", "this book was really helpful", 5);
        assertEquals("joe", comment1.getAuthor());
        comment1.upvote();
        comment1.upvote();
        Comment comment2 = new Comment("joe", "this book sucks", 1);
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
    }

    @Test
    public void Q19()
    {
        SalesItem salesIte1 = new SalesItem("Math", 400);
        assertEquals(1, salesIte1.addComment("Really good", "this made me cry", 4));
        assertEquals(0, salesIte1.getNumberOfComments());
        salesIte1.upvoteComment(0);
        assertEquals(50, salesIte1.getPrice());
        assertEquals("really good", salesIte1.findMostHelpfulComment());
        Comment comment1 = salesIte1.findMostHelpfulComment();
        comment1.getAuthor();
        comment1.getFullDetails();
        comment1.getRating();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        salesIte1.findMostHelpfulComment();
        Comment comment2 = new Comment("this sucks", "I hate this book", 1);
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        Comment comment3 = salesIte1.findMostHelpfulComment();
        comment3.getAuthor();
        comment2.downvote();
    }
}



