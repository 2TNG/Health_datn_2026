package mono.android.media.session;


public class MediaSessionManager_OnMediaKeyEventSessionChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener
{

	public MediaSessionManager_OnMediaKeyEventSessionChangedListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSessionManager_OnMediaKeyEventSessionChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Session.MediaSessionManager+IOnMediaKeyEventSessionChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMediaKeyEventSessionChanged (java.lang.String p0, android.media.session.MediaSession.Token p1)
	{
		n_onMediaKeyEventSessionChanged (p0, p1);
	}

	private native void n_onMediaKeyEventSessionChanged (java.lang.String p0, android.media.session.MediaSession.Token p1);

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
