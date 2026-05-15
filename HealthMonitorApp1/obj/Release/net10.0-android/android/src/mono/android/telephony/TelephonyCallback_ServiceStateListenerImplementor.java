package mono.android.telephony;


public class TelephonyCallback_ServiceStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.ServiceStateListener
{

	public TelephonyCallback_ServiceStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_ServiceStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IServiceStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onServiceStateChanged (android.telephony.ServiceState p0)
	{
		n_onServiceStateChanged (p0);
	}

	private native void n_onServiceStateChanged (android.telephony.ServiceState p0);

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
