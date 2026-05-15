package mono.android.net.wifi.p2p;


public class WifiP2pManager_DeviceInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
{

	public WifiP2pManager_DeviceInfoListenerImplementor ()
	{
		super ();
		if (getClass () == WifiP2pManager_DeviceInfoListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.P2p.WifiP2pManager+IDeviceInfoListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDeviceInfoAvailable (android.net.wifi.p2p.WifiP2pDevice p0)
	{
		n_onDeviceInfoAvailable (p0);
	}

	private native void n_onDeviceInfoAvailable (android.net.wifi.p2p.WifiP2pDevice p0);

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
