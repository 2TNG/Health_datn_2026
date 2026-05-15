package mono.android.telephony;


public class TelephonyCallback_PreciseDataConnectionStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.PreciseDataConnectionStateListener
{

	public TelephonyCallback_PreciseDataConnectionStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_PreciseDataConnectionStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IPreciseDataConnectionStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPreciseDataConnectionStateChanged (android.telephony.PreciseDataConnectionState p0)
	{
		n_onPreciseDataConnectionStateChanged (p0);
	}

	private native void n_onPreciseDataConnectionStateChanged (android.telephony.PreciseDataConnectionState p0);

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
