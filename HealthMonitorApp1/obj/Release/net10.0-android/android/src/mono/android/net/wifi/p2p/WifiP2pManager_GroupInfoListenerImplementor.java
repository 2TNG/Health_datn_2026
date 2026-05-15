package mono.android.net.wifi.p2p;


public class WifiP2pManager_GroupInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
{

	public WifiP2pManager_GroupInfoListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_GroupInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IGroupInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGroupInfoAvailable (android.net.wifi.p2p.WifiP2pGroup p0)
	{
		n_onGroupInfoAvailable (p0);
	}

	private native void n_onGroupInfoAvailable (android.net.wifi.p2p.WifiP2pGroup p0);

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
