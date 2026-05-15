package mono.android.media;


public class RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
{

	public RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.RemoteControlClient+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPlaybackPositionUpdate (long p0)
	{
		n_onPlaybackPositionUpdate (p0);
	}

	private native void n_onPlaybackPositionUpdate (long p0);

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
