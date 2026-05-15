package mono.android.media;


public class MediaPlayer_OnTimedTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnTimedTextListener
{

	public MediaPlayer_OnTimedTextListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnTimedTextListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnTimedTextListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTimedText (android.media.MediaPlayer p0, android.media.TimedText p1)
	{
		n_onTimedText (p0, p1);
	}

	private native void n_onTimedText (android.media.MediaPlayer p0, android.media.TimedText p1);

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
