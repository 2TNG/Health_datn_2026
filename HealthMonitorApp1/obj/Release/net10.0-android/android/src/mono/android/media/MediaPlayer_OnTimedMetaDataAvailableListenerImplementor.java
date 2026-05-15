package mono.android.media;


public class MediaPlayer_OnTimedMetaDataAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaPlayer.OnTimedMetaDataAvailableListener
{

	public MediaPlayer_OnTimedMetaDataAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == MediaPlayer_OnTimedMetaDataAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.MediaPlayer+IOnTimedMetaDataAvailableListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTimedMetaDataAvailable (android.media.MediaPlayer p0, android.media.TimedMetaData p1)
	{
		n_onTimedMetaDataAvailable (p0, p1);
	}

	private native void n_onTimedMetaDataAvailable (android.media.MediaPlayer p0, android.media.TimedMetaData p1);

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
