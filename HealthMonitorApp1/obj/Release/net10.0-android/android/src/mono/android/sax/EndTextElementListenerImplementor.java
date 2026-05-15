package mono.android.sax;


public class EndTextElementListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.sax.EndTextElementListener
{

	public EndTextElementListenerImplementor ()
	{
		super ();
		if (getClass () == EndTextElementListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Sax.IEndTextElementListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void end (java.lang.String p0)
	{
		n_end (p0);
	}

	private native void n_end (java.lang.String p0);

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
