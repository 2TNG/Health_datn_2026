package mono.android.telephony;


public class TelephonyCallback_EmergencyNumberListListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.EmergencyNumberListListener
{

	public TelephonyCallback_EmergencyNumberListListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_EmergencyNumberListListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IEmergencyNumberListListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEmergencyNumberListChanged (java.util.Map p0)
	{
		n_onEmergencyNumberListChanged (p0);
	}

	private native void n_onEmergencyNumberListChanged (java.util.Map p0);

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
