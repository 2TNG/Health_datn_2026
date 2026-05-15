package mono.android.telephony;


public class TelephonyCallback_DisplayInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.DisplayInfoListener
{

	public TelephonyCallback_DisplayInfoListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_DisplayInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IDisplayInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDisplayInfoChanged (android.telephony.TelephonyDisplayInfo p0)
	{
		n_onDisplayInfoChanged (p0);
	}

	private native void n_onDisplayInfoChanged (android.telephony.TelephonyDisplayInfo p0);

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
