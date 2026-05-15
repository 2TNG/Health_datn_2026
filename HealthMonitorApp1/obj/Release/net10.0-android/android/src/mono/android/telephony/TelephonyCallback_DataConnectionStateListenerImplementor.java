package mono.android.telephony;


public class TelephonyCallback_DataConnectionStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.DataConnectionStateListener
{

	public TelephonyCallback_DataConnectionStateListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_DataConnectionStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IDataConnectionStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDataConnectionStateChanged (int p0, int p1)
	{
		n_onDataConnectionStateChanged (p0, p1);
	}

	private native void n_onDataConnectionStateChanged (int p0, int p1);

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
