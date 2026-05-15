package mono.android.telephony;


public class TelephonyCallback_UserMobileDataStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.UserMobileDataStateListener
{

	public TelephonyCallback_UserMobileDataStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_UserMobileDataStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IUserMobileDataStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onUserMobileDataStateChanged (boolean p0)
	{
		n_onUserMobileDataStateChanged (p0);
	}

	private native void n_onUserMobileDataStateChanged (boolean p0);

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
