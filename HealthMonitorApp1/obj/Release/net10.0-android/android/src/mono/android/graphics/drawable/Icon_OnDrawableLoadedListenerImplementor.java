package mono.android.graphics.drawable;


public class Icon_OnDrawableLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.graphics.drawable.Icon.OnDrawableLoadedListener
{

	public Icon_OnDrawableLoadedListenerImplementor ()
	{
		super ();
		if (getClass () == Icon_OnDrawableLoadedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Graphics.Drawables.Icon+IOnDrawableLoadedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDrawableLoaded (android.graphics.drawable.Drawable p0)
	{
		n_onDrawableLoaded (p0);
	}

	private native void n_onDrawableLoaded (android.graphics.drawable.Drawable p0);

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
