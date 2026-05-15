package mono.com.google.android.material.behavior;


public class HideBottomViewOnScrollBehavior_OnScrollStateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener
{

	public HideBottomViewOnScrollBehavior_OnScrollStateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == HideBottomViewOnScrollBehavior_OnScrollStateChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Behavior.HideBottomViewOnScrollBehavior+IOnScrollStateChangedListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onStateChanged (android.view.View p0, int p1)
	{
		n_onStateChanged (p0, p1);
	}

	private native void n_onStateChanged (android.view.View p0, int p1);

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
