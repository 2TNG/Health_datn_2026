package mono.android.telephony;


public class TelephonyCallback_SignalStrengthsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.SignalStrengthsListener
{

	public TelephonyCallback_SignalStrengthsListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_SignalStrengthsListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ISignalStrengthsListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSignalStrengthsChanged (android.telephony.SignalStrength p0)
	{
		n_onSignalStrengthsChanged (p0);
	}

	private native void n_onSignalStrengthsChanged (android.telephony.SignalStrength p0);

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
