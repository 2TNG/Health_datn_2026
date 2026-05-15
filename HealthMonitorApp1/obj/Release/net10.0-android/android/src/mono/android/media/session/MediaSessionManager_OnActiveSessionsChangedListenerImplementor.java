package mono.android.media.session;


public class MediaSessionManager_OnActiveSessionsChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
{

	public MediaSessionManager_OnActiveSessionsChangedListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSessionManager_OnActiveSessionsChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Session.MediaSessionManager+IOnActiveSessionsChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActiveSessionsChanged (java.util.List p0)
	{
		n_onActiveSessionsChanged (p0);
	}

	private native void n_onActiveSessionsChanged (java.util.List p0);

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
