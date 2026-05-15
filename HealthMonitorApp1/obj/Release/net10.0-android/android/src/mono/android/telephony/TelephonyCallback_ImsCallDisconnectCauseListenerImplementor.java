package mono.android.telephony;


public class TelephonyCallback_ImsCallDisconnectCauseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.ImsCallDisconnectCauseListener
{

	public TelephonyCallback_ImsCallDisconnectCauseListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_ImsCallDisconnectCauseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IImsCallDisconnectCauseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onImsCallDisconnectCauseChanged (android.telephony.ims.ImsReasonInfo p0)
	{
		n_onImsCallDisconnectCauseChanged (p0);
	}

	private native void n_onImsCallDisconnectCauseChanged (android.telephony.ims.ImsReasonInfo p0);

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
