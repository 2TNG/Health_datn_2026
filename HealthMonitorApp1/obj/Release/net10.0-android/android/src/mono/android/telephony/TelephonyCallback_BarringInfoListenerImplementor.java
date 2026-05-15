package mono.android.telephony;


public class TelephonyCallback_BarringInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.BarringInfoListener
{

	public TelephonyCallback_BarringInfoListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_BarringInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IBarringInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBarringInfoChanged (android.telephony.BarringInfo p0)
	{
		n_onBarringInfoChanged (p0);
	}

	private native void n_onBarringInfoChanged (android.telephony.BarringInfo p0);

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
