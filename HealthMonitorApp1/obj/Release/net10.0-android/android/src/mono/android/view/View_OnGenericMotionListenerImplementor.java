package mono.android.view;


public class View_OnGenericMotionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnGenericMotionListener
{

	public View_OnGenericMotionListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnGenericMotionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnGenericMotionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onGenericMotion (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onGenericMotion (p0, p1);
	}

	private native boolean n_onGenericMotion (android.view.View p0, android.view.MotionEvent p1);

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
