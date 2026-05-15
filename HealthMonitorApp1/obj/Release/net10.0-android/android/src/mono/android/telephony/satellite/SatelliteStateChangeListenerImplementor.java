package mono.android.telephony.satellite;


public class SatelliteStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.satellite.SatelliteStateChangeListener
{

	public SatelliteStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SatelliteStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.Satellite.ISatelliteStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEnabledStateChanged (boolean p0)
	{
		n_onEnabledStateChanged (p0);
	}

	private native void n_onEnabledStateChanged (boolean p0);

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
