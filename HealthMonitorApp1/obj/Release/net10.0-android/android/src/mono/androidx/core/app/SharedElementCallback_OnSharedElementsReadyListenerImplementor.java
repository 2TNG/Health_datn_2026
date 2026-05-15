package mono.androidx.core.app;


public class SharedElementCallback_OnSharedElementsReadyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
{

	public SharedElementCallback_OnSharedElementsReadyListenerImplementor ()
	{
		super ();
		if (getClass () == SharedElementCallback_OnSharedElementsReadyListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.App.SharedElementCallback+IOnSharedElementsReadyListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSharedElementsReady ()
	{
		n_onSharedElementsReady ();
	}

	private native void n_onSharedElementsReady ();

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
