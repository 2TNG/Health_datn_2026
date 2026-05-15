package mono.android.widget;


public class SlidingDrawer_OnDrawerCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.SlidingDrawer.OnDrawerCloseListener
{

	public SlidingDrawer_OnDrawerCloseListenerImplementor ()
	{
		super ();
		if (getClass () == SlidingDrawer_OnDrawerCloseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.SlidingDrawer+IOnDrawerCloseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDrawerClosed ()
	{
		n_onDrawerClosed ();
	}

	private native void n_onDrawerClosed ();

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
