package mono.android.media;


public class AudioTrack_OnPlaybackPositionUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioTrack.OnPlaybackPositionUpdateListener
{

	public AudioTrack_OnPlaybackPositionUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == AudioTrack_OnPlaybackPositionUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.AudioTrack+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMarkerReached (android.media.AudioTrack p0)
	{
		n_onMarkerReached (p0);
	}

	private native void n_onMarkerReached (android.media.AudioTrack p0);

	public void onPeriodicNotification (android.media.AudioTrack p0)
	{
		n_onPeriodicNotification (p0);
	}

	private native void n_onPeriodicNotification (android.media.AudioTrack p0);

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
