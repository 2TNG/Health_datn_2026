package mono.androidx.core.view;


public class ViewPropertyAnimatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.ViewPropertyAnimatorListener
{

	public ViewPropertyAnimatorListenerImplementor ()
	{
		super ();
		if (getClass () == ViewPropertyAnimatorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.IViewPropertyAnimatorListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationCancel (android.view.View p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.view.View p0);

	public void onAnimationEnd (android.view.View p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.View p0);

	public void onAnimationStart (android.view.View p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.View p0);

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
