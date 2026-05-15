package mono.androidx.appcompat.widget;


public class MenuItemHoverListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.MenuItemHoverListener
{

	public MenuItemHoverListenerImplementor ()
	{
		super ();
		if (getClass () == MenuItemHoverListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.IMenuItemHoverListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new java.lang.Object[] {  });
		}
	}

	public void onItemHoverEnter (androidx.appcompat.view.menu.MenuBuilder p0, android.view.MenuItem p1)
	{
		n_onItemHoverEnter (p0, p1);
	}

	private native void n_onItemHoverEnter (androidx.appcompat.view.menu.MenuBuilder p0, android.view.MenuItem p1);

	public void onItemHoverExit (androidx.appcompat.view.menu.MenuBuilder p0, android.view.MenuItem p1)
	{
		n_onItemHoverExit (p0, p1);
	}

	private native void n_onItemHoverExit (androidx.appcompat.view.menu.MenuBuilder p0, android.view.MenuItem p1);

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
