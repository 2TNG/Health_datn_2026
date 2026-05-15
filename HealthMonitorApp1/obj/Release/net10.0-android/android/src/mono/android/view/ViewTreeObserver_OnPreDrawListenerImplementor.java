package mono.android.view;


public class ViewTreeObserver_OnPreDrawListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnPreDrawListener
{

	public ViewTreeObserver_OnPreDrawListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnPreDrawListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnPreDrawListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onPreDraw ()
	{
		return n_onPreDraw ();
	}

	private native boolean n_onPreDraw ();

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
