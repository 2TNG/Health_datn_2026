package mono.androidx.customview.poolingcontainer;


public class PoolingContainerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.customview.poolingcontainer.PoolingContainerListener
{

	public PoolingContainerListenerImplementor ()
	{
		super ();
		if (getClass () == PoolingContainerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.CustomView.PoolingContainer.IPoolingContainerListenerImplementor, Xamarin.AndroidX.CustomView.PoolingContainer", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRelease ()
	{
		n_onRelease ();
	}

	private native void n_onRelease ();

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
