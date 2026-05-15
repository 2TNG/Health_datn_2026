package mono.android.media;


public class RemoteController_OnClientUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.RemoteController.OnClientUpdateListener
{

	public RemoteController_OnClientUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == RemoteController_OnClientUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.RemoteController+IOnClientUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClientChange (boolean p0)
	{
		n_onClientChange (p0);
	}

	private native void n_onClientChange (boolean p0);

	public void onClientMetadataUpdate (android.media.RemoteController.MetadataEditor p0)
	{
		n_onClientMetadataUpdate (p0);
	}

	private native void n_onClientMetadataUpdate (android.media.RemoteController.MetadataEditor p0);

	public void onClientPlaybackStateUpdate (int p0, long p1, long p2, float p3)
	{
		n_onClientPlaybackStateUpdate (p0, p1, p2, p3);
	}

	private native void n_onClientPlaybackStateUpdate (int p0, long p1, long p2, float p3);

	public void onClientPlaybackStateUpdate (int p0)
	{
		n_onClientPlaybackStateUpdate (p0);
	}

	private native void n_onClientPlaybackStateUpdate (int p0);

	public void onClientTransportControlUpdate (int p0)
	{
		n_onClientTransportControlUpdate (p0);
	}

	private native void n_onClientTransportControlUpdate (int p0);

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
