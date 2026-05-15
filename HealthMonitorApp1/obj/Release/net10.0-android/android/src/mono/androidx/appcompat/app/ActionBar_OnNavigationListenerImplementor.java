package mono.androidx.appcompat.app;


public class ActionBar_OnNavigationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.app.ActionBar.OnNavigationListener
{

	public ActionBar_OnNavigationListenerImplementor ()
	{
		super ();
		if (getClass () == ActionBar_OnNavigationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.App.ActionBar+IOnNavigationListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onNavigationItemSelected (int p0, long p1)
	{
		return n_onNavigationItemSelected (p0, p1);
	}

	private native boolean n_onNavigationItemSelected (int p0, long p1);

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
