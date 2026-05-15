package mono.android.net.wifi.p2p;


public class WifiP2pManager_ActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.ActionListener
{

	public WifiP2pManager_ActionListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_ActionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IActionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFailure (int p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (int p0);

	public void onSuccess ()
	{
		n_onSuccess ();
	}

	private native void n_onSuccess ();

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
