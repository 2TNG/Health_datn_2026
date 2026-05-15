package mono.android.location;


public class GnssAntennaInfo_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.GnssAntennaInfo.Listener
{

	public GnssAntennaInfo_ListenerImplementor ()
	{
		super ();
		if (getClass () == GnssAntennaInfo_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Locations.GnssAntennaInfo+IListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGnssAntennaInfoReceived (java.util.List p0)
	{
		n_onGnssAntennaInfoReceived (p0);
	}

	private native void n_onGnssAntennaInfoReceived (java.util.List p0);

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
