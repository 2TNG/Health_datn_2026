package mono.com.google.android.material.carousel;


public class OnMaskChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.carousel.OnMaskChangedListener
{

	public OnMaskChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnMaskChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Carousel.IOnMaskChangedListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMaskChanged (android.graphics.RectF p0)
	{
		n_onMaskChanged (p0);
	}

	private native void n_onMaskChanged (android.graphics.RectF p0);

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
