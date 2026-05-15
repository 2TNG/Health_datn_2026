package mono.android.telephony;


public class TelephonyCallback_RegistrationFailedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.RegistrationFailedListener
{

	public TelephonyCallback_RegistrationFailedListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_RegistrationFailedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IRegistrationFailedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRegistrationFailed (android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4)
	{
		n_onRegistrationFailed (p0, p1, p2, p3, p4);
	}

	private native void n_onRegistrationFailed (android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4);

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
