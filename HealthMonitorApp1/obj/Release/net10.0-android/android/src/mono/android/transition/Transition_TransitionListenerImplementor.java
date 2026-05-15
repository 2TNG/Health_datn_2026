package mono.android.transition;


public class Transition_TransitionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.transition.Transition.TransitionListener
{

	public Transition_TransitionListenerImplementor ()
	{
		super ();
		if (getClass () == Transition_TransitionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Transitions.Transition+ITransitionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTransitionCancel (android.transition.Transition p0)
	{
		n_onTransitionCancel (p0);
	}

	private native void n_onTransitionCancel (android.transition.Transition p0);

	public void onTransitionEnd (android.transition.Transition p0)
	{
		n_onTransitionEnd (p0);
	}

	private native void n_onTransitionEnd (android.transition.Transition p0);

	public void onTransitionPause (android.transition.Transition p0)
	{
		n_onTransitionPause (p0);
	}

	private native void n_onTransitionPause (android.transition.Transition p0);

	public void onTransitionResume (android.transition.Transition p0)
	{
		n_onTransitionResume (p0);
	}

	private native void n_onTransitionResume (android.transition.Transition p0);

	public void onTransitionStart (android.transition.Transition p0)
	{
		n_onTransitionStart (p0);
	}

	private native void n_onTransitionStart (android.transition.Transition p0);

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
