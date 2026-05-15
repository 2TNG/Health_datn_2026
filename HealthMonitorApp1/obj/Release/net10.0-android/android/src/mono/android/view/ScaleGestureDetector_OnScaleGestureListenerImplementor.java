package mono.android.view;


public class ScaleGestureDetector_OnScaleGestureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ScaleGestureDetector.OnScaleGestureListener
{

	public ScaleGestureDetector_OnScaleGestureListenerImplementor ()
	{
		super ();
		if (getClass () == ScaleGestureDetector_OnScaleGestureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ScaleGestureDetector+IOnScaleGestureListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onScale (android.view.ScaleGestureDetector p0)
	{
		return n_onScale (p0);
	}

	private native boolean n_onScale (android.view.ScaleGestureDetector p0);

	public boolean onScaleBegin (android.view.ScaleGestureDetector p0)
	{
		return n_onScaleBegin (p0);
	}

	private native boolean n_onScaleBegin (android.view.ScaleGestureDetector p0);

	public void onScaleEnd (android.view.ScaleGestureDetector p0)
	{
		n_onScaleEnd (p0);
	}

	private native void n_onScaleEnd (android.view.ScaleGestureDetector p0);

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
