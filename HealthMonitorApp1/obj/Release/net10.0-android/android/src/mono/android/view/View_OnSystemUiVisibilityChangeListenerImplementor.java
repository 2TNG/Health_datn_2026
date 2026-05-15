package mono.android.view;


public class View_OnSystemUiVisibilityChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnSystemUiVisibilityChangeListener
{

	public View_OnSystemUiVisibilityChangeListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnSystemUiVisibilityChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnSystemUiVisibilityChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSystemUiVisibilityChange (int p0)
	{
		n_onSystemUiVisibilityChange (p0);
	}

	private native void n_onSystemUiVisibilityChange (int p0);

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
