package mono.androidx.core.view;


public class MenuItemCompat_OnActionExpandListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.MenuItemCompat.OnActionExpandListener
{

	public MenuItemCompat_OnActionExpandListenerImplementor ()
	{
		super ();
		if (getClass () == MenuItemCompat_OnActionExpandListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.MenuItemCompat+IOnActionExpandListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onMenuItemActionCollapse (android.view.MenuItem p0)
	{
		return n_onMenuItemActionCollapse (p0);
	}

	private native boolean n_onMenuItemActionCollapse (android.view.MenuItem p0);

	public boolean onMenuItemActionExpand (android.view.MenuItem p0)
	{
		return n_onMenuItemActionExpand (p0);
	}

	private native boolean n_onMenuItemActionExpand (android.view.MenuItem p0);

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
