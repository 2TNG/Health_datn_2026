package mono.android.widget;


public class ActionMenuView_OnMenuItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ActionMenuView.OnMenuItemClickListener
{

	public ActionMenuView_OnMenuItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == ActionMenuView_OnMenuItemClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ActionMenuView+IOnMenuItemClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onMenuItemClick (android.view.MenuItem p0)
	{
		return n_onMenuItemClick (p0);
	}

	private native boolean n_onMenuItemClick (android.view.MenuItem p0);

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
