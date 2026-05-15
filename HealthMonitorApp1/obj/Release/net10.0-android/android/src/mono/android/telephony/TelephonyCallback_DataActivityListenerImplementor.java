package mono.android.telephony;


public class TelephonyCallback_DataActivityListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.DataActivityListener
{

	public TelephonyCallback_DataActivityListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_DataActivityListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+IDataActivityListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDataActivity (int p0)
	{
		n_onDataActivity (p0);
	}

	private native void n_onDataActivity (int p0);

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
