package mono.android.os;


public class PowerManager_OnThermalStatusChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.PowerManager.OnThermalStatusChangedListener
{

	public PowerManager_OnThermalStatusChangedListenerImplementor ()
	{
		super ();
		if (getClass () == PowerManager_OnThermalStatusChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.PowerManager+IOnThermalStatusChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onThermalStatusChanged (int p0)
	{
		n_onThermalStatusChanged (p0);
	}

	private native void n_onThermalStatusChanged (int p0);

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
