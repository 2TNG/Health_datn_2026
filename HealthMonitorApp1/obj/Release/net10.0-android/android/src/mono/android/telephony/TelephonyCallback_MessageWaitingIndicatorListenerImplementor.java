package mono.android.telephony;


public class TelephonyCallback_MessageWaitingIndicatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.MessageWaitingIndicatorListener
{

	public TelephonyCallback_MessageWaitingIndicatorListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_MessageWaitingIndicatorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IMessageWaitingIndicatorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMessageWaitingIndicatorChanged (boolean p0)
	{
		n_onMessageWaitingIndicatorChanged (p0);
	}

	private native void n_onMessageWaitingIndicatorChanged (boolean p0);

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
