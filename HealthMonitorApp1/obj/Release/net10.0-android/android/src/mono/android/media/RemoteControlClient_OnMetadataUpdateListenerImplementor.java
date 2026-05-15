package mono.android.media;


public class RemoteControlClient_OnMetadataUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.RemoteControlClient.OnMetadataUpdateListener
{

	public RemoteControlClient_OnMetadataUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == RemoteControlClient_OnMetadataUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.RemoteControlClient+IOnMetadataUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMetadataUpdate (int p0, java.lang.Object p1)
	{
		n_onMetadataUpdate (p0, p1);
	}

	private native void n_onMetadataUpdate (int p0, java.lang.Object p1);

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
