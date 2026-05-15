package mono.android.gesture;


public class GestureOverlayView_OnGesturePerformedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.gesture.GestureOverlayView.OnGesturePerformedListener
{

	public GestureOverlayView_OnGesturePerformedListenerImplementor ()
	{
		super ();
		if (getClass () == GestureOverlayView_OnGesturePerformedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Gestures.GestureOverlayView+IOnGesturePerformedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGesturePerformed (android.gesture.GestureOverlayView p0, android.gesture.Gesture p1)
	{
		n_onGesturePerformed (p0, p1);
	}

	private native void n_onGesturePerformed (android.gesture.GestureOverlayView p0, android.gesture.Gesture p1);

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
