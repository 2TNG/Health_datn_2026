package mono.android.view;


public class ViewTreeObserver_OnScrollChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnScrollChangedListener
{

	public ViewTreeObserver_OnScrollChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnScrollChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnScrollChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onScrollChanged ()
	{
		n_onScrollChanged ();
	}

	private native void n_onScrollChanged ();

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
