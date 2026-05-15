package mono.android.telephony;


public class TelephonyCallback_CellLocationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CellLocationListener
{

	public TelephonyCallback_CellLocationListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CellLocationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICellLocationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCellLocationChanged (android.telephony.CellLocation p0)
	{
		n_onCellLocationChanged (p0);
	}

	private native void n_onCellLocationChanged (android.telephony.CellLocation p0);

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
