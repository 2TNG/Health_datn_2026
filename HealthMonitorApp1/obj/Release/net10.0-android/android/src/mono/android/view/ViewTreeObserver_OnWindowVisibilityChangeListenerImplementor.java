package mono.android.view;


public class ViewTreeObserver_OnWindowVisibilityChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
{

	public ViewTreeObserver_OnWindowVisibilityChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnWindowVisibilityChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnWindowVisibilityChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onWindowVisibilityChanged (int p0)
	{
		n_onWindowVisibilityChanged (p0);
	}

	private native void n_onWindowVisibilityChanged (int p0);

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
