package mono.android.view;


public class GestureDetector_OnDoubleTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.GestureDetector.OnDoubleTapListener
{

	public GestureDetector_OnDoubleTapListenerImplementor ()
	{
		super ();
		if (getClass () == GestureDetector_OnDoubleTapListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.GestureDetector+IOnDoubleTapListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onDoubleTap (android.view.MotionEvent p0)
	{
		return n_onDoubleTap (p0);
	}

	private native boolean n_onDoubleTap (android.view.MotionEvent p0);

	public boolean onDoubleTapEvent (android.view.MotionEvent p0)
	{
		return n_onDoubleTapEvent (p0);
	}

	private native boolean n_onDoubleTapEvent (android.view.MotionEvent p0);

	public boolean onSingleTapConfirmed (android.view.MotionEvent p0)
	{
		return n_onSingleTapConfirmed (p0);
	}

	private native boolean n_onSingleTapConfirmed (android.view.MotionEvent p0);

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
