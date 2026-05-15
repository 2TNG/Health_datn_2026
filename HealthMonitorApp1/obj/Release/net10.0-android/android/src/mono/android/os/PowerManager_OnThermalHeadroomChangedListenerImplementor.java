package mono.android.os;


public class PowerManager_OnThermalHeadroomChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.PowerManager.OnThermalHeadroomChangedListener
{

	public PowerManager_OnThermalHeadroomChangedListenerImplementor ()
	{
		super ();
		if (getClass () == PowerManager_OnThermalHeadroomChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.PowerManager+IOnThermalHeadroomChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onThermalHeadroomChanged (float p0, float p1, int p2, java.util.Map p3)
	{
		n_onThermalHeadroomChanged (p0, p1, p2, p3);
	}

	private native void n_onThermalHeadroomChanged (float p0, float p1, int p2, java.util.Map p3);

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
