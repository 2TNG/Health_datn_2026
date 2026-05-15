package mono.android.animation;


public class ValueAnimator_DurationScaleChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.ValueAnimator.DurationScaleChangeListener
{

	public ValueAnimator_DurationScaleChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ValueAnimator_DurationScaleChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.ValueAnimator+IDurationScaleChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChanged (float p0)
	{
		n_onChanged (p0);
	}

	private native void n_onChanged (float p0);

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
