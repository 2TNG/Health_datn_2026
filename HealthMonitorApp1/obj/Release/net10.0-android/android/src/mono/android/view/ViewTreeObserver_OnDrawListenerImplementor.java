package mono.android.view;


public class ViewTreeObserver_OnDrawListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnDrawListener
{

	public ViewTreeObserver_OnDrawListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnDrawListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnDrawListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDraw ()
	{
		n_onDraw ();
	}

	private native void n_onDraw ();

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
