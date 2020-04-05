package de.ark_lutschinator;


import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;



public class discord_water_bot extends ListenerAdapter
{
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws LoginException
    {
        new JDABuilder("Njk2MjUxMTQ0MDk1MTM3ODIz.XomDVQ.Wwdp7qVle_VAR9i5KKNAO7cldaw")
            .addEventListeners(new discord_water_bot())
            .setActivity(Activity.playing("Dont't die of thirst, bro!"))
            .build();
    }
    
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
       while(true)
       {
	    	Message msg = event.getMessage();
	        if (msg.getContentRaw().equals("!water"))
	        {
	            MessageChannel channel = event.getChannel();
	            //long time = System.currentTimeMillis();
	            channel.sendMessage("Stay hydrated, bitch, David and Raphi!").queue(); 
	            try {
					TimeUnit.MINUTES.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
       }
   }

}	