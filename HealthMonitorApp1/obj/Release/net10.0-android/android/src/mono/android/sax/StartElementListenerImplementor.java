package mono.android.sax;


public class StartElementListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.sax.StartElementListener
{

	public StartElementListenerImplementor ()
	{
		super ();
		if (getClass () == StartElementListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Sax.IStartElementListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void start (org.xml.sax.Attributes p0)
	{
		n_start (p0);
	}

	private native void n_start (org.xml.sax.Attributes p0);

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
