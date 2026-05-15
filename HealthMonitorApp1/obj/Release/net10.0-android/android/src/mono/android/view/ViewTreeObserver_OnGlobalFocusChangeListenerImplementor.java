package mono.android.view;


public class ViewTreeObserver_OnGlobalFocusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{

	public ViewTreeObserver_OnGlobalFocusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnGlobalFocusChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnGlobalFocusChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGlobalFocusChanged (android.view.View p0, android.view.View p1)
	{
		n_onGlobalFocusChanged (p0, p1);
	}

	private native void n_onGlobalFocusChanged (android.view.View p0, android.view.View p1);

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
