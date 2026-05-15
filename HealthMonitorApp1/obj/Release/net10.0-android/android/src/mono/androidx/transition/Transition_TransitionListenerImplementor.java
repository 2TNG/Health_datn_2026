package mono.androidx.transition;


public class Transition_TransitionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.transition.Transition.TransitionListener
{

	public Transition_TransitionListenerImplementor ()
	{
		super ();
		if (getClass () == Transition_TransitionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Transitions.Transition+ITransitionListenerImplementor, Xamarin.AndroidX.Transition", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTransitionCancel (androidx.transition.Transition p0)
	{
		n_onTransitionCancel (p0);
	}

	private native void n_onTransitionCancel (androidx.transition.Transition p0);

	public void onTransitionEnd (androidx.transition.Transition p0)
	{
		n_onTransitionEnd (p0);
	}

	private native void n_onTransitionEnd (androidx.transition.Transition p0);

	public void onTransitionPause (androidx.transition.Transition p0)
	{
		n_onTransitionPause (p0);
	}

	private native void n_onTransitionPause (androidx.transition.Transition p0);

	public void onTransitionResume (androidx.transition.Transition p0)
	{
		n_onTransitionResume (p0);
	}

	private native void n_onTransitionResume (androidx.transition.Transition p0);

	public void onTransitionStart (androidx.transition.Transition p0)
	{
		n_onTransitionStart (p0);
	}

	private native void n_onTransitionStart (androidx.transition.Transition p0);

	public void onTransitionEnd (androidx.transition.Transition p0, boolean p1)
	{
		n_onTransitionEnd (p0, p1);
	}

	private native void n_onTransitionEnd (androidx.transition.Transition p0, boolean p1);

	public void onTransitionStart (androidx.transition.Transition p0, boolean p1)
	{
		n_onTransitionStart (p0, p1);
	}

	private native void n_onTransitionStart (androidx.transition.Transition p0, boolean p1);

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
