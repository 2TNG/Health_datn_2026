package mono.android.media;


public class RemoteControlClient_OnGetPlaybackPositionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.RemoteControlClient.OnGetPlaybackPositionListener
{

	public RemoteControlClient_OnGetPlaybackPositionListenerImplementor ()
	{
		super ();
		if (getClass () == RemoteControlClient_OnGetPlaybackPositionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.RemoteControlClient+IOnGetPlaybackPositionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public long onGetPlaybackPosition ()
	{
		return n_onGetPlaybackPosition ();
	}

	private native long n_onGetPlaybackPosition ();

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
