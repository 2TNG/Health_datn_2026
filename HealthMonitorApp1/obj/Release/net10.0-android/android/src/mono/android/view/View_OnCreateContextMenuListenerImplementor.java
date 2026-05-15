package mono.android.view;


public class View_OnCreateContextMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnCreateContextMenuListener
{

	public View_OnCreateContextMenuListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnCreateContextMenuListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnCreateContextMenuListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCreateContextMenu (android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2)
	{
		n_onCreateContextMenu (p0, p1, p2);
	}

	private native void n_onCreateContextMenu (android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2);

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
