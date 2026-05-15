package mono.android.media;


public class MediaDrm_OnExpirationUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaDrm.OnExpirationUpdateListener
{

	public MediaDrm_OnExpirationUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == MediaDrm_OnExpirationUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaDrm+IOnExpirationUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onExpirationUpdate (android.media.MediaDrm p0, byte[] p1, long p2)
	{
		n_onExpirationUpdate (p0, p1, p2);
	}

	private native void n_onExpirationUpdate (android.media.MediaDrm p0, byte[] p1, long p2);

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
