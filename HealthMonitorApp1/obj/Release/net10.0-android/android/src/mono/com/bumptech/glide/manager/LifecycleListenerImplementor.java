package mono.com.bumptech.glide.manager;


public class LifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.bumptech.glide.manager.LifecycleListener
{

	public LifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == LifecycleListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Bumptech.Glide.Manager.ILifecycleListenerImplementor, Xamarin.Android.Glide", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();

	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();

	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

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
