package mono.android.view;


public class WindowInsetsController_OnControllableInsetsChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.WindowInsetsController.OnControllableInsetsChangedListener
{

	public WindowInsetsController_OnControllableInsetsChangedListenerImplementor ()
	{
		super ();
		if (getClass () == WindowInsetsController_OnControllableInsetsChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.IWindowInsetsController+IOnControllableInsetsChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onControllableInsetsChanged (android.view.WindowInsetsController p0, int p1)
	{
		n_onControllableInsetsChanged (p0, p1);
	}

	private native void n_onControllableInsetsChanged (android.view.WindowInsetsController p0, int p1);

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
