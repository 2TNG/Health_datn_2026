package mono.android.media;


public class MediaPlayer_OnSeekCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnSeekCompleteListener
{

	public MediaPlayer_OnSeekCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnSeekCompleteListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnSeekCompleteListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSeekComplete (android.media.MediaPlayer p0)
	{
		n_onSeekComplete (p0);
	}

	private native void n_onSeekComplete (android.media.MediaPlayer p0);

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
