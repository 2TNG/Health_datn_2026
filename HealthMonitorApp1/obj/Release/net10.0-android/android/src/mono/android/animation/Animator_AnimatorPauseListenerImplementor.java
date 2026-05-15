package mono.android.animation;


public class Animator_AnimatorPauseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.Animator.AnimatorPauseListener
{

	public Animator_AnimatorPauseListenerImplementor ()
	{
		super ();
		if (getClass () == Animator_AnimatorPauseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.Animator+IAnimatorPauseListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationPause (android.animation.Animator p0)
	{
		n_onAnimationPause (p0);
	}

	private native void n_onAnimationPause (android.animation.Animator p0);

	public void onAnimationResume (android.animation.Animator p0)
	{
		n_onAnimationResume (p0);
	}

	private native void n_onAnimationResume (android.animation.Animator p0);

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
