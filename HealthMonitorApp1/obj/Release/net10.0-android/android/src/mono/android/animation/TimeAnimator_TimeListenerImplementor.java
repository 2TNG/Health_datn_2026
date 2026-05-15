package mono.android.animation;


public class TimeAnimator_TimeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.TimeAnimator.TimeListener
{

	public TimeAnimator_TimeListenerImplementor ()
	{
		super ();
		if (getClass () == TimeAnimator_TimeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Animation.TimeAnimator+ITimeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTimeUpdate (android.animation.TimeAnimator p0, long p1, long p2)
	{
		n_onTimeUpdate (p0, p1, p2);
	}

	private native void n_onTimeUpdate (android.animation.TimeAnimator p0, long p1, long p2);

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
