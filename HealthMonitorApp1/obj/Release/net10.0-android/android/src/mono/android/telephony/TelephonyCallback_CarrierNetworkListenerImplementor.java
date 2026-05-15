package mono.android.telephony;


public class TelephonyCallback_CarrierNetworkListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CarrierNetworkListener
{

	public TelephonyCallback_CarrierNetworkListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CarrierNetworkListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICarrierNetworkListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCarrierNetworkChange (boolean p0)
	{
		n_onCarrierNetworkChange (p0);
	}

	private native void n_onCarrierNetworkChange (boolean p0);

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
