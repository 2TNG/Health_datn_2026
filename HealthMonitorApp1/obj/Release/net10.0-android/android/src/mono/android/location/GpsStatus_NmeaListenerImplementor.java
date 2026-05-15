package mono.android.location;


public class GpsStatus_NmeaListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.GpsStatus.NmeaListener
{

	public GpsStatus_NmeaListenerImplementor ()
	{
		super ();
		if (getClass () == GpsStatus_NmeaListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Locations.GpsStatus+INmeaListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onNmeaReceived (long p0, java.lang.String p1)
	{
		n_onNmeaReceived (p0, p1);
	}

	private native void n_onNmeaReceived (long p0, java.lang.String p1);

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
