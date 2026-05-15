package mono.android.app;


public class WallpaperManager_OnColorsChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.WallpaperManager.OnColorsChangedListener
{

	public WallpaperManager_OnColorsChangedListenerImplementor ()
	{
		super ();
		if (getClass () == WallpaperManager_OnColorsChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.WallpaperManager+IOnColorsChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onColorsChanged (android.app.WallpaperColors p0, int p1)
	{
		n_onColorsChanged (p0, p1);
	}

	private native void n_onColorsChanged (android.app.WallpaperColors p0, int p1);

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
