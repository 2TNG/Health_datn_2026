package mono.androidx.core.view;


public class ViewPropertyAnimatorUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.ViewPropertyAnimatorUpdateListener
{

	public ViewPropertyAnimatorUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == ViewPropertyAnimatorUpdateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.IViewPropertyAnimatorUpdateListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationUpdate (android.view.View p0)
	{
		n_onAnimationUpdate (p0);
	}

	private native void n_onAnimationUpdate (android.view.View p0);

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
