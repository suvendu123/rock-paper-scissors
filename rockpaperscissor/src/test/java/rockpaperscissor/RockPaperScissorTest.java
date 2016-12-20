package rockpaperscissor;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.sapient.rockpaperscissor.Player;
import com.sapient.rockpaperscissor.RockPaperScissorSevice;
import com.sapient.rockpaperscissor.RockPaperScissorSeviceImpl;

public class RockPaperScissorTest {
    private RockPaperScissorSevice service = new RockPaperScissorSeviceImpl();

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testRockPaper(){
        assertEquals(Player.PAPER , service.determime(Player.ROCK, Player.PAPER));
    }
    
    @Test
    public void testRockScissor(){
        assertEquals(Player.ROCK , service.determime(Player.ROCK, Player.SCISSOR));
    }
    
    @Test
    public void testPaperScissor(){
        assertEquals(Player.SCISSOR , service.determime(Player.PAPER, Player.SCISSOR));
    }
    
    
    @Test
    public void testException(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid argument.");
        service.determime(Player.ROCK, Player.ROCK);
    }
    
    
    

}
