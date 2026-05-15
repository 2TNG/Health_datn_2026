package mono.android.widget;


public class SlidingDrawer_OnDrawerScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.SlidingDrawer.OnDrawerScrollListener
{

	public SlidingDrawer_OnDrawerScrollListenerImplementor ()
	{
		super ();
		if (getClass () == SlidingDrawer_OnDrawerScrollListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.SlidingDrawer+IOnDrawerScrollListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollEnded ()
	{
		n_onScrollEnded ();
	}

	private native void n_onScrollEnded ();

	public void onScrollStarted ()
	{
		n_onScrollStarted ();
	}

	private native void n_onScrollStarted ();

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
