package mono.android.media.session;


public class MediaSessionManager_OnSession2TokensChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.session.MediaSessionManager.OnSession2TokensChangedListener
{

	public MediaSessionManager_OnSession2TokensChangedListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSessionManager_OnSession2TokensChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Session.MediaSessionManager+IOnSession2TokensChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSession2TokensChanged (java.util.List p0)
	{
		n_onSession2TokensChanged (p0);
	}

	private native void n_onSession2TokensChanged (java.util.List p0);

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
