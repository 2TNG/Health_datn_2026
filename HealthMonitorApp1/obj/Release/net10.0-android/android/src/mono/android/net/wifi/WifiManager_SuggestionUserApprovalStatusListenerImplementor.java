package mono.android.net.wifi;


public class WifiManager_SuggestionUserApprovalStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.WifiManager.SuggestionUserApprovalStatusListener
{

	public WifiManager_SuggestionUserApprovalStatusListenerImplementor ()
	{
		super ();
		if (getClass () == WifiManager_SuggestionUserApprovalStatusListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.WifiManager+ISuggestionUserApprovalStatusListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onUserApprovalStatusChange (int p0)
	{
		n_onUserApprovalStatusChange (p0);
	}

	private native void n_onUserApprovalStatusChange (int p0);

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
