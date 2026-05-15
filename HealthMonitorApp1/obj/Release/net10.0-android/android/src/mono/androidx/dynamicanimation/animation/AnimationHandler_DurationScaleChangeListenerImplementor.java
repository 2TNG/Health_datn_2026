package mono.androidx.dynamicanimation.animation;


public class AnimationHandler_DurationScaleChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.dynamicanimation.animation.AnimationHandler.DurationScaleChangeListener
{

	public AnimationHandler_DurationScaleChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AnimationHandler_DurationScaleChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.DynamicAnimation.AnimationHandler+IDurationScaleChangeListenerImplementor, Xamarin.AndroidX.DynamicAnimation", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean register ()
	{
		return n_register ();
	}

	private native boolean n_register ();

	public boolean unregister ()
	{
		return n_unregister ();
	}

	private native boolean n_unregister ();

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
