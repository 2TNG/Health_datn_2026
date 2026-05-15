package mono.android.media;


public class MediaPlayer_OnDrmPreparedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnDrmPreparedListener
{

	public MediaPlayer_OnDrmPreparedListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnDrmPreparedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnDrmPreparedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDrmPrepared (android.media.MediaPlayer p0, int p1)
	{
		n_onDrmPrepared (p0, p1);
	}

	private native void n_onDrmPrepared (android.media.MediaPlayer p0, int p1);

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
