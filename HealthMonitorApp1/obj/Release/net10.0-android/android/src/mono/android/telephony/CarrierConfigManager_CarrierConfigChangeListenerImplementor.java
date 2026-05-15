package mono.android.telephony;


public class CarrierConfigManager_CarrierConfigChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.CarrierConfigManager.CarrierConfigChangeListener
{

	public CarrierConfigManager_CarrierConfigChangeListenerImplementor ()
	{
		super ();
		if (getClass () == CarrierConfigManager_CarrierConfigChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.CarrierConfigManager+ICarrierConfigChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCarrierConfigChanged (int p0, int p1, int p2, int p3)
	{
		n_onCarrierConfigChanged (p0, p1, p2, p3);
	}

	private native void n_onCarrierConfigChanged (int p0, int p1, int p2, int p3);

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
