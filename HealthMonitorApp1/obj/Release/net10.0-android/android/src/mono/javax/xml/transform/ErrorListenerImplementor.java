package mono.javax.xml.transform;


public class ErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		javax.xml.transform.ErrorListener
{

	public ErrorListenerImplementor ()
	{
		super ();
		if (getClass () == ErrorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Javax.Xml.Transform.IErrorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void error (javax.xml.transform.TransformerException p0)
	{
		n_error (p0);
	}

	private native void n_error (javax.xml.transform.TransformerException p0);

	public void fatalError (javax.xml.transform.TransformerException p0)
	{
		n_fatalError (p0);
	}

	private native void n_fatalError (javax.xml.transform.TransformerException p0);

	public void warning (javax.xml.transform.TransformerException p0)
	{
		n_warning (p0);
	}

	private native void n_warning (javax.xml.transform.TransformerException p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
