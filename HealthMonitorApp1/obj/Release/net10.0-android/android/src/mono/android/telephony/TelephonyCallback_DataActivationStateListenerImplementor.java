package mono.android.telephony;


public class TelephonyCallback_DataActivationStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.DataActivationStateListener
{

	public TelephonyCallback_DataActivationStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_DataActivationStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IDataActivationStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDataActivationStateChanged (int p0)
	{
		n_onDataActivationStateChanged (p0);
	}

	private native void n_onDataActivationStateChanged (int p0);

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
