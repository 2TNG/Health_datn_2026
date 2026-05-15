package mono.android.view;


public class View_OnUnhandledKeyEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnUnhandledKeyEventListener
{

	public View_OnUnhandledKeyEventListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnUnhandledKeyEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnUnhandledKeyEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onUnhandledKeyEvent (android.view.View p0, android.view.KeyEvent p1)
	{
		return n_onUnhandledKeyEvent (p0, p1);
	}

	private native boolean n_onUnhandledKeyEvent (android.view.View p0, android.view.KeyEvent p1);

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
