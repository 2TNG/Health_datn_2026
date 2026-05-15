package mono.android.telephony;


public class TelephonyCallback_CallDisconnectCauseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CallDisconnectCauseListener
{

	public TelephonyCallback_CallDisconnectCauseListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CallDisconnectCauseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICallDisconnectCauseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCallDisconnectCauseChanged (int p0, int p1)
	{
		n_onCallDisconnectCauseChanged (p0, p1);
	}

	private native void n_onCallDisconnectCauseChanged (int p0, int p1);

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
