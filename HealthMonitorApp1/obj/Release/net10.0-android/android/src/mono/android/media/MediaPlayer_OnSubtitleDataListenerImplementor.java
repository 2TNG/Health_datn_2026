package mono.android.media;


public class MediaPlayer_OnSubtitleDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnSubtitleDataListener
{

	public MediaPlayer_OnSubtitleDataListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnSubtitleDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnSubtitleDataListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSubtitleData (android.media.MediaPlayer p0, android.media.SubtitleData p1)
	{
		n_onSubtitleData (p0, p1);
	}

	private native void n_onSubtitleData (android.media.MediaPlayer p0, android.media.SubtitleData p1);

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
