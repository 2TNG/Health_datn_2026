package mono.android.view;


public class WindowInsetsAnimationControlListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.WindowInsetsAnimationControlListener
{

	public WindowInsetsAnimationControlListenerImplementor ()
	{
		super ();
		if (getClass () == WindowInsetsAnimationControlListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.IWindowInsetsAnimationControlListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onCancelled (android.view.WindowInsetsAnimationController p0)
	{
		n_onCancelled (p0);
	}

	private native void n_onCancelled (android.view.WindowInsetsAnimationController p0);

	public void onFinished (android.view.WindowInsetsAnimationController p0)
	{
		n_onFinished (p0);
	}

	private native void n_onFinished (android.view.WindowInsetsAnimationController p0);

	public void onReady (android.view.WindowInsetsAnimationController p0, int p1)
	{
		n_onReady (p0, p1);
	}

	private native void n_onReady (android.view.WindowInsetsAnimationController p0, int p1);

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
