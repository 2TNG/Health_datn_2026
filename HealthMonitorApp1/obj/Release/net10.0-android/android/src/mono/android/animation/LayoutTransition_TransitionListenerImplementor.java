package mono.android.animation;


public class LayoutTransition_TransitionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.LayoutTransition.TransitionListener
{

	public LayoutTransition_TransitionListenerImplementor ()
	{
		super ();
		if (getClass () == LayoutTransition_TransitionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.LayoutTransition+ITransitionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void endTransition (android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3)
	{
		n_endTransition (p0, p1, p2, p3);
	}

	private native void n_endTransition (android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);

	public void startTransition (android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3)
	{
		n_startTransition (p0, p1, p2, p3);
	}

	private native void n_startTransition (android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);

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
