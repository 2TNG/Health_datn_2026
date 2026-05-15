package mono.android.telephony;


public class TelephonyCallback_ActiveDataSubscriptionIdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.ActiveDataSubscriptionIdListener
{

	public TelephonyCallback_ActiveDataSubscriptionIdListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_ActiveDataSubscriptionIdListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IActiveDataSubscriptionIdListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActiveDataSubscriptionIdChanged (int p0)
	{
		n_onActiveDataSubscriptionIdChanged (p0);
	}

	private native void n_onActiveDataSubscriptionIdChanged (int p0);

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
