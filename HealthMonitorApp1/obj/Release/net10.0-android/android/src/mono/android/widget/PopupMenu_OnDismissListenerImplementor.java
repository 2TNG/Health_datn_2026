package mono.android.widget;


public class PopupMenu_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.PopupMenu.OnDismissListener
{

	public PopupMenu_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == PopupMenu_OnDismissListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.PopupMenu+IOnDismissListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDismiss (android.widget.PopupMenu p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.widget.PopupMenu p0);

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
