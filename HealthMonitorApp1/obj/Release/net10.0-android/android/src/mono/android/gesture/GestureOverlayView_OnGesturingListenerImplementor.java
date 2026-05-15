package mono.android.gesture;


public class GestureOverlayView_OnGesturingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.gesture.GestureOverlayView.OnGesturingListener
{

	public GestureOverlayView_OnGesturingListenerImplementor ()
	{
		super ();
		if (getClass () == GestureOverlayView_OnGesturingListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Gestures.GestureOverlayView+IOnGesturingListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGesturingEnded (android.gesture.GestureOverlayView p0)
	{
		n_onGesturingEnded (p0);
	}

	private native void n_onGesturingEnded (android.gesture.GestureOverlayView p0);

	public void onGesturingStarted (android.gesture.GestureOverlayView p0)
	{
		n_onGesturingStarted (p0);
	}

	private native void n_onGesturingStarted (android.gesture.GestureOverlayView p0);

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
