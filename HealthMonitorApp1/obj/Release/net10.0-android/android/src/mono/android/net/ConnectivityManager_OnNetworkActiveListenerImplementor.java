package mono.android.net;


public class ConnectivityManager_OnNetworkActiveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.ConnectivityManager.OnNetworkActiveListener
{

	public ConnectivityManager_OnNetworkActiveListenerImplementor ()
	{
		super ();
		if (getClass () == ConnectivityManager_OnNetworkActiveListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.ConnectivityManager+IOnNetworkActiveListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onNetworkActive ()
	{
		n_onNetworkActive ();
	}

	private native void n_onNetworkActive ();

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
