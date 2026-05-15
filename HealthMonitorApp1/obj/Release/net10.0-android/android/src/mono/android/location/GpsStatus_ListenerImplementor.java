package mono.android.location;


public class GpsStatus_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.GpsStatus.Listener
{

	public GpsStatus_ListenerImplementor ()
	{
		super ();
		if (getClass () == GpsStatus_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Locations.GpsStatus+IListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGpsStatusChanged (int p0)
	{
		n_onGpsStatusChanged (p0);
	}

	private native void n_onGpsStatusChanged (int p0);

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
