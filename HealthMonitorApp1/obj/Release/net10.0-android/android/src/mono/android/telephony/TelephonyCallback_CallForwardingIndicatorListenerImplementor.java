package mono.android.telephony;


public class TelephonyCallback_CallForwardingIndicatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CallForwardingIndicatorListener
{

	public TelephonyCallback_CallForwardingIndicatorListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CallForwardingIndicatorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICallForwardingIndicatorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCallForwardingIndicatorChanged (boolean p0)
	{
		n_onCallForwardingIndicatorChanged (p0);
	}

	private native void n_onCallForwardingIndicatorChanged (boolean p0);

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
