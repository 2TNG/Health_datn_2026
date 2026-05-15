package mono.android.view;


public class GestureDetector_OnContextClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.GestureDetector.OnContextClickListener
{

	public GestureDetector_OnContextClickListenerImplementor ()
	{
		super ();
		if (getClass () == GestureDetector_OnContextClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.GestureDetector+IOnContextClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onContextClick (android.view.MotionEvent p0)
	{
		return n_onContextClick (p0);
	}

	private native boolean n_onContextClick (android.view.MotionEvent p0);

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
