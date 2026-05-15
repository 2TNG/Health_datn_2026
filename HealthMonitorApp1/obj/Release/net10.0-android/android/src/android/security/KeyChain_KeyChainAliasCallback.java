package android.security;


public class KeyChain_KeyChainAliasCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.security.KeyChainAliasCallback
{

	public KeyChain_KeyChainAliasCallback ()
	{
		super ();
		if (getClass () == KeyChain_KeyChainAliasCallback.class) {
			mono.android.TypeManager.Activate ("Android.Security.KeyChain+KeyChainAliasCallback, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void alias (java.lang.String p0)
	{
		n_alias (p0);
	}

	private native void n_alias (java.lang.String p0);

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
