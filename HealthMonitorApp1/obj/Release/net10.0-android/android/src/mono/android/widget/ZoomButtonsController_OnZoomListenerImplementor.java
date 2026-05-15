package mono.android.widget;


public class ZoomButtonsController_OnZoomListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ZoomButtonsController.OnZoomListener
{

	public ZoomButtonsController_OnZoomListenerImplementor ()
	{
		super ();
		if (getClass () == ZoomButtonsController_OnZoomListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ZoomButtonsController+IOnZoomListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onVisibilityChanged (boolean p0)
	{
		n_onVisibilityChanged (p0);
	}

	private native void n_onVisibilityChanged (boolean p0);

	public void onZoom (boolean p0)
	{
		n_onZoom (p0);
	}

	private native void n_onZoom (boolean p0);

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
