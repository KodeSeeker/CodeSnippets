/**
Back Stack and Forward Stack.

When stack is empty, disable the button.

When you navigate to new Url, push url on Back Stack. Clear Forward Stack, this is the complicated step in case of Linked List or any other implementation.

When you hit the back button, pop the top Url from Back Stack, push it in Forward Stack. 

When you hit the forward button, pop the top Url from Forward Stack and push it on to Back Stack.

This logic can also be used for Undo / Redo functionality.
**/

public class BrowserBackButton {

	Stack<Page> forward;
	Stack<Page> backward;
	/**
	 Clear forward stack every time you visit a new page. 
	**/
	void visitnewPage(String url)	{
			forward.clear();
			backward.push(url);
	}
	
	// pop from back and push to front. 
	//top of stack after popping is back page. 

	String pressBack() {
		String forwardURL = back.pop();
		forward.push(forwardURL);		
		return back.peek();
	}

	
	String pressForward() {
		
		if(forward.isEmpty())
			return null;
		return forward.peek();
	}
} 

