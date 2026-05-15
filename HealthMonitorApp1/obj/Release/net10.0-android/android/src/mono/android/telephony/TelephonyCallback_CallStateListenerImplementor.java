package mono.android.telephony;


public class TelephonyCallback_CallStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CallStateListener
{

	public TelephonyCallback_CallStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CallStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICallStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCallStateChanged (int p0)
	{
		n_onCallStateChanged (p0);
	}

	private native void n_onCallStateChanged (int p0);

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
