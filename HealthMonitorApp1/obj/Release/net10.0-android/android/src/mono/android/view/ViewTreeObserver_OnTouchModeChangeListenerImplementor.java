package mono.android.view;


public class ViewTreeObserver_OnTouchModeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnTouchModeChangeListener
{

	public ViewTreeObserver_OnTouchModeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnTouchModeChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnTouchModeChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTouchModeChanged (boolean p0)
	{
		n_onTouchModeChanged (p0);
	}

	private native void n_onTouchModeChanged (boolean p0);

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
