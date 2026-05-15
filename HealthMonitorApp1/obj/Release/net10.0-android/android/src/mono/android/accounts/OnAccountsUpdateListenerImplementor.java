package mono.android.accounts;


public class OnAccountsUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.accounts.OnAccountsUpdateListener
{

	public OnAccountsUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == OnAccountsUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Accounts.IOnAccountsUpdateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAccountsUpdated (android.accounts.Account[] p0)
	{
		n_onAccountsUpdated (p0);
	}

	private native void n_onAccountsUpdated (android.accounts.Account[] p0);

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
