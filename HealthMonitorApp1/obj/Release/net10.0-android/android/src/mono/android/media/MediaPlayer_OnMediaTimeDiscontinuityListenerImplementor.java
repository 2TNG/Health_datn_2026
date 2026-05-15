package mono.android.media;


public class MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnMediaTimeDiscontinuityListener
{

	public MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnMediaTimeDiscontinuityListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnMediaTimeDiscontinuityListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMediaTimeDiscontinuity (android.media.MediaPlayer p0, android.media.MediaTimestamp p1)
	{
		n_onMediaTimeDiscontinuity (p0, p1);
	}

	private native void n_onMediaTimeDiscontinuity (android.media.MediaPlayer p0, android.media.MediaTimestamp p1);

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
