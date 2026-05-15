package mono.android.media;


public class MediaDrm_OnEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaDrm.OnEventListener
{

	public MediaDrm_OnEventListenerImplementor ()
	{
		super ();
		if (getClass () == MediaDrm_OnEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaDrm+IOnEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEvent (android.media.MediaDrm p0, byte[] p1, int p2, int p3, byte[] p4)
	{
		n_onEvent (p0, p1, p2, p3, p4);
	}

	private native void n_onEvent (android.media.MediaDrm p0, byte[] p1, int p2, int p3, byte[] p4);

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
