package crc64a25b61d9f8ee364f;


public class RectEvaluator
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.TypeEvaluator
{

	public RectEvaluator ()
	{
		super ();
		if (getClass () == RectEvaluator.class) {
			mono.android.TypeManager.Activate ("AndroidX.Transitions.RectEvaluator, Xamarin.AndroidX.Transition", "", this, new java.lang.Object[] {  });
		}
	}

	public java.lang.Object evaluate (float p0, java.lang.Object p1, java.lang.Object p2)
	{
		return n_evaluate (p0, p1, p2);
	}

	private native java.lang.Object n_evaluate (float p0, java.lang.Object p1, java.lang.Object p2);

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
