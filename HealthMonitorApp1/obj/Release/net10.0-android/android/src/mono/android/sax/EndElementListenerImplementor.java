package mono.android.sax;


public class EndElementListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.sax.EndElementListener
{

	public EndElementListenerImplementor ()
	{
		super ();
		if (getClass () == EndElementListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Sax.IEndElementListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void end ()
	{
		n_end ();
	}

	private native void n_end ();

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
