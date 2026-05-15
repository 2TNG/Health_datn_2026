package mono.android.media;


public class MediaDrm_OnSessionLostStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaDrm.OnSessionLostStateListener
{

	public MediaDrm_OnSessionLostStateListenerImplementor ()
	{
		super ();
		if (getClass () == MediaDrm_OnSessionLostStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaDrm+IOnSessionLostStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSessionLostState (android.media.MediaDrm p0, byte[] p1)
	{
		n_onSessionLostState (p0, p1);
	}

	private native void n_onSessionLostState (android.media.MediaDrm p0, byte[] p1);

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
