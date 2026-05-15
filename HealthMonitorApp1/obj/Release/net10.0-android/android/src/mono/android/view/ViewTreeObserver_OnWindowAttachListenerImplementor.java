package mono.android.view;


public class ViewTreeObserver_OnWindowAttachListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnWindowAttachListener
{

	public ViewTreeObserver_OnWindowAttachListenerImplementor ()
	{
		super ();
		if (getClass () == ViewTreeObserver_OnWindowAttachListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserver+IOnWindowAttachListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onWindowAttached ()
	{
		n_onWindowAttached ();
	}

	private native void n_onWindowAttached ();

	public void onWindowDetached ()
	{
		n_onWindowDetached ();
	}

	private native void n_onWindowDetached ();

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
