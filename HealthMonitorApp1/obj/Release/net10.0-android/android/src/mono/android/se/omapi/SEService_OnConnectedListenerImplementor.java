package mono.android.se.omapi;


public class SEService_OnConnectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.se.omapi.SEService.OnConnectedListener
{

	public SEService_OnConnectedListenerImplementor ()
	{
		super ();
		if (getClass () == SEService_OnConnectedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.SE.Omapi.SEService+IOnConnectedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onConnected ()
	{
		n_onConnected ();
	}

	private native void n_onConnected ();

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
