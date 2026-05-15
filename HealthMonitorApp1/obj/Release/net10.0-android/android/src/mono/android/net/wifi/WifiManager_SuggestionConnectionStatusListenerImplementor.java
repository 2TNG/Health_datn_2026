package mono.android.net.wifi;


public class WifiManager_SuggestionConnectionStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.wifi.WifiManager.SuggestionConnectionStatusListener
{

	public WifiManager_SuggestionConnectionStatusListenerImplementor ()
	{
		super ();
		if (getClass () == WifiManager_SuggestionConnectionStatusListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Wifi.WifiManager+ISuggestionConnectionStatusListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onConnectionStatus (android.net.wifi.WifiNetworkSuggestion p0, int p1)
	{
		n_onConnectionStatus (p0, p1);
	}

	private native void n_onConnectionStatus (android.net.wifi.WifiNetworkSuggestion p0, int p1);

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
