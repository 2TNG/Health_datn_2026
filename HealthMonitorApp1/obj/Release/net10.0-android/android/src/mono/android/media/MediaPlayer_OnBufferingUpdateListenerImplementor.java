package mono.android.media;


public class MediaPlayer_OnBufferingUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnBufferingUpdateListener
{

	public MediaPlayer_OnBufferingUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnBufferingUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnBufferingUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBufferingUpdate (android.media.MediaPlayer p0, int p1)
	{
		n_onBufferingUpdate (p0, p1);
	}

	private native void n_onBufferingUpdate (android.media.MediaPlayer p0, int p1);

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
