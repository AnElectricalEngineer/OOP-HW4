package homework4q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TODO add description, abs func, rep invariant, checkRep, call checkrep, spec
public class ChatBox extends Subject
{
    private final List<String> messages_;

    public ChatBox()
    {
        messages_ = new ArrayList<String>();
    }

    public void sendMessage(String message)
    {
        messages_.add(message);
        notifyObservers();
    }

    public Iterator<String> getMessages()
    {
        return messages_.iterator();
    }
}