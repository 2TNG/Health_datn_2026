package mono.android.widget;


public class SlidingDrawer_OnDrawerOpenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.SlidingDrawer.OnDrawerOpenListener
{

	public SlidingDrawer_OnDrawerOpenListenerImplementor ()
	{
		super ();
		if (getClass () == SlidingDrawer_OnDrawerOpenListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.SlidingDrawer+IOnDrawerOpenListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDrawerOpened ()
	{
		n_onDrawerOpened ();
	}

	private native void n_onDrawerOpened ();

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
