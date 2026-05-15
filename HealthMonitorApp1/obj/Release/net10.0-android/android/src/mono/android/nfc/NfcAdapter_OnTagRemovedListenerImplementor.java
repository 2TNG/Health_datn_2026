package mono.android.nfc;


public class NfcAdapter_OnTagRemovedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.nfc.NfcAdapter.OnTagRemovedListener
{

	public NfcAdapter_OnTagRemovedListenerImplementor ()
	{
		super ();
		if (getClass () == NfcAdapter_OnTagRemovedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Nfc.NfcAdapter+IOnTagRemovedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTagRemoved ()
	{
		n_onTagRemoved ();
	}

	private native void n_onTagRemoved ();

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
