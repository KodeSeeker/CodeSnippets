/**
Serialize  a Binary tree and Deserialize it.
Several approaches.  Pre order traversal with sentinel to prevent disrupting the order of the original tree
or Level order traversal with sentinel can also be used

Basically any approach where the parent is printed out before the child is usable.
**/

//Pre order approach

public void serialize(Node root, FileStream fin)
{

	if(root==null)
		fin.write("#");// sentinel character.
	else
	{
		fin.write(root.data);
		serialize(root.getLeft());
		serialize(root.getRight());
	}
}

//Deserialize using the above file stream

public void deSerialize(Node root, FileStream fout)
{
	if(!fout.getNext().isNumber)
		return;
	else
	{
		root=fout.getNext();
		deSerialize(root.getLeft(),fout);
		deSerialize(root.getRight(),fout);
	}
}

