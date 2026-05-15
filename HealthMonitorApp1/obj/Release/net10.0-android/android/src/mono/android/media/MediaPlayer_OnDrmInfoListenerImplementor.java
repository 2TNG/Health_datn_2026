package mono.android.media;


public class MediaPlayer_OnDrmInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnDrmInfoListener
{

	public MediaPlayer_OnDrmInfoListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnDrmInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnDrmInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDrmInfo (android.media.MediaPlayer p0, android.media.MediaPlayer.DrmInfo p1)
	{
		n_onDrmInfo (p0, p1);
	}

	private native void n_onDrmInfo (android.media.MediaPlayer p0, android.media.MediaPlayer.DrmInfo p1);

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
