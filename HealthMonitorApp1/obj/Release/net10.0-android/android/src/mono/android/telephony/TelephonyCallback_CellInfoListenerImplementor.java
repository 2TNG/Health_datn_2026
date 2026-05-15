package mono.android.telephony;


public class TelephonyCallback_CellInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.telephony.TelephonyCallback.CellInfoListener
{

	public TelephonyCallback_CellInfoListenerImplementor ()
	{
		super ();
		if (getClass () == TelephonyCallback_CellInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Telephony.TelephonyCallback+ICellInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCellInfoChanged (java.util.List p0)
	{
		n_onCellInfoChanged (p0);
	}

	private native void n_onCellInfoChanged (java.util.List p0);

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
