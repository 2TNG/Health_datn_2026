package mono.android.media;


public class MediaPlayer_OnInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnInfoListener
{

	public MediaPlayer_OnInfoListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onInfo (android.media.MediaPlayer p0, int p1, int p2)
	{
		return n_onInfo (p0, p1, p2);
	}

	private native boolean n_onInfo (android.media.MediaPlayer p0, int p1, int p2);

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
