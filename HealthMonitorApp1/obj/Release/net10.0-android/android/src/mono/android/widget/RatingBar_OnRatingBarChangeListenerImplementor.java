package mono.android.widget;


public class RatingBar_OnRatingBarChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.RatingBar.OnRatingBarChangeListener
{

	public RatingBar_OnRatingBarChangeListenerImplementor ()
	{
		super ();
		if (getClass () == RatingBar_OnRatingBarChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.RatingBar+IOnRatingBarChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRatingChanged (android.widget.RatingBar p0, float p1, boolean p2)
	{
		n_onRatingChanged (p0, p1, p2);
	}

	private native void n_onRatingChanged (android.widget.RatingBar p0, float p1, boolean p2);

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
