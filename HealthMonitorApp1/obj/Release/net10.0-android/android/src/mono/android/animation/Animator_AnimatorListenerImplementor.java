package mono.android.animation;


public class Animator_AnimatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.Animator.AnimatorListener
{

	public Animator_AnimatorListenerImplementor ()
	{
		super ();
		if (getClass () == Animator_AnimatorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.Animator+IAnimatorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAnimationCancel (android.animation.Animator p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.animation.Animator p0);

	public void onAnimationEnd (android.animation.Animator p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.animation.Animator p0);

	public void onAnimationRepeat (android.animation.Animator p0)
	{
		n_onAnimationRepeat (p0);
	}

	private native void n_onAnimationRepeat (android.animation.Animator p0);

	public void onAnimationStart (android.animation.Animator p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.animation.Animator p0);

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
