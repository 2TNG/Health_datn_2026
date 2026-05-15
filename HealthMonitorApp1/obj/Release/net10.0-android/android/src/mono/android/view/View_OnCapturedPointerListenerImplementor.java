package mono.android.view;


public class View_OnCapturedPointerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnCapturedPointerListener
{

	public View_OnCapturedPointerListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnCapturedPointerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnCapturedPointerListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onCapturedPointer (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onCapturedPointer (p0, p1);
	}

	private native boolean n_onCapturedPointer (android.view.View p0, android.view.MotionEvent p1);

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
