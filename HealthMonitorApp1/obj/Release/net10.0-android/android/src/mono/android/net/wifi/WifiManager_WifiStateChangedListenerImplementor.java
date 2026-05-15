package mono.android.net.wifi;


public class WifiManager_WifiStateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.WifiManager.WifiStateChangedListener
{

	public WifiManager_WifiStateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == WifiManager_WifiStateChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.WifiManager+IWifiStateChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onWifiStateChanged ()
	{
		n_onWifiStateChanged ();
	}

	private native void n_onWifiStateChanged ();

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
