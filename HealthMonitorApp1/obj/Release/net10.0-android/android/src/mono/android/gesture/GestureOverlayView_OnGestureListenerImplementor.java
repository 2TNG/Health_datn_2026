package mono.android.gesture;


public class GestureOverlayView_OnGestureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.gesture.GestureOverlayView.OnGestureListener
{

	public GestureOverlayView_OnGestureListenerImplementor ()
	{
		super ();
		if (getClass () == GestureOverlayView_OnGestureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Gestures.GestureOverlayView+IOnGestureListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGesture (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1)
	{
		n_onGesture (p0, p1);
	}

	private native void n_onGesture (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);

	public void onGestureCancelled (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1)
	{
		n_onGestureCancelled (p0, p1);
	}

	private native void n_onGestureCancelled (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);

	public void onGestureEnded (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1)
	{
		n_onGestureEnded (p0, p1);
	}

	private native void n_onGestureEnded (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);

	public void onGestureStarted (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1)
	{
		n_onGestureStarted (p0, p1);
	}

	private native void n_onGestureStarted (android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);

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
